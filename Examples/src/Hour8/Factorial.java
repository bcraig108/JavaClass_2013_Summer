/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Hour8;

import java.util.Scanner;

/**
 *
 * @author Dad
 */
public class Factorial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // the input scanner
        Scanner input = new Scanner( System.in );  

        // init exit to false
        boolean exit = false;
        
        // loop until exit
        while ( exit == false )
        {
            System.out.print( "Enter number for factorial: " );  

            // wait and READ TEXT INPUT from user after user hits 'Enter'  
            String entry = input.nextLine();  

            if ( entry.equalsIgnoreCase( "x" ) )
            {
                exit = true;
            }
            else
            {
                long number = Long.parseLong(entry);

                long factorial = 1;
                
                for ( long index = number; index > 1; index-- )
                {
                    factorial *= index;
                }
                
                System.out.println( number + "! = " + factorial ); 
            }
        }
    }
}
