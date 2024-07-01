package generics.classes;

public class RunnerNonGeneric {
    public static void main(String[] args) {
        // 2 farkli nesne book ve laptop

        NonGenericProduct book = new NonGenericProduct();
        book.setCode("advjava"); // code fieldini String data type ile set ettik

        NonGenericProduct laptop = new NonGenericProduct();
        laptop.setCode(1234567); // code fieldini Integer data type ile set ettik


        // 1 - Cast problemi!
        String str = (String) book.getCode();
        // 2 - ClassCastException Problemi
        String str2 = (String) laptop.getCode();


        System.out.println("str = " + str);
        System.out.println("str2 = " + str2);


    }
}
