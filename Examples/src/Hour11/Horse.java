package Hour11;

/**
 * The Horse class is an introduction to objects and classes
 * @author Brian Craig
 */
public class Horse {
    
    /**
     * The horse has a name.
     * - This is an attribute 
     * - public means that other classes can read and change this variable
     * - Every horse object has its own name
     */
    public String name;
    
    /**
     * The horse remembers how many races it has run.
     * - This is an attribute
     * - protected means that only child classes can read and change this 
     *   variable
     * - Every horse object has its own runCount
     */
    protected int runCount;
    
    /**
     * The horse remembers how may strides it has run.
     * - This is an attribute
     * - private means that only this class can read and change this variable
     * - Every horse object has its own strideCount
     */
    private int strideCount;
    
    /**
     * The horse remembers how many times it jumped.
     * - This is an attribute
     * - private means that only this class can read and change this variable
     * - Every horse object has its own jumpCount
     */
    private int jumpCount;
    
    /**
     * Keep track of how many horses have been created.
     * - private means that only this class can read and change this variable
     * - static means that all objects of the class share the same variable
     */
    private static int horseCount = 0;
    
    /**
     * This method is the call the constructor - it creates a Horse object.
     * - public means that other classes can call the constructor
     * 
     * @param name this argument is used to pass the name of the horse to the
     *             constructor
     */
    public Horse( String name )
    {
        this.name = name;   // "this" refers to the object being created. 
                            // It is needed here to distinguish between the
                            // argument name and the object member name
        
        this.runCount = 0;  // "this" refers to the object being created. 
                            // It is not needed here, but can be used if you want
        
        strideCount = 0;    // No "this" here.  It is not needed
        jumpCount = 0;
        
        horseCount++;       // Cannot have "this" here.  This is a static
                            // variable.  It does not belong to "this" horse.
                            // It belongs to all the horses.
        
        System.out.println( "Happy Birthday, " + this.name );
    }

    public Horse( Horse horse )
    {
        this.name = horse.name;
        this.runCount = horse.runCount;
        this.strideCount = horse.strideCount;
        this.jumpCount = horse.jumpCount;
        
        horseCount++; 
        
        System.out.println( "Happy Birthday, " + this.name );
    }

    /**
     * This method makes the horse run.
     * - this is a behavior
     * - public means that other classes can call run()
     * 
     * @param stride the number of strides to run
     * @return the number of times the horse has run
     */
    public int run( int strides )
    {
        System.out.println( name + " ran " + strides + " strides." );
        runCount++;
        strideCount += strides;
        
        return runCount;
    }
    
    /**
     * This method makes the horse run a random number of strides.
     * - this is a behavior
     * - public means that other classes can call run()
     * 
     * @return the number of times the horse has run
     */
    public int run()
    {
        return run( (int)( 200.0 * Math.random() ) );
    }
    
    /**
     * This method makes the horse jump.
     * - this is a behavior
     * - public means that other classes can call jump()
     */
    public void jump()
    {
        System.out.println( "Jump, " + name + ", Jump!" );
        jumpCount++;
    } 
    
    /**
     * This method tells how many times the horse has run and jumped.
     * - this is a behavior
     * - public means that other classes can call stats()
     */
    public void stats()
    {
        System.out.println( name + " has run " + runCount + " time(s)." );
        System.out.println( name + " has jumped " + jumpCount + " time(s)." );        
    }
    
    /**
     * This method returns the number of horses.
     * - public means that other classes can call stats()
     * - static means that this can be called without an object
     * - int on the method line means that this method returns an int
     */
    static int howMany()
    {
        return horseCount;
    }

    /**
     * strideCount accessors
     */
    final public int getStrideCount() { return strideCount; };

    public void setStrideCount( int count ) { strideCount = count; };
    
    public void addStrides( int count ) { strideCount += count; };
    
    /**
     * Main is ALWAYS where the program starts
     */
    public static void main(String[] args) 
    {
        //======================================================================
        // We're at the beginning of the program. How many horses are there?
        int count = Horse.howMany();
        System.out.println( "There are " + count + " horses." );
        
        //======================================================================
        // let's create a horse called Rusty
        //
        Horse horse1 = new Horse( "Rusty" );
        
        // rusty can run
        horse1.run( 100 );
        
        // rusty can jump
        horse1.jump();
        
        // How many horses are there now?
        count = Horse.howMany();
        System.out.println( "There are " + count + " horses." );

        //======================================================================
        // let's create a horse called Smokey
        //
        Horse horse2 = new Horse( "Smokey" );
        
        // Smokey can also run and jump
        horse2.run( 100 );
        horse2.jump();
        
        // He will run again
        horse2.run( 150 );
        
        // How many horses are there now?
        System.out.println( "There are " + Horse.howMany() + " horses." );

        //======================================================================
        // Rusty and Smokey will race each other
        //
        horse1.run( 300 );
        horse2.run( 300 );
        
        //======================================================================
        // Let's see how many times they have run and jumped
        horse1.stats();
        horse2.stats();
    }
}
