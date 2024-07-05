package generics.bounding;

import java.util.ArrayList;
import java.util.List;

// Wildcard (?) : Joker, bilinmeyen data type
public class GenericWithWildcard {

    public static void main(String[] args) {

        List<Integer> integers = new ArrayList<>();
        List<Double> doubles = new ArrayList<>();
        List<String> strings = new ArrayList<>();
        List<Number> numbers = new ArrayList<>();
        List<Object> objects = new ArrayList<>();

        System.out.println(">>>>>>>>>>>>>>>>>>Alttan Sinirlama <<<<<<<<<<<<<<<<<<<<");
        addEllement(integers);
        System.out.println("integers = " + integers);
//        addEllement(doubles);
//        addEllement(strings);
        addEllement(numbers);
        addEllement(objects);
        System.out.println("numbers = " + numbers);
        System.out.println("objects = " + objects);


        System.out.println(">>>>>>>>>>>>>>>>>>Ustten Sinirlama <<<<<<<<<<<<<<<<<<<<");

        multiplyByTwo(integers);
        multiplyByTwo(doubles);
        // multiplyByTwo(strings);
        multiplyByTwo(numbers);
        // multiplyByTwo(objects);
        System.out.println("integers = " + integers);
        System.out.println("doubles = " + doubles);
        System.out.println("numbers = " + numbers);


        System.out.println(">>>>>>>>>>>>>>>>>> Just Wildcard <<<<<<<<<<<<<<<<<<<<");

        printElements(integers);
        printElements(doubles);
        printElements(strings);
        printElements(numbers);
        printElements(objects);

    }
    // alttan sinirlama
    // Listeye 1 den 10 a kadar Integer elemanlari ekleyen bir method
    // List : Integer,Number,Object

    public static void addEllement(List<? super Integer> list) {

        for (int i = 1; i < 11; i++) {
            list.add(i);
        }

    }
    // Generic yapiyi kullanirken ustten sinirlama
    // Listedeki elemanlari 2 ile carpan bir method

    public static void multiplyByTwo(List<? extends Number> list) {

        list.stream().map(t -> 2 * t.doubleValue());

    }

    // ? : bilinmeyen data type
    // Wildcard  : read-only   - sadece data type'indan bagimsiz islemler yapilabilir
    public static void printElements(List<?> list) {

        for (Object object : list) {
            System.out.println(object + " ");
        }

        // !!!!!!  NOT:  List<T> ve List<?> list benzer, fakat tamamen ayni degildir.
    }

    public static <T> void addElementsToList(List<T> list, T element) {
        list.add(element);
    }
}
