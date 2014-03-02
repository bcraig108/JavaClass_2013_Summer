/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Brian & Denise
 */
public class Divide {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int numerator = Integer.parseInt( args[0] );
        int denominator = Integer.parseInt( args[1] );
        
        System.out.println( numerator + "/" + denominator + 
                " = " + ( numerator / denominator ) +
                " R " + ( numerator % denominator ) );
    }
}
