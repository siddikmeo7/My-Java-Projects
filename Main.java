import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("My First Java Project!");

        Scanner input = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = input.nextLine();

        System.out.print("Enter your age: ");
        int age = input.nextInt();

        System.out.println("Hello " + name);
        System.out.println("You are " + age);

    }
}