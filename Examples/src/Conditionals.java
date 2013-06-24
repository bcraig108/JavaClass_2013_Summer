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
/*
        // Run this program: Does the line above print?  Why or why not?
        // Change the play variable to true and run it again: Does it print?

        // =====================================================================
        
        // You can use the greater-than (>) or less-than (<) operator inside an
        // if statement
        
        final int DIAMONDS_FOR_SWORD = 2;
        int diamonds = 1;
        
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

        int hearts = 100;
        
        if ( hearts <= 0 )
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

        int zombie = 15;
        int enderman = 10;
        
        if ( zombie != enderman )
        {
            System.out.println( "A zombie is not an enderman" );
            System.out.println();                        
        }
        
        // Run this program: Does the line above print?  Why or why not?
        // What if you change enderman to 15?
        // =====================================================================

        // you do not need the curly braces if you only want to have ONE
        // statement after the "if"
        
        final double DIAMOND_HELMET     = 1.5;
        final double DIAMOND_CHESTPLATE = 4.0;
        final double DIAMOND_LEGGINGS   = 3.0;
        final double DIAMOND_BOOTS      = 1.5;
        
        double armor = DIAMOND_HELMET   + DIAMOND_CHESTPLATE + 
                       DIAMOND_LEGGINGS + DIAMOND_BOOTS;
        
        if ( armor < DIAMOND_HELMET   + DIAMOND_CHESTPLATE + 
                     DIAMOND_LEGGINGS + DIAMOND_BOOTS )
            System.out.println( "You are missing part of your armor" );
        
        // Run this program: Does the line above print?  Why or why not?
        // What if you remove DIAMOND_HELMET from line 104?
        // =====================================================================

        // what if you want to do one thing if a condition is true and another
        // thing if it is false?  Use an "else" statement!
        
        final int WOODEN_PICKAXE = 1;
        final int STONE_PICKAXE  = 2;
        
        final int STONE_BLOCK    = 1;
        final int IRON_BLOCK     = 2;
        final int GOLD_BLOCK     = 3;
        final int DIAMOND_BLOCK  = 4;
        
        int tool = STONE_PICKAXE;
        int block = IRON_BLOCK;
        
        if ( tool >= block )
        {
            System.out.println( "I can mine that!" );
            System.out.println();                        
        }
        else
        {
            System.out.println( "I can\'t mine that!" );
            System.out.println();                        
        }
        
        // Run this program: Which line of the 2 above prints?  Why?
        // What if you change the block to GOLD_BLOCK? What if you change tool
        // to WOODEN_PICKAXE?
        // =====================================================================

        // This can also be done with the ternary operator (?)
        System.out.print( "I " );
        System.out.print( ( tool >= block ) ? "can" : "can\'t" );
        System.out.println( " mine that!" );

        // Run this program: What do the 3 lines above print?  Why?
        // What if you change the block to GOLD_BLOCK? What if you change tool
        // to WOODEN_PICKAXE?
        // =====================================================================
        
        // You can test multiple conditions in order

        int block2 = IRON_BLOCK;

        if ( block2 == STONE_BLOCK )
        {
            System.out.println( "This is a stone block" );
            System.out.println();                        
        }
        else if ( block2 == IRON_BLOCK )
        {
            System.out.println( "This is an iron block" );
            System.out.println();                        
        }
        else if ( block2 == GOLD_BLOCK )
        {
            System.out.println( "This is a gold block" );
            System.out.println();                        
        }
        else if ( block2 == DIAMOND_BLOCK )
        {
            System.out.println( "This is a diamond block" );
            System.out.println();                        
        }
        else
        {
            System.out.println( "This is not a block" );
            System.out.println();                        
        }
        
        // Run this program: Which line of the above prints?  Why?
        // What if you change the block to GOLD_BLOCK? DIAMOND_BLOCK? -1?
        // =====================================================================

        // you can also make decisions with switch statements
        
        final int SURVIAL_MODE = 0;
        final int CREATIVE_MODE = 1;
        final int ADVENTURE_MODE = 2;
        
        int gameMode = 0;

        switch ( gameMode )
        {
        case SURVIAL_MODE:
            System.out.println( "You are playing in survival mode" );
            System.out.println();
            break;
        case CREATIVE_MODE:
            System.out.println( "You are playing in creative mode" );
            System.out.println();
            break;
        case ADVENTURE_MODE:
            System.out.println( "You are playing in adventure mode" );
            System.out.println();
            break;
        default:
            System.out.println( "You are playing in an unknown mode" );
            System.out.println();
        }
*/        
        // Run this program: Which line of the above prints?  Why?
        // What if you change the block to GOLD_BLOCK? DIAMOND_BLOCK? -1?
        // =====================================================================
        
        
    }
}
