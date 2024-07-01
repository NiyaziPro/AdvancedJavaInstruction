package generics.classes;

public class GenericClassTwoParameters<S, U> {


    private S key;
    private U value;

    // constructor with parameters

    public GenericClassTwoParameters(S key, U value) {
        this.key = key;
        this.value = value;
    }


    //getter ve setter

    public S getKey() {
        return key;
    }

    public void setKey(S key) {
        this.key = key;
    }

    public U getValue() {
        return value;
    }

    public void setValue(U value) {
        this.value = value;
    }
}
