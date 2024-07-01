package generics.classes;
// amacimiz : farkli data type'deki urun kodlarini tutabilmek icin ayri ayri classlar olusturmadan ( book, phone, laptop... )
// tek bir class ile urun objelerini olusturmak
// cozum : generic bir product class

public class GenericProduct <T>{

    /*
    Generic olarak sadece NON-PIMITIVE data type'i kullanilabilir!
    E --> Element,Collection gibi yapilarda kullanilir
    K --> Key
    V --> Value
    N --> Number
    T --> Type
    S,U,V ... --> 2,3,4,type'lar icin
     */

    private T code; // T-herhangi bir NON-PRIMITIVE data type

    //getter ve setter


    public T getCode() {
        return code;
    }

    public void setCode(T code) {
        this.code = code;
    }
}
