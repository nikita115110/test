package Magazine.Modules;


import Magazine.Entity.Role;
import Magazine.Entity.Ussser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

@Service
public class UserService implements UserDetailsService {

    @PersistenceContext
    private EntityManager em;
    @Autowired
    private Data data;
    @Autowired
    private DataMeneger dataMeneger;
    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Ussser user = dataMeneger.getUsersRepository().findByUsername(username);
        if (user == null) {
            throw new UsernameNotFoundException("User not found");
        }
        return user;
    }

    public Ussser findUserById(Long userId) {
        Optional<Ussser> userFromDb = dataMeneger.getUsersRepository().findById(userId);
        return userFromDb.orElse(new Ussser());
    }

    public List<Ussser> allUsers() {
        return (List<Ussser>) dataMeneger.getUsersRepository().findAll();
    }

    public boolean saveUser(Ussser user) {
        Ussser userFromDB = dataMeneger.getUsersRepository().findByUsername(user.getUsername());
        if (userFromDB != null) {
            return false;
        }
        dataMeneger.getRoleRepository().save(new Role(1L, "ROLE_USER"));
        user.setRoles(Collections.singleton(new Role(1L, "ROLE_USER")));
        user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
        dataMeneger.getUsersRepository().save(user);
        return true;
    }

    public boolean deleteUser(Long userId) {
        if (dataMeneger.getUsersRepository().findById(userId).isPresent()) {
            dataMeneger.getUsersRepository().deleteById(userId);
            return true;
        }
        return false;
    }

    public List<Ussser> usergtList(Long idMin) {
        return em.createQuery("SELECT u FROM User u WHERE u.id > :paramId", Ussser.class)
                .setParameter("paramId", idMin).getResultList();
    }
}

