package Hour10;

/**
 * The KitKat class is a child class of Candy - designed to describe inheritance
 * @author Brian Craig
 */
public class KitKat extends Candy {
    
    /**
     * This creates a KitKat object - it is call the constructor
     */
    KitKat()
    {
        // name is an attribute or member of candy - we give it a value here
        name = "KitKat";
        
        // ingredients is also a member of Candy - we give it values here
        ingredients = new String[8];
        ingredients[0] = "Sugar";
        ingredients[1] = "Wheat Flour";
        ingredients[2] = "Nonfat Milk";
        ingredients[3] = "Cocoa Butter";
        ingredients[4] = "Chocolate";
        ingredients[5] = "Palm Kernel Oil";
        ingredients[6] = "Lactose";
        ingredients[7] = "Milk Fat";
        
        // bites is an attritute or member of candy - we give it a value here
        bites = 8;
    }
    
    public static void main( String[] args )
    {
        // create a KitCat object
        KitKat kitKat = new KitKat();
        
        // take 2 bites
        kitKat.bite();
        kitKat.bite();
        
        // read the label
        kitKat.readLabel();
    }
}
