package Hour18;

public class PhoneBookEntry {
    
    private String name;
    private String phone;
    
    public PhoneBookEntry( String n, String p ) throws NumberFormatException {
        try {
            name = n;
            ValidatePhone(p);
            phone = p;
        }
        catch( NumberFormatException ex ) {
            System.out.println( "PhoneBookEntry: " + ex.getMessage() );
            throw ex;
        }
    }
 
    public String GetName() { return name; };
    
    public String GetPhone() { return phone; };

    private void ValidatePhone(String p) throws NumberFormatException {
        char [] phoneArray = p.toCharArray();

        if ( phoneArray.length != 8 ) {
            throw new NumberFormatException( 
                            "Expected phone number format: XXX-XXXX" );
        }
        else {
            for ( int index = 0; index < phoneArray.length; index++ ) {
                if ( index == 3 && phoneArray[3] != '-' ) {
                    throw new NumberFormatException( 
                            "Expected phone number format: XXX-XXXX" );
                }
                else if ( index != 3 && 
                          Character.isDigit( phoneArray[index] ) == false ) {
                    throw new NumberFormatException( 
                            "Expected phone number format: XXX-XXXX" );      
                }
            }
        }
    }
}
