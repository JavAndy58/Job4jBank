package job4jbank.service;

import job4jbank.model.Account;
import job4jbank.model.User;

import java.util.Optional;

public interface BankService {
    void addUser(User user);
    void addAccount(String passport, Account account);
    Optional<User> findByPassport(String passport);
    Optional<Account> findByRequisite(String passport, String requisite);
    boolean transferMoney(String srcPassport, String srcRequisite, String destPassport,
                          String destRequisite, double amount);
}
