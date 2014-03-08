
public class SecretWordV2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String secret = "java";
        
        if ( args[0].toLowerCase().equals( secret ) )
        {
            System.out.println( "You guessed the secret word!" );
        }
        else
        {
            System.out.println( "Try again!" );
        }
            
    }
}
