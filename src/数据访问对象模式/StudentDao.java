package 数据访问对象模式;

import java.util.List;

public interface StudentDao {

    public List<Student> getAllStudents();

    public Student getStudent(int id);

    public void updateStudent(Student student);

    public void deleteStudent(Student student);
}
