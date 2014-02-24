package Hour9;



/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Arrays;

/**
 *
 * @author Dad
 */
public class ArraysExamples {

    /**
     * @param args the command line arguments
     */
    public static void main( String[] args ) {  // args is an array of Strings
        
        // ====================================================================
        // Santa keeps lots of lists
        //
        String[] naughtyChild;  // empty array of Strings to hold the names of
                                // naughty children
        
        int[] reindeerWeight;   // empty array of ints to hold the weight of
                                // each of his reindeer
        
        boolean[] safeCountry;  // empty array of booleans indicating which
                                // contries are safe to fly over
        
        // ====================================================================
        // in order to store information in the arrays, we need to set aside, or
        // "allocate" space for them
        
        int[] elfRank = new int[125];   // array of 125 ints to store the rank
                                        // of each elf - all the elements are
                                        // set to 0
        
        // sometimes we want to setup the size and values of the array at the
        // same time
        
        String[] reindeerName = { "Dasher", "Dancer", "Prancer", "Vixen", 
                                  "Comet",  "Cupid",  "Donner",  "Blitzen" };
        
        // the size of the array is fixed once it is created - we cannot make it
        // bigger or smaller
        
        // we can use the elements in an array just like a variable, except we
        // need to "index" to the correct "element"
        
        System.out.println( reindeerName[0] );
        
        // what do you expect this line to print?  What if you replaced the 0 
        // with a 1? what about 8?
        
        // here is an array of the first 15 prime numbers
        int primes[] = { 1,  2,  3,  5,  7, 
                        11, 13, 17, 19, 23, 
                        29, 31, 37, 41, 43 };
        
        // we perform normal math operations on any of the elements
        int sum = primes[0] + primes[2] + primes[5];
        int prod = primes[1] * primes[3] * primes[14];
        
        System.out.println( "sum = " + sum );
        System.out.println( "prod = " + prod );

        // what do you expect these lines to print?
        
        // ====================================================================
        // arrays can tell us how big they are
        
        System.out.println( "There are " + reindeerName.length + " reindeer." );
        
        // what do you expect this line to print?  What if you changed
        // reindeerName to include "Rudolph"?
        
        // ====================================================================
        // you can change a string to the array of chars
        
        String mostFamous = "Rudolph the Red Nose Reindeer";
        
        char[] famous = mostFamous.toCharArray();   // changes String to array
                                                    // of chars
        
        // for loop on 0 to the length of the famous array
        for ( int index = 0; index < famous.length; index++ )
        {
            char current = famous[index];   // get the character at the index
            
            // if the character is a space, replace it with a "-"
            if ( current == ' ' )
            {
                System.out.print( '-' );
            }
            else
            {
                System.out.print( current );
            }
        }
        
        // end the line
        System.out.println();
        
        // ====================================================================
        // multidimentional arrays
        //
        int multi[][] = { { 0, 0, 0, 0 }, 
                          { 0, 1, 2, 3 }, 
                          { 0, 2, 4, 6 }, 
                          { 0, 3, 6, 9 } };
        
        int twoTimesTwo   = multi[2][2];
        int twoTimesThree = multi[2][3];
        
        System.out.println( "2 x 2 = " + twoTimesTwo ); 
        System.out.println( "2 x 3 = " + twoTimesThree ); 
        
        // try filling it in
        
        int [][] mult2 = new int[10][10];
        
        for ( int row = 0; row < 10; row++ ) {
            for ( int col = 0; col < 10; col++ ) {
                mult2[row][col] = row * col;
            }
        }
        
        System.out.println( "3 x 4 = " + mult2[3][4] ); 
        System.out.println( "6 x 7 = " + mult2[6][7] ); 

        // ====================================================================
        // you can sort arrays
        
        // first, let's print out the reindeer names in order
        
        System.out.println( "Original Order:" ); 
        
        for ( int index = 0; index < reindeerName.length; index++ )
        {
            System.out.println( reindeerName[index] );
        }
        
        // sort the array 
        Arrays.sort( reindeerName );
        
         // now, let's print out the reindeer names in alphabetical order

        System.out.println( "Alphabetical Order:" ); 
        
        for ( int index = 0; index < reindeerName.length; index++ )
        {
            System.out.println( reindeerName[index] );
        }

    }
}
