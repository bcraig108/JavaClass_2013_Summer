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
        
        System.out.println( "Match = " + 
                            secret.equals( args[0].toLowerCase() ) );
    }
}
