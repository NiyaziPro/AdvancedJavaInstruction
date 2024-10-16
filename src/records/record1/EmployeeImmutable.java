package records.record1;

import java.util.Objects;

/*
 DTO (Data Transfer Object) is a simple object used to transfer data between different layers of an application,
 typically between the presentation layer and the service or persistence layers.
 The key purpose of a DTO is to carry data between processes without any business logic involved,
 making it a lightweight, serializable object.
 <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>>>>
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

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        EmployeeImmutable that = (EmployeeImmutable) object;
        return Objects.equals(firstname, that.firstname) && Objects.equals(lastname, that.lastname) && Objects.equals(email, that.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstname, lastname, email);
    }

}
