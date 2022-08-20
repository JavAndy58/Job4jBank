package job4jbank.repository;

import job4jbank.model.User;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public class UserRepository extends Store<User> {

    public Optional<User> findByPassport(String passport) {
        return store.values().stream()
                .filter(u -> u.getPassword().equals(passport))
                .findFirst();
    }
}
