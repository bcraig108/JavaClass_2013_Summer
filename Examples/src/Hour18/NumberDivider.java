package Hour18;

public class NumberDivider {

    public static void main(String[] args) {

        int result = 
                Integer.parseInt( args[0] ) / 
                Integer.parseInt( args[1] );
        int rem = 
                Integer.parseInt( args[0] ) % 
                Integer.parseInt( args[1] );

        System.out.println( 
                args[0] + "/" + args[1] + " = " + 
                result + " r " + rem );        
    }
}
