
import java.util.Scanner;

public class SecretWordV5 {
    
    // attributes or member variables
    static private String [] secret = { "java", "code", "html", "pie" };
    private int index;
    private int hintIndex;
    
    // behaviors or methods
    public SecretWordV5() {
        double rand = Math.random();
        index = (int)Math.floor( secret.length * rand );
        hintIndex = 0;
    };
    
    public boolean guess( String input ) {
        return secret[index].equals( input.toLowerCase() );
    };

    public String hint() {
        
        String theHint = "No more hints.";
        
        switch ( hintIndex ) {
            case 0:
                theHint = "There are " + secret[index].length() + " letters";
                break;
            case 1:
                theHint = "The first letter is " + secret[index].substring( 0, 1 );
                break;
            case 2:
                int last = secret[index].length() - 1;
                theHint = "The last letter is " + secret[index].substring( last );
                break;
        }
               
        hintIndex++;
        
        return theHint;        
    }
    
    public static void main(String[] args) {
                
        Scanner scan = new Scanner( System.in );
        boolean success = false;
                
        SecretWordV5 secretWord = new SecretWordV5();
        
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
                System.out.println( secretWord.hint() );
            }
        }
    }
}
