package generics.bounding;

import java.util.ArrayList;
import java.util.List;

// Wildcard (?): Joker, unknown data type
public class GenericWithWildcard {

    public static void main(String[] args) {

        List<Integer> integers = new ArrayList<>();
        List<Double> doubles = new ArrayList<>();
        List<String> strings = new ArrayList<>();
        List<Number> numbers = new ArrayList<>();
        List<Object> objects = new ArrayList<>();

        System.out.println(">>>>>>>>>>>>>>>>>>Lower Limitation <<<<<<<<<<<<<<<<<<<<");
        addEllement(integers);
        System.out.println("integers = " + integers);
//        addEllement(doubles);
//        addEllement(strings);
        addEllement(numbers);
        addEllement(objects);
        System.out.println("numbers = " + numbers);
        System.out.println("objects = " + objects);


        System.out.println(">>>>>>>>>>>>>>>>>>Upper Limitation <<<<<<<<<<<<<<<<<<<<");

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
    // bottom irritation
    // A method that adds Integer elements from 1 to 10 to the list
    // List : Integer,Number,Object

    public static void addEllement(List<? super Integer> list) {

        for (int i = 1; i < 11; i++) {
            list.add(i);
        }

    }
    // Upper limitation when using generic structure
    // A method that multiplies the elements in the list by 2

    public static void multiplyByTwo(List<? extends Number> list) {

        list.stream().map(t -> 2 * t.doubleValue());

    }

    // ? : unknown data type
    // Wildcard  : read-only   - Only operations independent of the data type can be performed.
    public static void printElements(List<?> list) {

        for (Object object : list) {
            System.out.println(object + " ");
        }

        // !!!!!!  NOTE:  List<T> ve List<?> list is similar, but not exactly the same.
    }

    public static <T> void addElementsToList(List<T> list, T element) {
        list.add(element);
    }
}
