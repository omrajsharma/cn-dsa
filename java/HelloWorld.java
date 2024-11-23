import java.util.Scanner;

public class HelloWorld {

    public class Student {
        private String name;
        private String phone;
        private static String schoolName;
    }

    public static void main(String[] args) {
        System.out.println("This is println");

        int sum = sum(5,6);

        System.out.println(sum);

        Scanner scanner = new Scanner(System.in);

        // Reading a string
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        // Reading an integer
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        // Reading a double
        System.out.print("Enter your height: ");
        double height = scanner.nextDouble();

        System.out.println("Name: " + name + ", Age: " + age + ", Height: " + height);

        scanner.close();
    }

    public static int sum(int x, int y) {
        return x + y;
    }
}