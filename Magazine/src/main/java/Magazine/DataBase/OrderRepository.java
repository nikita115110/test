package Magazine.DataBase;

import Magazine.Entity.OrderUser;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface OrderRepository extends CrudRepository<OrderUser, Integer> {

    List<OrderUser>findByUserNameAndState(String Username,Byte state);



}
