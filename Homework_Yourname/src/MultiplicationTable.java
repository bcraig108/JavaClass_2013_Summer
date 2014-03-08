/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dad
 */
public class MultiplicationTable {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        for ( int row = 1; row <= 10; row++ )
        {
            for ( int col = 1; col <= 10; col++ )
            {
                System.out.print( ( row * col ) + "\t" );
            }
            System.out.println();
        }
    }
}
