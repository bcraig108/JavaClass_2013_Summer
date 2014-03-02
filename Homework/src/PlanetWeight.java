/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Brian & Denise
 */
public class PlanetWeight {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        float weight = Float.parseFloat( args[0] );
        
        System.out.println( "Your weight on earth is " + weight );
        System.out.println( "Your weight on Mercury is " + weight * 0.379 );
        
    }
}
