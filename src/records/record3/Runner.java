package records.record3;


import java.util.List;


public class Runner {
    public static void main(String[] args) {


        StudentDTO student1 = new StudentDTO("Victor", "Hugo", "123456");
        StudentDTO student2 = new StudentDTO("Lev", "Tolstoy", "789123");

        StudentRepo repo = new StudentRepo();

        repo.save(student1);
        repo.save(student2);

        System.out.println("All Students : ");
        repo.getAll();

        List<StudentDTO> list = repo.students;

        /* A student's number has been entered incorrectly on the list and needs to be changed.
        Solution : Creating a new Student object  */

        StudentDTO newStudent2 = new StudentDTO(list.get(1).firstname(),list.get(1).lastname(),"112233");

        repo.deleteStudent(student2);

        repo.save(newStudent2);

        System.out.println("Current student list: ");
        repo.getAll();




    }
}
