package generics.methods;

import java.util.Arrays;

public class GenericMethod {
    public static void main(String[] args) {


        Integer[] integers = {4, 5, 6, 89, 56};
        Double[] doubles = {1.5, 12.9, 99.9, 5.3};
        String[] strings = {"Java", "Generics", "are", "fantastic."};


        System.out.println("--- printArray methodu ile yazdirma ---");
        printArray(integers);
        printArray(doubles);
        printArray(strings);


        // Generic methods
        System.out.println("GENERIC printArrayGeneric Methodu");
        printArrayGeneric(integers);
        printArrayGeneric(doubles);
        printArrayGeneric(strings);

        System.out.println("GENERIC getFirst Methodu");
        System.out.println(getFirst(integers));
        System.out.println(getFirst(doubles));
        System.out.println(getFirst(strings));

        System.out.println("Coklu parametreli Generic method");
        printArrAndElement(integers, "Generics");


    }

    // arrayleri yazdirmak icin method

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

    // birden fazla data type ile Generic method

    public static <S,U> void printArrAndElement(S []arr , U element){
        Arrays.stream(arr).forEach(t-> System.out.print(t+" "));
        System.out.println(element);
    }
}
