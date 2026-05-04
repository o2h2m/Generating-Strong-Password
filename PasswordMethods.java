import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.security.SecureRandom;
import java.util.regex.Pattern;

public class PasswordMethods {

    //I am going to create attributes to this project
    @SuppressWarnings("unused")
    private int length;
    private final String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%^&*()_+={}[],.";
    private final SecureRandom random = new SecureRandom();
    private final StringBuilder password = new StringBuilder();

    Boolean checkLength(int length){
        return length >= 18 && length <= 41;
    }

    //method GeneratePassword
    void passwordGenerator(int length) throws InterruptedException{
        password.setLength(0);
        char[] randomChar = new char[length+1];
        for(int i = 0; i <= length; i++){
            randomChar[i] = characters.charAt(random.nextInt(characters.length()));
            password.append(randomChar[i]);
        }
        //Even more randomness!
        fisherYates(password);

        //Copying the password to the system clipboard 
        StringSelection text = new StringSelection(password.toString());

        if(!ensureEntropy(password)) passwordGenerator(length);
        
        else{
            Clipboard systemClip = Toolkit.getDefaultToolkit().getSystemClipboard();

            systemClip.setContents(text, null);
            //For some reason, I have to type Thread.sleep() to let the system register the data.
            Thread.sleep(500);
            System.out.println("\nThe password has been copied, check your system clipboard.\n");
        }
    }

    //Ensures that the password has at lesat: one capital letter, one small letter, one digit, and one special symbol
    private boolean ensureEntropy(StringBuilder password){
        return Pattern.matches("^(?=.*[A-Z])(?=.*[a-z])(?=.*\\d)(?=.*[^A-Za-z0-9]).+$", password);
    }

    private void fisherYates(StringBuilder password){
        for(int i = password.length()-1; i >0; i--){
            int j = random.nextInt(i+1);

            char temp = password.charAt(i);
            password.setCharAt(i, password.charAt(j));
            password.setCharAt(j, temp);
        }
    }
}