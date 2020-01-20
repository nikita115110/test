package Magazine.DataBase;


import Magazine.Entity.Item;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface ItemRepository extends CrudRepository<Item,Integer> {

    List<Item>findBycompany(String company);

    List<Item>findBytype(byte type);



}
