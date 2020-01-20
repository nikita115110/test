package Magazine.Controllers;

import Magazine.Entity.Item;

import Magazine.Entity.OrderUser;
import Magazine.Entity.SelectedItem;
import Magazine.Entity.Ussser;
import Magazine.Modules.Data;
import Magazine.Modules.DataMeneger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Controller
public class GetController {

    @Autowired
    private Data data;
    @Autowired
    private DataMeneger dataMeneger;

    @GetMapping("/")
    public String getshop(Model model,Authentication authentication){
        if (authentication != null) {
            model.addAttribute("isAuthentication","true");
            System.out.println(authentication.getName());
        } else {
            model.addAttribute("isAuthentication","false");
        }
        return "base";
    }

    @GetMapping("/market")
    public String getmarket(@RequestParam byte type,@RequestParam int page, Model model,Authentication authentication){
        List<Item>items;
        items= data.ItemRepositoryFindByType(type);
        int countpages=(int) Math.ceil((page-1)*16);
        List <Item>newItems= new ArrayList<Item>();
        byte b=0;
        while (b<16){
            newItems.add(new Item());
            b++;
        }
        if(items.size()<=15){
            byte count=0;
            for(Item item:items){
                newItems.set(count, items.get(count));
                count++;
            }
        }else {
            byte count=0;
            while(count<=15){
                if(items.size()-(count + countpages)==0){
                    break;
                }
                newItems.set(count, items.get(count + countpages));
                count++;
            }
        }
        if (authentication != null) {
            List<OrderUser>orders= data.OrderRepositoryFindByUser(authentication.getName(),(byte) 1);
            int sumOrders=0;
            int quantityProducte=0;
            for (OrderUser od :orders){
                Item item=data.ItemRepositoryFindById(od.getUtemId());
                sumOrders+=item.getPrice();
                quantityProducte++;
            }
            model.addAttribute("isAuthentication","true");
            model.addAttribute("sumOrders",sumOrders);
            model.addAttribute("quantityProducte",quantityProducte);
            System.out.println(authentication.getName());
        } else {
            model.addAttribute("isAuthentication","false");
        }
        model.addAttribute("seleceteditem",new SelectedItem());
        model.addAttribute("valueItems",items.size()-((page-1)*16));
        model.addAttribute("items",newItems);
        model.addAttribute("type",type);
        model.addAttribute("cauntPage",page);
        model.addAttribute("valuePages",Math.ceil(items.size()/16));
        return "market";
    }

    @GetMapping("/personalaccount")
    public String getPersonalAccount( Model model,Authentication authentication){
        if(authentication.getName().isEmpty()){
            return "redirect:/login";
        }else {
            List<OrderUser>orders= data.OrderRepositoryFindByUser(authentication.getName(),(byte) 1);
            int sumOrders=0;
            int quantityProducte=0;
            for (OrderUser od :orders){
                Item item=data.ItemRepositoryFindById(od.getUtemId());
                sumOrders+=item.getPrice();
                quantityProducte++;
            }
            model.addAttribute("isAuthentication","true");
            model.addAttribute("sumOrders",sumOrders);
            model.addAttribute("quantityProducte",quantityProducte);
            model.addAttribute("orders",orders);
            return "personalaccount";
        }
    }


    @PostMapping("/market")
    public void addorder(@ModelAttribute SelectedItem seleceteditem,Authentication authentication, Model model){
        List<Item>items= (List<Item>) model.getAttribute("items");
        System.out.println(seleceteditem.getCount());
        System.out.println(seleceteditem.getId());
        if(seleceteditem.getCount()!=0){
            Item item=data.ItemRepositoryFindById(seleceteditem.getId());
            String username=dataMeneger.getUsersRepository().findByUsername(authentication.getName()).getUsername();
            byte b=1;
            while (b<=seleceteditem.getCount()){
                dataMeneger.getOrderRepository().save(new OrderUser(username,item.getId(),(byte) 0));
                System.out.println(new OrderUser(username,item.getId(),(byte) 0).toString());
                b++;
            }
        }else {

        }
        //return "/refresh";
    }

}
