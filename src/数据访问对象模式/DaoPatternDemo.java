package 数据访问对象模式;

public class DaoPatternDemo {

    public static void main(String[] args) {
        StudentDao studentDao = new StudentDaoImpl();

        for (Student student : studentDao.getAllStudents()) {
            System.out.println(student.toString());
        }

        Student student = studentDao.getAllStudents().get(0);
        student.setName("garrettmayday");
        studentDao.updateStudent(student);

        student = studentDao.getStudent(0);
        System.out.println(student.toString());

        student = studentDao.getStudent(1);
        System.out.println(student.toString());
    }
}
