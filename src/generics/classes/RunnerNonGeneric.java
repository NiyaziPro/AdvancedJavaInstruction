package generics.classes;

public class RunnerNonGeneric {
    public static void main(String[] args) {

        NonGenericProduct book = new NonGenericProduct();
        book.setCode("advjava"); // We set the code field with String data type.

        NonGenericProduct laptop = new NonGenericProduct();
        laptop.setCode(1234567); // We set the code field with Integer data type.


        // 1 - Cast problem!
        String str = (String) book.getCode();
        // 2 - ClassCastException Problem
        String str2 = (String) laptop.getCode();


        System.out.println("str = " + str);
        System.out.println("str2 = " + str2);


    }
}
