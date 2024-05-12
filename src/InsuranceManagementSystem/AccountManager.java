package InsuranceManagementSystem;

import java.util.TreeSet;

public class AccountManager {
    private TreeSet<Account> accountSet = new TreeSet<>();

    public void addAccount(Account account) {
        accountSet.add(account);
    }

    public Account accountLogin(String email, String password) throws InvalidAuthenticationException {
        for (Account account : accountSet) {
                if (account.getUser().getEmail().equals(email) && account.getUser().getPassword().equals(password)) {
                    return account;
                }
        }
        throw new InvalidAuthenticationException("Kullanıcı bulunamadı veya şifre yanlış!");
    }
}
