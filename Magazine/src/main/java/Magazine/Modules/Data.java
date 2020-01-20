package Magazine.Modules;

import Magazine.DataBase.ItemRepository;
import Magazine.DataBase.OrderRepository;
import Magazine.DataBase.UsersRepository;
import Magazine.Entity.Item;

//import Magazine.Other.MyUssserDetails;
import Magazine.Entity.OrderUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class Data {

    @Autowired
    private ItemRepository itemRepository;
    @Autowired
    private UsersRepository usersRepository;
    @Autowired
    private OrderRepository orderRepository;

    public Data( ) { }

    public void OrderRepositoryAddOrder(OrderUser order){
        orderRepository.save(order);
    }

    public Item ItemRepositoryFindById(int id){
        return itemRepository.findById(id).get();
    }

    public List<Item> ItemRepositoryFindByType(byte type){
        return itemRepository.findBytype(type);
    }

    public List<Item> ItemRepositoryFindByCompany(String company){
        return itemRepository.findBycompany(company);
    }

    public List<OrderUser> OrderRepositoryFindByUser(String username,byte state){
        return orderRepository.findByUserNameAndState(username,state);
    }


}
