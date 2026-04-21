import java.security.SecureRandom;
public class PasswordProject {
    public static void main(String[] args)throws InterruptedException{
        PasswordMethods pa = new PasswordMethods();
        SecureRandom random = new SecureRandom();
        while(true){
            int length = random.nextInt(40);
            if(pa.checkLength(length) == false);
            else{
                pa.passwordGenerator(length);
                break;
            }            
        }
    }
}
