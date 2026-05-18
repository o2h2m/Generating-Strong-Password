import java.awt.Toolkit;
import java.awt.datatransfer.*;
import java.security.SecureRandom;
import java.util.Arrays;
import java.util.regex.Pattern;

public class PasswordMethods {

    //I am going to create attributes to this project
    @SuppressWarnings("unused")
    private int length;
    private final String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%^&*()_+=";
    private final SecureRandom random = new SecureRandom();

    Boolean checkLength(int length){
        return length >= 18 && length <= 41;
    }

    //method GeneratePassword
    void passwordGenerator(int length) throws InterruptedException{
        char[] tempPassword = new char[length+1];
        for(int i = 0; i <= length; i++){
            tempPassword[i] = characters.charAt(random.nextInt(characters.length()));
        }
        //even more randomness!
        fisherYates(tempPassword);

        String password = new String(tempPassword);
        Arrays.fill(tempPassword, '\0');

        //Copying the password to the system clipboard 
        StringSelection text = new StringSelection(password.toString());

        if(!ensureEntropy(password)) passwordGenerator(length);
        
        else{
            Clipboard systemClip = Toolkit.getDefaultToolkit().getSystemClipboard();

            systemClip.setContents(text, null);
            //For some reason, I have to type Thread.sleep() to let the system register the data.
            Thread.sleep(500);
            System.out.println("\nThe password has been copied, check your system clipboard.\n");
            Arrays.fill(password.toCharArray(), '\0');
        }
    }

    //Ensures that the password has at lesat: one capital letter, one small letter, one digit, and one special symbol
    private boolean ensureEntropy(String password){
        return Pattern.matches("^(?=.*[A-Z])(?=.*[a-z])(?=.*\\d)(?=.*[^A-Za-z0-9]).+$", password);
    }

    private void fisherYates(char[] pwd){
        for(int i = pwd.length-1; i >0; i--){
            int j = random.nextInt(i+1);

            char temp = pwd[j];
            pwd[j] = pwd[i];
            pwd[i] = temp;
        }
    }
}
