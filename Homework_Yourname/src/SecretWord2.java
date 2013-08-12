
import java.util.Scanner;

/**
 * This class uses some OO principles to create the secret word.
 * @author Dad
 */
public class SecretWord2 
{
    /**
     * This is the secret word bank used to select the secret word.
     */
    private static String [] wordBank = { "boat", "canoe", "airplane" };
    
    /**
     * This is the secret word.
     */
    private String secret;
    
    /**
     * This method is the constructor. It selects a random secret word from the
     * word bank.
     */
    public SecretWord2()
    {
        // select a random word from the word bank
        int index = (int)Math.round( Math.random() * ( wordBank.length - 1 ) );
        secret = wordBank[index];
    }
    
    /**
     * This method is used to guess the secret word.
     * @param g the user's guess at the word
     * @return true if the user guessed correctly, false if incorrect
     */
    public boolean guess( String g )
    {
        return secret.equals( g.toLowerCase() );
    }
    
    /**
     * This method is used to give the user a hint about the secret word.
     */
    public void hint()
    {
        char [] secretArray = secret.toCharArray();
//        int     numLetters = secret.length();
        
        System.out.println( "The first letter is " + secretArray[0] );
//        System.out.println( "There are " + numLetters + " letters." );
//        System.out.println( "The last letter is " + secretArray[numLetters-1] );        
    }
    
    /**
     * This is the man function.  The program starts here
     * @param args - not used
     */
    public static void main( String[] args )
    {
        SecretWord2 secretWord = new SecretWord2();

        // the input scanner
        Scanner readUserInput = new Scanner( System.in );  

        // init success to false
        boolean success = false;
        
        // loop until true
        while ( success == false )
        {
            System.out.print( "Enter your guess: " );  

            // wait and READ TEXT INPUT from user after user hit 'Enter'  
            String guess = readUserInput.nextLine();  

            // if the secret word matches
            if ( secretWord.guess( guess ) )
            {
                System.out.println("You guessed the secret word!");
                success = true;
            }
            else    // the secret word does not match
            {
                System.out.println( "Sorry, try again!" );
                secretWord.hint();
            
            }   // end if the secret word matches
            
        }   // end loop until true
    }
}
