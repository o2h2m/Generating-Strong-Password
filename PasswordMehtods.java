import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PasswordMehtods {

    //I am going to create attributes to this project
    String UpperCase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    String LowerCase = "abcdefghijklmnopqrstuvwxyz";
    String Numbers = "1234567890";
    String SpecialCharacters = "@#$%&?!_<>()*-+=;";
    int length;
    SecureRandom random = new SecureRandom();
    StringBuilder password = new StringBuilder();

    //These are the methods that I am going to use in this project
    //the methods are: checking the length, checking the characters, and generating the password

    Boolean checkLength(int length){
        if(length >= 5 && length <= 21){
            return true;
        }
        else{
            System.out.println("The length of the password must be between 6 and 20 characters.");
            return false;
        }
    }
    
    Boolean checkUpperCase(String choice){
        if(choice.contains("1")){
            return true;
        }
        else return false;
    }

    Boolean checkLowerCase(String choice){
        if(choice.contains("2")){
            return true;
        }
        else return false;
    }

    Boolean checkNumbers(String choice){
        if(choice.contains("3")){
            return true;
        }
        else return false;
    }

    Boolean checkSpecialCharacters(String choice){
        if(choice.contains("4")){
            return true;
        }
        else return false;
    }
    
    //list
    void listCharacters(String choice){
        System.out.println("\nList characters: ");
        
        System.out.println("UpperCase: "+checkUpperCase(choice));
        System.out.println("LowerCase: "+checkLowerCase(choice));
        System.out.println("Numbers: "+checkNumbers(choice));
        System.out.println("Special characters: "+checkSpecialCharacters(choice));
    }

    //method GeneratePassword
    void passwordGenerator(String choice, int length){
        
        List<Character> chars = new ArrayList<>();

        String all = "";
        if (checkUpperCase(choice)) {
            chars.add(UpperCase.charAt(random.nextInt(UpperCase.length())));
            all += UpperCase;
        }
        if (checkLowerCase(choice)) {
            chars.add(LowerCase.charAt(random.nextInt(LowerCase.length())));
            all += LowerCase;
        }
        if (checkNumbers(choice)) {
            chars.add(Numbers.charAt(random.nextInt(Numbers.length())));
            all += Numbers;
        }
        if (checkSpecialCharacters(choice)) {
            chars.add(SpecialCharacters.charAt(random.nextInt(SpecialCharacters.length())));
            all += SpecialCharacters;
        }

        int remaining = length - chars.size();
        for(int i = 0; i < remaining; i++){
            chars.add(all.charAt(random.nextInt(all.length())));
        }

        Collections.shuffle(chars);

        StringBuilder password = new StringBuilder();

        for(char c : chars){
            password.append(c);
        }

        System.out.println("Password generated! | password: "+password.toString());
    }
}
