package Hour10;

/**
 * The Horse class is an introduction to objects and classes
 * @author Brian Craig
 */
public class Horse {
    
    /**
     * the horse has a name - this is an attribute
     */
    String theName;
    
    /**
     * the horse remembers how many races it has run - this is an attribute
     */
    int runCount;
    
    /**
     * the horse remembers how many times it jumped - this is an attribute
     */
    int jumpCount;
    
    /**
     * This is the call the constructor - it creates a Horse object
     * @param name this is the name of the horse
     */
    Horse( String name )
    {
        theName = name;
        runCount = 0;
        jumpCount = 0;
    }

    /**
     * The horse can run - this is a behavior
     */
    void run()
    {
        System.out.println( "Run, " + theName + ", Run!" );
        runCount++;
    }
    
    /**
     * The horse can jump - this is another behavior
     */
    void jump()
    {
        System.out.println( "Jump, " + theName + ", Jump!" );
        jumpCount++;
    } 
    
    /**
     * The horse can tell how many times it has run and jumped - this is a
     * behavior
     */
    void stats()
    {
        System.out.println( theName + " has run " + runCount + " time(s)." );
        System.out.println( theName + " has jumped " + jumpCount + " time(s)." );        
    }
    
    /**
     * Main is ALWAYS where the program starts
     */
    public static void main(String[] args) 
    {
        //======================================================================
        // let's create a horse called Rusty
        //
        Horse horse1 = new Horse( "Rusty" );
        
        // rusty can run
        horse1.run();
        
        // rusty can jump
        horse1.jump();

        //======================================================================
        // let's create a horse called Smokey
        //
        Horse horse2 = new Horse( "Smokey" );
        
        // Smokey can also run and jump
        horse2.run();
        horse2.jump();
        
        // He will run again
        horse2.run();     
        
        //======================================================================
        // Rusty and Smokey will race each other
        //
        horse1.run();
        horse2.run();
        
        //======================================================================
        // Let's see how many times they have run and jumped
        horse1.stats();
        horse2.stats();
    }
}
