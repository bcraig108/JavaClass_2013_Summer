package Hour18;

public class Calculator {

    public static void main(String[] args) {

        float sum = 0;
        
        for ( int index = 0; index < args.length; index++ ) {
            sum += Float.parseFloat(args[index]);
        }
        
        System.out.println( "These numbers add up to " + sum );
    }
}
