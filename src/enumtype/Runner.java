package enumtype;

public class Runner {

    public static void main(String[] args) {

        printPasswordStrengthConstant("LOW");
        printPasswordStrengthConstant("MEDIUM");
        printPasswordStrengthConstant("GOOD");
        printPasswordStrengthConstant("PERFECT"); // Compile Time Error , Run Time Error yok, fakat istenen islev gerceklesmiyor !


        // Cozum - sabit ve sinirli sayida degiskeni sadece parametre olarak vermek : Enum Type

        System.out.println(">>>>>>>> Enum Type <<<<<<<<<<<");
        printPasswordStrengthEnum(PasswordStrength.LOW);
        printPasswordStrengthEnum(PasswordStrength.MEDIUM);
        printPasswordStrengthEnum(PasswordStrength.HIGH);


    }

    public static void printPasswordStrengthConstant(String strength) {
        if (strength.equals(PasswordStrengthConstant.LOW)) {
            System.out.println("Password strength  >> Low <<");
        } else if (strength.equals(PasswordStrengthConstant.MEDIUM)) {
            System.out.println("Password strength  >> Medium <<");
        } else if (strength.equals(PasswordStrengthConstant.HIGH)) {
            System.out.println("Password strength  >> High <<");
        }
    }

    // Enum type ile ayni method
    public static void printPasswordStrengthEnum(PasswordStrength strength) {
        if (strength.equals(PasswordStrength.LOW)) {
            System.out.println("Password strength  LOW");
            System.out.println("Level : " + strength.getLevel());
        } else if (strength.equals(PasswordStrength.MEDIUM)) {
            System.out.println("Password strength  MEDIUM");
            System.out.println("Level : " + strength.getLevel());
        } else if (strength.equals(PasswordStrength.HIGH)) {
            System.out.println("Password strength  HIGH");
            System.out.println("Level : " + strength.getLevel());
        }

        System.out.println("Enum ordinal : " + strength.ordinal());
        System.out.println("Enum name : "+ strength.name());
    }
}
