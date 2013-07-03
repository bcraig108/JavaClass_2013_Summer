
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dad
 */
public class SecretWord 
{
    public static void main( String[] args )
    {
        String secret = "boot";

        Scanner readUserInput = new Scanner( System.in );  

        boolean success = false;
        
        while ( success == false )
        {
            //Print into command prompt 
            System.out.print( "Enter your guess: " );  

            //Wait and READ TEXT INPUT from user after user hit 'Enter'  
            String guess = readUserInput.nextLine();  

            if ( secret.equals( guess.toLowerCase() ) )
            {
                System.out.println("You guessed the secret word!");
                success = true;
            }
            else
            {
                System.out.println( "Sorry, try again!" );
            }
        }
    }
}
