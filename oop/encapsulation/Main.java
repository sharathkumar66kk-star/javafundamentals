public class Main {
    public static void main(String[] args) {
        Student s = new Student();

        s.setName("");
        s.setAge(-5);

        s.setName("Alex");
        s.setAge(20);

        System.out.println(s.getName());
        System.out.println(s.getAge());
    }
}
