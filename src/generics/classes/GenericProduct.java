package generics.classes;
// our goal: to be able to hold product codes of different data types without creating separate classes (book, phone, laptop...)
// to create product objects with a single class
// solution: a generic product class

public class GenericProduct <T>{

    /*
    Only NON-PIMITIVE data type can be used generics!
    E --> Element,Collection
    K --> Key
    V --> Value
    N --> Number
    T --> Type
    S,U,V ... --> 2,3,4,type
     */

    private T code; // T-any NON-PRIMITIVE data type

    //getter ve setter


    public T getCode() {
        return code;
    }

    public void setCode(T code) {
        this.code = code;
    }
}
