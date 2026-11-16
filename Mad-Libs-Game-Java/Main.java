import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        /*
        Mad Libs is a silly word game where you make a funny story together.

        How it works:

        One person holds a short story that has blank spaces in it. Each blank says what kind of word is needed,
        like “noun” (a thing), “verb” (an action word), or “adjective” (a describing word).
        That person does not show the story. They just ask everyone for words: “Give me a color!”
        “Give me an animal!” “Give me a place!”
        Everyone shouts out words, and the person writes each one in a blank.
        When all the blanks are full, the story is read out loud.
                The story comes out strange and funny, because the words don’t fit well.
        */


        Scanner input = new Scanner(System.in); // created a method to take user's input!

        String adjective1;
        String noun1;
        String adjective2;
        String verb1;
        String adjective3;

        System.out.print("Enter an adjective (description): ");
        adjective1 = input.nextLine();

        System.out.print("Enter a noun (animal or a person): ");
        noun1 = input.nextLine();

        System.out.print("Enter an adjective (description): ");
        adjective2 = input.nextLine();

        System.out.print("Enter a verb end with -ing(action): ");
        verb1 = input.nextLine();

        System.out.print("Enter an adjective (description): ");
        adjective3 = input.nextLine();

        System.out.println("\nThe Result!");
        System.out.println();
        System.out.println("Today i went to a " + adjective1 + " zoo.");
        System.out.println("In an exhibit , i saw a " + noun1 + ".");
        System.out.println(noun1 + " was " + adjective2 + " and " + verb1 + "!");
        System.out.println("I was " + adjective3 + "!");

        input.close();
    }
}