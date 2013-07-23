package Hour10;

/**
 * The Candy class is a base class for understanding inheritance
 * @author Brian Craig
 */
public class Candy {

    /**
     * All candy types have a name
     */
    String name;
    
    /**
     * All candy types have ingredients
     */
    String [] ingredients;
    
    /**
     * All candy has a certain number of bites
     */
    int bites;
    
    /**
     * All candy can be eaten - one bite at a time
     * @return the number of bites left
     */
    int bite()
    {
        if ( bites > 0 )
        {
            System.out.println( "This " + name + " is good!" );
            bites--;
        }
        else
        {
            System.out.println( "The " + name + " is gone!" );
        }
        
        return bites;
    }
    
    /**
     * All candy has a label - read it!
     */
    void readLabel()
    {
        System.out.println( name + " ingredients:" );
        
        for ( int index = 0; index < ingredients.length; index++ )
        {
            System.out.println( ingredients[index] );
        }
    }
}
