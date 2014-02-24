package Hour8;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dad
 */
public class Loops {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
        // "for" loops repeat a block of code a fixed number of times.
        
        for ( int index = 0; index < 10; index++ )
        {
            System.out.println( "I will not hit my brother." );
        }
    
        // What do you think this loop will do?  How many times will it be
        // repeated?  What if you change the "10" to a "5"?
        
        // ====================================================================

        // like "if" statements, you can loop on a single line with out the 
        // curly braces
        
        for ( int index = 0; index < 10; index++ )
            System.out.println( "I will not pinch my sister." );
       
        // What do you think this loop will do?  How many times will it be
        // repeated?  What if you change the "10" to a "5"?
        
        // ====================================================================
        
        // "for" loops stop when the loop condition is no longer true
        
        for ( int number = 0; number < 144; number++ )
        {
            if ( number % 12 == 0 )
            {
                System.out.println( "# " + number );
            }
        }
        
        // What do you think this loop will do?  How many times will it be
        // repeated?  What if you change the "<" to a "<="?  What would happen
        // if you removed the "if" statement?
        
        // ====================================================================
        
        // This "for" loop behaves the same way as the previous one.  Why?
        
        for ( int number = 0; number < 144; number += 12 )
        {
            System.out.println( "# " + number );
        }
        
        // What do you think this loop will do?  How many times will it be
        // repeated?  What if you change the "<" to a "<="?  What would happen
        // if you removed the "if" statement?
        
        // ====================================================================
        
        // "while" loops repeat while the condition is true
        
        int count = 0;
        int limit = 5;
        
        while ( count < limit )
        {
            System.out.println( "Don't make me repeat myself!" );
            count++;
        }
        
        // What do you think will happen in this loop?  How many times will it
        // be repeated?  What happens if you remove "count++"? Why? What happens
        // if you start count at 5? Why?
    
        // ====================================================================
        
        // "do-while" loops are similar to "while" loops, but the condition is
        // checked at the end
        
        int potato = 1;
        
        do
        {
            System.out.print( potato + " potato, " );
            potato++;
        }
        while ( potato <= 3 );
        
        System.out.println( potato );
       
        // What do you think will happen in this loop?  How many times will it
        // be repeated?  What happens if you remove "potato++"? Why? What
        // happens if you start count at 3? 4? Why?

        // ====================================================================
        
        // A "break" statement is used to exit a loop
        
        int fun = 1;
        
        while ( true )
        {
            System.out.print( "Fun! " );
            
            if ( fun == 3 )
                break;
            
            fun++;
        }
        System.out.println();
        
        // What do you think will happen here?

        // ====================================================================
        
        // A "continue" statement is used to exit a loop block early, starting
        // the next time through
        
        for ( int index = 1; index <= 20; index++ )
        {
            if ( index % 5 != 0 )
                continue;
            
            System.out.print( index + "-" );
        }
        System.out.println();
        
        // What do you think will happen here?

        // ====================================================================
        
        // Using a loop label allows you to exit both loops at once.
        
        int points = 0;
        int target = 100;
        
        targetLoop:
        while ( target <= 100 )
        {
            for ( int i = 0; i < target; i++ )
            {
                if ( points > 50 )
                    break targetLoop;
                points = points + i;
                System.out.println( "points " + points );
            }
        }
        
        // ====================================================================
        
        // "for" loops can have more that one index value - as in this example.
        // There are 2 indexes, i and j.  Both are initialized to 0.  Both are
        // used in the conditional.  Both are incremented each time through the
        // loop.
        
        int i, j;
        
        for ( i = 0, j = 0; i * j < 1000; i++, j += 2 )
        {
            System.out.println( i + " * " + j + " = " + ( i * j ) );
        }
    }
}
