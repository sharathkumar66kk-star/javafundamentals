package studentmanagement;

public class Main {
    public static void main(String[] args) {
        StudentService service = new StudentService();

        service.addStudent(new Student(1, "Alex", 20));
        service.addStudent(new Student(2, "Bob", 22));

        service.displayStudents();
    }
}
