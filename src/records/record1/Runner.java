package records.record1;

public class Runner {
    public static void main(String[] args) {

        Employee employee1 = new Employee("Jack", "Sparrow", "jack@mail.com");

        System.out.println("employee1 = " + employee1);
        employee1.EmplopyeePrint();

        employee1.setEmail("jack@gmail.com");
        System.out.println("Email : " + employee1);
        employee1.EmplopyeePrint();


        // Immutable class

        EmployeeImmutable emp = new EmployeeImmutable("Harry", "Potter", "harry@mail.com");

        EmployeeImmutable emp2 = new EmployeeImmutable("Harry", "Potter", "harry@mail.com");
        System.out.println("Double equal : "+(emp==emp2));
        System.out.println("Equals : "+(emp.equals(emp2)));
    }
}
