/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dad
 */
public class GradeScale {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int  score = Integer.parseInt( args[0] );
        char grade;        
        
        if ( score > 90 )
        {
            grade = 'A';
        }
        else if ( score > 80 )
        {
            grade = 'B';
        }
        else if ( score > 70 )
        {
            grade = 'C';
        }
        else if ( score > 60 )
        {
            grade = 'D';
        }
        else
        {
            grade = 'F';
        }
        
        System.out.println( "Your score of " + score + " is " +  grade );
    }
}
