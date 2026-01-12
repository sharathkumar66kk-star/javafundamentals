package studentmanagement;

import java.util.ArrayList;

public class StudentService {
    private ArrayList<Student> students = new ArrayList<>();

    public void addStudent(Student student) {
        students.add(student);
    }

    public void displayStudents() {
        if (students.isEmpty()) {
            System.out.println("No students available");
            return;
        }

        for (Student s : students) {
            System.out.println(
                s.getId() + " " + s.getName() + " " + s.getAge()
            );
        }
    }
}
