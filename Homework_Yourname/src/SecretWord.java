
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
    // the secret words - attibute
    String [] secret = { "boat", "canoe", "airplane" };

    // the index of the secret word - attribute
    int index;
    
    /**
     * the constructor picks the secret word index
     */
    SecretWord()
    {
        // select which word
        index = (int)Math.round( Math.random() * ( secret.length - 1 ) );
    }
    
    /**
     * This method allows the user to guess the answer
     * @param answer the user's guess
     * @return true if correct, false if not
     */
    boolean guess( String answer )
    {
        // if the secret word matches
        if ( secret[index].equals( answer.toLowerCase() ) )
        {
            System.out.println("You guessed the secret word!");
            return true;
        }
        else    // the secret word does not match
        {
            System.out.println( "Sorry, try again!" );
            System.out.print( "Hint: " );
            hint();

            return false;

        }   // end if the secret word matches
    }
    
    /**
     * This function gives the user a hint
     */
    void hint()
    {
        System.out.println( "The word is " + 
                            secret[index].length() + 
                            " characters long" );
//        System.out.println( "The word starts with \"" + 
//                            secret[index].toCharArray()[0] + "\"" );
//        System.out.println( "The word ends with \"" + 
//                            secret[index].toCharArray()[secret[index].length() - 1] + "\"" );
    }
    
    /**
     * The main program
     * @param args 
     */
    public static void main( String[] args )
    {
        // the input scanner
        Scanner readUserInput = new Scanner( System.in );  

        // create the SecretWord object
        SecretWord secret = new SecretWord();
        
        boolean success;
        
        do
        {
            System.out.print( "Enter your guess: " );  

            // wait and READ TEXT INPUT from user after user hit 'Enter'  
            String input = readUserInput.nextLine();  

            // guess check the answer
            success = secret.guess( input );
        }
        while ( success == false );
    }
}
