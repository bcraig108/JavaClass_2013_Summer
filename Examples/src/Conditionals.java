/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dad
 */
public class Conditionals {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // =====================================================================

        // if conditionals are used to do something if and only if the condition
        // is met
        boolean play = false;
        
        if ( play )
        {
            System.out.println( "Let\'s play Minecraft!" );
            System.out.println();
        }

        // Run this program: Does the line above print?  Why or why not?
        // Change the play variable to true and run it again: Does it print?

        // =====================================================================
        
        // You can use the greater-than (>) or less-than (<) operator inside an
        // if statement
        
        final int DIAMONDS_FOR_SWORD = 100;
        int diamonds = 50;
        
        if ( diamonds > DIAMONDS_FOR_SWORD )
        {
            System.out.println( "Let's craft a diamond sword!" );
            System.out.println();
        }
        
        // Run this program: Does the line above print?  Why or why not?
        // What can you change to make the result different?

        // =====================================================================
        
        // You can also use the less-than-or-equal-to (<=) or greater-than-or-
        // equal-to (>=) operator inside an if statement

        int life = 100;
        
        if ( life <= 0 )
        {
            System.out.println( "You have died. Respawn?" );
            System.out.println();
        }

        // Run this program: Does the line above print?  Why or why not?
        // What if you change life to 0? -10?
        
        // =====================================================================
        
        // You can use the equal (==) operator inside an if statement
        
        int creeperLife = 10;
        
        if ( creeperLife == 0 )
        {
            System.out.println( "You killed the creeper" );
            System.out.println();            
        }
        
        // Run this program: Does the line above print?  Why or why not?
        // What if you change creeperLife to 0?
        // =====================================================================
        
        // You can use the not-equal (!=) operator inside an if statement
        
        final int SURVIAL_MODE = 0;
        int gameMode = 0;
        
        if ( gameMode != SURVIAL_MODE )
        {
            System.out.println( "You are NOT playing in survival mode" );
            System.out.println();            
        }
        
        // Run this program: Does the line above print?  Why or why not?
        // What if you change gameMode to 1?
        
        
    }
}
