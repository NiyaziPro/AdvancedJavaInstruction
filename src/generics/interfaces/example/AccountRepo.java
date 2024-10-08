package generics.interfaces.example;
//Account's Database operations
public class AccountRepo implements Repo<Account> {

    @Override
    public void save(Account object) {

    }

    @Override
    public Account find() {
        return null;
    }
}
