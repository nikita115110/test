package Magazine.DataBase;

import Magazine.Entity.Ussser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsersRepository extends JpaRepository<Ussser,Long> {

    Ussser findByUsername(String username);

}
