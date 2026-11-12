import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        while(true) {

            // Creating an input method!
            Scanner input = new Scanner(System.in);
            System.out.print(""" 
                    Choose comand to go further:
                    1 - '+'  
                    2 - '-'  
                    3 - '*'  
                    4 - '/'  
                    5 - 'quit'
                    Choose Command:  """);
            int command = input.nextInt();

            System.out.print("Enter the 1'st number: ");
            int num1 = input.nextInt();

            System.out.print("Enter the 2'nd number: ");
            int num2 = input.nextInt();

            if (command == 1) {
                System.out.println();
                System.out.println(num1 + "+" + num2 +  "=" + (num1 + num2));
                System.out.println();

            }   else if(command == 2){
                System.out.println();
                System.out.println(num1 + "-" + num2 +  "=" + (num1 - num2));
                System.out.println();

            }   else if(command == 3){
                System.out.println();
                System.out.println(num1 + "*" + num2 +  "=" + (num1 * num2));
                System.out.println();

            }   else if(command == 4){
                System.out.println();
                System.out.println(num1 + "/" + num2 +  "=" + (num1 / num2));
                System.out.println();

            } else if(command == 5) {
                System.out.println();
                System.out.println();
                break;
            }   else {
                System.out.println();
                System.out.println("Unknown command!");
                System.out.println();
            }
        }
        System.out.println("You are out!");
    }
}