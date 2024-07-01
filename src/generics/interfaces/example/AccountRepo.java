package generics.interfaces.example;

public class AccountRepo implements Repo<Account> {

    @Override
    public void save(Account object) {

    }

    @Override
    public Account find() {
        return null;
    }
}
