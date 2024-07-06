package enumtype;

public enum PasswordStrength {


    FAIL(0),
    LOW(10),
    MEDIUM(50),
    HIGH(100);

    private final int level;

    PasswordStrength(int level) {
        this.level = level;
    }

    public int getLevel() {
        return this.level;
    }
}
