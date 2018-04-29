package 传输对象模式;

import java.util.ArrayList;
import java.util.List;

public class StudentBO {

    private List<StudentVO> students;

    public StudentBO() {
        students = new ArrayList<StudentVO>();
        StudentVO studentVO1 = new StudentVO(0, "garrett");
        StudentVO studentVO2 = new StudentVO(1, "mayday");
        students.add(studentVO1);
        students.add(studentVO2);
    }

    public void deleteStudent(StudentVO studentVO) {
        students.remove(studentVO);
    }

    public List<StudentVO> getAllStudents() {
        return this.students;
    }

    public StudentVO getStudent(int id) {
        return students.get(id);
    }

    public void updateStudent(StudentVO studentVO) {
        students.get(studentVO.getId()).setName(studentVO.getName());
    }
}
