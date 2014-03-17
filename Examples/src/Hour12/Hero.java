/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Hour12;

import java.util.Collections;
import java.util.Vector;

/**
 *
 * @author Dad
 */
public class Hero {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Vector<String> powers = new Vector<>();

        powers.add( "Super Speed" );
        powers.add( "Super Strength" );
        powers.add( "Flying" );
        powers.add( "Fireballs" );
        
        System.out.println( "Our Hero's first power is " + powers.get(0) );
        
        String flying = "Flying";
        if ( powers.contains( flying ) )
        {
            System.out.println( "Our Hero has " + flying + " power" );
        }
        
        powers.remove(0);           // remove the first power
        
        powers.remove( flying );    // remove flying
        
        System.out.println( "Our Hero's powers are: " );
        
        // special for loop for vectors
        for ( String power : powers ) {
            System.out.println( power ); 
        }
        
        Collections.sort( powers );
        
        System.out.println( "Alphabetical: " );
        
        // special for loop for vectors
        for ( String power : powers ) {
            System.out.println( power ); 
        }
    }
}
