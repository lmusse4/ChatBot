import java.util.Scanner;
public class ChatBot {
    public static void main(String[] args) {
        greetUser();
        String name = askUserName();
        int age = guessUserAge();
        countToNumber();
        testProgrammingKnowledge();
        System.out.println("Thanks for chatting, " + name + "! Goodbye!");

    }
    public static void greetUser() {
        System.out.println("Hi! I'm ChatBot. What's your name?");
    }
    public static String askUserName() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Sorry, I wasn't able to catch that! Could you please repeat your name for me?");
        String name = scanner.nextLine();
        return name;
    }

    public static int guessUserAge() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("I'm going to try to guess your age. Please answer the following questions with either 'yes' or 'no'.");

        int age = 10; // Starting age

        System.out.println("Are you older than " + age + " years old?");
        String answer = scanner.nextLine();
        if (answer.equalsIgnoreCase("no")) {
            System.out.println("I give up! How old are you?");
            age = scanner.nextInt();
            scanner.nextLine();
        } else {
            while (true) {
                age += 10; // Increment age by 10
                System.out.println("Are you older than " + age + " years old?");
                answer = scanner.nextLine();
                if (answer.equalsIgnoreCase("no")) {
                    break;
                }
                if (age >= 100) {
                    System.out.println("Wow, you must be really old!");
                    break;
                }
            }
        }

        System.out.println("I think you're " + age + " years old. Is that right?");
        answer = scanner.nextLine();
        while (!answer.equalsIgnoreCase("yes")) {
            System.out.println("Oops! Please tell me your real age.");
            age = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Oh so you are " + age + " years old! Is that right?");
            answer = scanner.nextLine();
        }

        return age;
    }
    public static void countToNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What number would you like to count to?");
        int countTo = scanner.nextInt();
        scanner.nextLine();
        System.out.println("OK, let's count to " + countTo + "!");
        for (int i = 1; i <= countTo; i++) {
            System.out.println(i);
        }
    }

    public static void testProgrammingKnowledge() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Now, let's test your programming knowledge.");
        System.out.println("Why should you marry a programmer?");
        System.out.println("a. They're good at debugging");
        System.out.println("b. They are not afraid to commit");
        System.out.println("c. They can handle exceptions");
        System.out.println("d. I don't know, you tell me");
        String answer = scanner.nextLine();
        while (!answer.equalsIgnoreCase("b")) {
            System.out.println("Sorry, that's incorrect. Please try again.");
            answer = scanner.nextLine();
        }
        System.out.println("Haha what a knee slapper!");
    }

}
