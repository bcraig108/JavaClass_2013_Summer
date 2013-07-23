
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dad
 */
public class SecretWord1 
{
    public static void main( String[] args )
    {
        // the secret words
        String [] secret = { "boat", "canoe", "airplane" };
        
        // select which word
        int index = (int)Math.round( Math.random() * ( secret.length - 1 ) );

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
            if ( secret[index].equals( guess.toLowerCase() ) )
            {
                System.out.println("You guessed the secret word!");
                success = true;
            }
            else    // the secret word does not match
            {
                System.out.println( "Sorry, try again!" );
            
            }   // end if the secret word matches
            
        }   // end loop until true
    }
}
