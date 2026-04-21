import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PasswordMethods {

    @SuppressWarnings("unused")
    private int length;
    private final String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%^&*()_+";
    private final SecureRandom random = new SecureRandom();
    private final StringBuilder password = new StringBuilder();

    @SuppressWarnings("unused")
    Boolean checkLength(int length){
        return length >= 13 && length <= 41;
    }

    //method passwordGenerator
    @SuppressWarnings("unused")
    void passwordGenerator(int length){
        List<String> ch = new ArrayList<>();
        
        for(int i = 0; i <= length; i++){
            ch.add(characters.charAt(random.nextInt(characters.length()))+ "");
            password.append(ch.get(i));
        }
        Collections.shuffle(ch);
        System.out.println("\nThe password is: "+password+"\n");
    }
}
