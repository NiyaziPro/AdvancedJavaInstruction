package generics.classes;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class RunnerGeneric {
    public static void main(String[] args) {


        GenericProduct<String> book = new GenericProduct();
        book.setCode("Advanced Java");

        GenericProduct<Integer> laptop = new GenericProduct<>();
        laptop.setCode(123456789);
        // laptop.setCode("laptop");

        String str = book.getCode();
        Integer code = laptop.getCode();


        System.out.println("str = " + str);
        System.out.println("code = " + code);

        // -----------------------------------------------------------

        ArrayList<String> list = new ArrayList<>();

        HashMap<String,Double>myMap = new HashMap<>();
        myMap.put("AdvJava",99.9);


        // -------------------------------MULTI-PARAMETER GENERIC CLASS------------------------------------------

        // S: String  ,  U:Integer
        GenericClassTwoParameters<String,Integer> generics = new GenericClassTwoParameters<>("Generic",99);

        // S: String  ,  U: String
        GenericClassTwoParameters<String,String> generics2 = new GenericClassTwoParameters<>("Generics","fantastic");

        // S: Double  ,  U: Boolean
        GenericClassTwoParameters<Double,Boolean> generics3 = new GenericClassTwoParameters<>(100.0,true);

    }
}
