public class Main {
    public static void main(String[] args) {
        Student s = new Student();  // object creation

        s.name = "Alex";
        s.age = 20;

        System.out.println(s.name);
        System.out.println(s.age);
    }
}
//Above program explanation in comments
/* What happens here (understand this)

- new Student() → creates an object

- Memory is allocated

- s is a reference

- Fields get values

This is the first real OOP step. */
