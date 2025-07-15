import java.util.Scanner;
public class PasswordProject {
    public static void printslow(String text)throws InterruptedException{
        for(char C: text.toCharArray()){
            System.out.print(C);
            Thread.sleep(20);
        }

        System.out.println();
    }
    public static void main(String[] args)throws InterruptedException{
        try (Scanner input = new Scanner(System.in)) {
            String choice = null;

            PasswordMehtods method = new PasswordMehtods();

            printslow("\nWelcome to the Password Generator!");
            
            printslow("Please choose the type of characters you want in your password:");
            printslow("[1. Uppercase Letters, 2. Lowercase Letters, 3. Numbers, 4. Special Characters]");
            printslow("Enter your choice (e.g., 1,2,3): ");
            choice = input.nextLine();

            method.listCharacters(choice);

            printslow("\nEnter the desired length of your password (between 6 and 20 characters): ");
            int length = input.nextInt();
            input.nextLine(); // Consume the newline character left by nextInt()

            method.checkLength(length);

            method.passwordGenerator(choice, length);
        }
    }
}
