package job4jbank.model;

import lombok.Data;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class Account extends Id {
    @NonNull
    private String requisite;
    @NonNull
    private double balance;
    private User user;

    public Account(String requisite, int i) {
    }
}
