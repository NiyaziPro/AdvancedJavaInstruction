package generics.methods;

import java.util.Arrays;

public class GenericMethod {
    public static void main(String[] args) {


        Integer[] integers = {4, 5, 6, 89, 56};
        Double[] doubles = {1.5, 12.9, 99.9, 5.3};
        String[] strings = {"Java", "Generics", "are", "fantastic."};


        System.out.println("--- Printing with printArray method ---");
        printArray(integers);
        printArray(doubles);
        printArray(strings);


        // Generic methods
        System.out.println("GENERIC printArrayGeneric Method");
        printArrayGeneric(integers);
        printArrayGeneric(doubles);
        printArrayGeneric(strings);

        System.out.println("GENERIC getFirst Method");
        System.out.println(getFirst(integers));
        System.out.println(getFirst(doubles));
        System.out.println(getFirst(strings));

        System.out.println("Generic method with multiple parameters");
        printArrAndElement(integers, "Generics");


    }

    // method for printing arrays

    public static  void printArray(Integer[]arr){
        Arrays.stream(arr).forEach(t-> System.out.print(t+" "));
        System.out.println();
    }
    public static  void printArray(Double[]arr){
        Arrays.stream(arr).forEach(t-> System.out.print(t+" "));
        System.out.println();
    }
    public static  void printArray(String[]arr){
        Arrays.stream(arr).forEach(t-> System.out.print(t+" "));
        System.out.println();
    }

    public static<T> void printArrayGeneric(T[]arr){ // Generic Method
        Arrays.stream(arr).forEach(t-> System.out.print(t+" "));
        System.out.println();
    }

    public static<T> T getFirst(T[]arr){ // Generic Method
        T first = arr[0];
        return first;
    }

    // Generic method with multiple data types

    public static <S,U> void printArrAndElement(S []arr , U element){
        Arrays.stream(arr).forEach(t-> System.out.print(t+" "));
        System.out.println(element);
    }
}
