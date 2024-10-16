package records.record1;

/*
In some cases, we may want to define immutable classes to ensure thread safety, data consistency in the cache, ease of testing, etc.
 */
public class EmployeeImmutable {
    private final String firstname;
    private final String lastname;
    private final String email;

    public EmployeeImmutable(String firstname, String lastname, String email) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.email = email;
    }

    // setter: Since it is final, we do not use setter methods to avoid changing it.
    //getter
    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return "EmployeeImmutable{" +
                "firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", email='" + email + '\'' +
                '}';
    }


}
