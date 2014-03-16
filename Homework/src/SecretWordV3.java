
import java.util.Scanner;

public class SecretWordV3 {

    public static void main(String[] args) {
        String [] secret = { "java", "code", "html", "pie" };
        
        double rand = Math.random();
        int index = (int)Math.floor( secret.length * rand );
        
        Scanner scan = new Scanner( System.in );
        
        boolean success = false;
                
        while ( success == false )
        {
            System.out.println( "Guess the word: ");
            
            String input = scan.nextLine();
            
            if ( secret[index].equals( input.toLowerCase() ) )
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
