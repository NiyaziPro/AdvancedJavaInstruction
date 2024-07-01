package generics.classes;

// amacimiz : farkli data type'deki urun kodlarini tutabilmek icin ayri ayri classlar olusturmadan ( book, phone, laptop... )
// tek bir class ile urun objelerini olusturmak
public class NonGenericProduct {

    private Object code;    // code fieldinin data type object oldugu icin olusturulan nesnelerin code ozelliginde
                            // tum data tipleri kullanilabilir

    // getter-setter

    public Object getCode() {
        return code;
    }

    public void setCode(Object code) {
        this.code = code;
    }
}
