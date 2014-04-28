package Hour18;

public class FixedNumberDivider {

    public static void main(String[] args) {

        try {
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
        catch ( NumberFormatException e ) {
            System.out.println( "Both args must be integers" );
        }
        catch ( ArithmeticException e ) {
            System.out.println( "You cannot divide by zero" );
        }
        catch ( ArrayIndexOutOfBoundsException e ) {
            System.out.println( "Please provide 2 numbers" );
        }
    }
}
