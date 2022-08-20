package job4jbank.model;

import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;

import lombok.Data;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class User extends Id {
    @NonNull
    private String password;
    @NonNull
    private String username;
    private List<Account> accounts = new CopyOnWriteArrayList<>();

}
