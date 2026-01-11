import java.util.Scanner;

public class NextIntVsNextLine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int age = sc.nextInt();
        sc.nextLine();   // consume leftover newline

        String name = sc.nextLine();

        System.out.println(age);
        System.out.println(name);

        sc.close();
    }
}
