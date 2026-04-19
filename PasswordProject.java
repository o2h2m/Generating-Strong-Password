import java.util.Random;

public class PasswordProject {
    public static void main(String[] args)throws InterruptedException{
        PasswordMethods pa = new PasswordMethods();
        Random random = new Random();
        
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
