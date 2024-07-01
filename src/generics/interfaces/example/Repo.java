package generics.interfaces.example;

public interface Repo <T>{


    void save (T object);
    T find();
}
