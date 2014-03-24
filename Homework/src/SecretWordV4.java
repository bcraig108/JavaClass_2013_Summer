
import java.util.Scanner;

public class SecretWordV4 {
    
    // attributes or member variables
    static private String [] secret = { "java", "code", "html", "pie" };
    private int index;
    
    // behaviors or methods
    SecretWordV4() {
        double rand = Math.random();
        index = (int)Math.floor( secret.length * rand );
    };
    
    boolean guess( String input ) {
        return secret[index].equals( input.toLowerCase() );
    };

    public static void main(String[] args) {
                
        Scanner scan = new Scanner( System.in );
        boolean success = false;
                
        SecretWordV4 secretWord = new SecretWordV4();
        SecretWordV4 secretWord1 = new SecretWordV4();
        
        while ( success == false )
        {
            System.out.println( "Guess the word: ");
            
            String input = scan.nextLine();
            
            if ( secretWord.guess( input ) )
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
