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


        System.out.println("emp.hashCode() = " + emp.hashCode());
        System.out.println("emp2.hashCode() = " + emp2.hashCode());

        //Record : Creating immutable classes with less boilerplate code

        EmployeeRecord record1 = new EmployeeRecord("Steve", "Jobs", "steve@mail.com");
        EmployeeRecord record2 = new EmployeeRecord("Steve", "Jobs", "steve@mail.com");
        System.out.println("record1 = " + record1);
        System.out.println("record2 = " + record2);
        System.out.println("record1.firstname() = " + record1.firstname());
        System.out.println("record1.lastname() = " + record1.lastname());
        System.out.println("record1.email() = " + record1.email());
        System.out.println("== : "+(record2==record1));
        System.out.println("equals : "+record1.equals(record2));


    }


}
