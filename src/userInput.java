import java.util.Scanner;

public class userInput {
    public static void main(String[] args) {
        
        @SuppressWarnings("resource") // "SuppressWarnings" - removes the warning that 'scanner' is never closed
        Scanner scanner = new Scanner(System.in);

        System.out.println("What is your name?");
        String name = scanner.nextLine();
        System.out.println("How old are you?");
        int age = scanner.nextInt(); // Must include second scanner.nextLine();
        scanner.nextLine();          // after scanner.nextInt(); to continue 
        System.out.println("What is your favorite food?");
        String food = scanner.nextLine();


        System.out.println("Hello "+name);
        System.out.println("You are at least "+age+" year(s) old");
        System.out.println("You like "+food);
    }
}

