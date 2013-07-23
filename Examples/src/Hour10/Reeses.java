package Hour10;

/**
 * The Reeses class is a child class of Candy - designed to describe inheritance
 * @author Brian Craig
 */
public class Reeses extends Candy {

    /**
     * Reeses are packaged in cups
     */
    int cups;
    
    /**
     * This is the constructor for the Reeces 
     */
    Reeses()
    {
        // name is an attribute or member of candy - we give it a value here
        name = "Reeses";
        
        // ingredients is also a member of Candy - we give it values here
        ingredients = new String[6];
        ingredients[0] = "Milk Chocolate";
        ingredients[1] = "Peanuts";
        ingredients[2] = "Sugar";
        ingredients[3] = "Dextrose";
        ingredients[4] = "Salt";
        ingredients[5] = "TBHQ";
        
        // bites is an attritute or member of candy - we give it a value here
        bites = 6;
        
        // cups is a member of Reeses, not of candy
        cups = 2;
    }
    
    /**
     * bite is a method (behavior) of Candy, but we need to need to do a little
     * more here, because we are also keeping track of cups
     */
    @Override
    int bite()
    {
        // call the Candy version of bite
        super.bite();
        
        // keep track of how many cups are left
        if ( bites % 3 == 0 && cups > 0 )
            cups--;
        
        return bites;
    }
    
    public static void main(String[] args) {

        // create a Reeses object
        Reeses reeses = new Reeses();
        
        // read the label
        reeses.readLabel();
        
        // eat until it is gone
        while ( reeses.bite() > 0 );  
        
        // try to take another bite
        reeses.bite();
    }
}
