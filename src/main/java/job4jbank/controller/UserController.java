package job4jbank.controller;

import job4jbank.model.User;
import job4jbank.service.BankService;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/user")
public class UserController {
    private final BankService bankService;

    public UserController(BankService bankService) {
        this.bankService = bankService;
    }

    @PostMapping
    public User save(@RequestBody Map<String, String> body) {
        var user = new User(body.get("username"), body.get("password"));
        bankService.addUser(user);
        return user;
    }

    @GetMapping
    public User findByPassport(@RequestParam String password) {
        return bankService.findByPassport(password).orElse(null);
    }
}