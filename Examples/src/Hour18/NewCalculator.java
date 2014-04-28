package Hour18;

public class NewCalculator {

    public static void main(String[] args) {

        float sum = 0;
        
        for ( int index = 0; index < args.length; index++ ) {
            try {
                sum += Float.parseFloat(args[index]);
            }
            catch ( NumberFormatException e ) {
                System.out.println( args[index] + " is not a number" );
            }
        }
        System.out.println( "These numbers add up to " + sum );        
    }
}
