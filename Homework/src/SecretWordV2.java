
import java.util.Scanner;

public class SecretWordV2 {

    public static void main(String[] args) {
        String secret = "java";
        
        Scanner scan = new Scanner( System.in );
        
        boolean success = false;
                
        while ( success == false )
        {
            System.out.println( "Guess the word: ");
            
            String input = scan.nextLine();
            
            if ( secret.equals( input.toLowerCase() ) )
            {
                System.out.println( "You guessed the secret word!"  );
                success=true;
            }
            else
            {
                System.out.println( "Sorry, try again!"  );
            }
        }
    }
}
