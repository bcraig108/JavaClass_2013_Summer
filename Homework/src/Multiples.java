
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Brian & Denise
 */
public class Multiples {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner( System.in );
        
        System.out.println( "Pick a number: ");
        
        String number = scan.nextLine();
        int num = Integer.parseInt(number);
        
        int [] multiples = new int[10];
        
        for ( int index = 1; index <= multiples.length; index++ )
        {
            multiples[index-1] = num * (index);
        }
        
        for ( int index = 0; index < multiples.length; index++ )
        {
            System.out.print( multiples[index] + ", " );
        }
        System.out.println();
    }
}
