package generics.interfaces.example;
//Customer's Database operations
public class CustomerRepo implements Repo<Customer>{


    @Override
    public void save(Customer object) {

    }

    @Override
    public Customer find() {
        return null;
    }
}
