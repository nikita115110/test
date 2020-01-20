package Magazine.Modules;

import Magazine.DataBase.ItemRepository;
import Magazine.DataBase.OrderRepository;
import Magazine.DataBase.RoleRepository;
import Magazine.DataBase.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DataMeneger {

    @Autowired
    private ItemRepository itemRepository;
    @Autowired
    private OrderRepository orderRepository;
    @Autowired
    private RoleRepository roleRepository;
    @Autowired
    private UsersRepository usersRepository;

    public DataMeneger() {
    }

    public ItemRepository getItemRepository() {
        return itemRepository;
    }

    public OrderRepository getOrderRepository() {
        return orderRepository;
    }

    public RoleRepository getRoleRepository() {
        return roleRepository;
    }

    public UsersRepository getUsersRepository() {
        return usersRepository;
    }
}
