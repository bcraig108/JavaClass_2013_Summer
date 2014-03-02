/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Brian & Denise
 */
public class SecretWord {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String secret = "java";
        System.out.println( "Match = " + 
                secret.equals(args[0].toLowerCase()));
    }
}
