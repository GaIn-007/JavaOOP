import model.Student;

public class StuDemo {
    public static void main(String[] args) {
        Student student = new Student("zhangsan", 20, "male", 10002);
        student.setIdNo(10005);
        System.out.println(student.getName());
        System.out.println(student.getAge());
        System.out.println(student.getGender());
        System.out.println(student.getIdNo());
    }
}
