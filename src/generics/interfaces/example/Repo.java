package generics.interfaces.example;
//We create a standard for all warehouses in the application
public interface Repo <T>{


    void save (T object);
    T find();
}
