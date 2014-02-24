
public class SecretWordV1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String secret = "java";
        
        System.out.println( "Match = " + 
                args[0].toLowerCase().equals( secret ) );
    }
}
