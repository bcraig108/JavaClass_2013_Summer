public class SecretWordV1 {

    public static void main(String[] args) {
        String secret = "java";
        
        if ( secret.equals(args[0].toLowerCase()) )
        {
            System.out.println( "You guessed the secret word!"  );
        }
        else
        {
            System.out.println( "Sorry, try again!"  );
        }
    }
}
