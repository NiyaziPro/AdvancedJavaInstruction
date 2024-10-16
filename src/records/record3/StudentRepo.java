package records.record3;

import records.record2.Product;

import java.util.ArrayList;
import java.util.List;

/*DB : DataBase */
public class StudentRepo {

    List<StudentDTO> students = new ArrayList<>();

    public void save(StudentDTO student) {
        this.students.add(student);
    }

    public void deleteStudent(StudentDTO student) {
        this.students.remove(student);
    }

    public void getAll() {
        for (StudentDTO student : this.students) {
            System.out.println(student);
        }
    }
}
