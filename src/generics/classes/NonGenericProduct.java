package generics.classes;

// Our goal: to create product objects with a single class without creating separate
// classes to hold product codes of different data types (book, phone, laptop...)
public class NonGenericProduct {

    private Object code;    // Since the code field is a data type object,
    // all data types can be used in the code property of the created objects.

    // getter-setter

    public Object getCode() {
        return code;
    }

    public void setCode(Object code) {
        this.code = code;
    }
}
