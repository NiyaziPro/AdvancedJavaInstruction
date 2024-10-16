package records.record1;

public class Employee {
    private String firstname;
    private String lastname;
    private String email;

    // constructur with parameters
    public Employee(String firstname, String lastname, String email) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.email = email;
    }

    //getter and setter
    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    public void EmplopyeePrint() {
        System.out.printf("%-12s: %s\n", "Firstname", firstname);
        System.out.printf("%-12s: %s\n", "Lastname", lastname);
        System.out.printf("%-12s: %s\n", "Email", email);
    }
}
