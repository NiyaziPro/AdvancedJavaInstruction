package generics.bounding;

// generic yapilarda parametre olarak alinan data type'ini ustten sinirlandirabiliriz
// T : sadece Number classinin alt siniflari ile sinirlandiralim
// T : BYTE, SHORT , INTEGER , DOUBLE , LONG , FLOAT , NUMBER
public class GenericUpperBound<T extends Number> {

    public T[] numberArray;

    // numberArray icindeki elemanlarin ortalamasini hesaplayan method

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

        // GenericUpperBound<String> object3 = new GenericUpperBound<>(); String kabul etmez cunku sinirlandirdik



    }

}
