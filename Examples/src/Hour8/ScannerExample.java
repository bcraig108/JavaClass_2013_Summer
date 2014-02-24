/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Hour8;

import java.util.Scanner;

/**
 *
 * @author Brian & Denise
 */
public class ScannerExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner input = new Scanner( System.in );
   
        System.out.println( "Please enter your name > " );
        String number = input.nextLine();
        int num = Integer.parseInt(number);
        //System.out.println( "Hello, " + name );
        System.out.println( number + " * " + number  + " = " + (num * num));
    }
}
