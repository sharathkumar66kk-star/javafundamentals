public class Student {
    private String name;
    private int age;

    public void setName(String name) {
        if (name == null || name.isEmpty()) {
            System.out.println("Invalid name");
        } else {
            this.name = name;
        }
    }

    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        } else {
            System.out.println("Age must be positive");
        }
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
