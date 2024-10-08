package generics.bounding;

// We can limit the data type taken as a parameter in generic structures.
// T : restricted to subclasses of the Number class only
// T : BYTE, SHORT , INTEGER , DOUBLE , LONG , FLOAT , NUMBER
public class GenericUpperBound<T extends Number> {

    public T[] numberArray;

    // Method that calculates the average of the elements in numberArray

    public Double getAverage() {
        double sum = 0;
        for (T t : this.numberArray) {
            sum += t.doubleValue();

        }
        double average = sum / this.numberArray.length;

        return average;
    }

    public static void main(String[] args) {
        Integer [] integers = {3,4,7,5,6,9,2,4};
        Double [] doubles = {0.3,99.9,11.0,3.6};
        String [] strings = {"Generics", "Upper", "Bounding"};


        GenericUpperBound<Integer> object1 = new GenericUpperBound<>();
        object1.numberArray = integers;
        System.out.println(object1.getAverage());


        GenericUpperBound<Double> object2 = new GenericUpperBound<>();
        object2.numberArray = doubles;
        System.out.println(object2.getAverage());

        // GenericUpperBound<String> object3 = new GenericUpperBound<>();
        // It does not accept string because we restricted it



    }

}
