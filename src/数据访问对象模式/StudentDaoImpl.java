package 数据访问对象模式;

import java.util.ArrayList;
import java.util.List;

public class StudentDaoImpl implements StudentDao {

    private List<Student> students;

    public StudentDaoImpl() {
        super();
        students = new ArrayList<Student>();
        Student student1 = new Student(0, "garrett");
        Student student2 = new Student(1, "xiaoma");
        students.add(student1);
        students.add(student2);
    }

    @Override
    public List<Student> getAllStudents() {
        return this.students;
    }

    @Override
    public Student getStudent(int id) {
        return students.get(id);
    }

    @Override
    public void updateStudent(Student student) {
        students.get(student.getId()).setName(student.getName());
    }

    @Override
    public void deleteStudent(Student student) {
        students.remove(student);
    }
}
