import java.util.Scanner;

public class ScannerDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int age = sc.nextInt();
        double marks = sc.nextDouble();

        System.out.println(age);
        System.out.println(marks);

        sc.close();
    }
}
