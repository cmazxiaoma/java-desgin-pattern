package 传输对象模式;

public class TransferObjectPatternDemo {

    public static void main(String[] args) {
        StudentBO studentBusinessObject = new StudentBO();

        for (StudentVO studentVO : studentBusinessObject.getAllStudents()) {
            System.out.println(studentVO);
        }

        StudentVO studentVO = studentBusinessObject.getAllStudents().get(0);
        studentVO.setName("garrettmayday");
        studentBusinessObject.updateStudent(studentVO);

        studentVO = studentBusinessObject.getStudent(0);
        System.out.println(studentVO);
    }
}
