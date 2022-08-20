package job4jbank.repository;

import job4jbank.model.Account;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public class AccountRepository extends Store<Account> {

    public Optional<Account> findByRequisite(String passport, String requisite) {
        return store.values().stream()
                .filter(a -> a.getUser().getPassword().equals(passport)
                && a.getRequisite().equals(requisite))
                .findFirst();
    }
}
