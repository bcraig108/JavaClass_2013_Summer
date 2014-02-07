/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dad
 */
public class PigLatin {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String word = args[0].substring(1) + args[0].substring(0, 1) +  "ay";
        
        System.out.println( word.toLowerCase() );
    }
}
