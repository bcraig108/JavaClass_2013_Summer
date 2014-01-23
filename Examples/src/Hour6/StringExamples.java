package Hour6;

public class StringExamples {
    
    public static void main( String[] args )
    {
        // println() prints a line with a newline at the end
        System.out.println( "May the Force be with you." );
        
        // println() without any arguments prints just a newline
        System.out.println();
/*        
        // print() does not add a newline - several print() calls in a row will
        // end up on the same line
        System.out.print( "Use " );
        System.out.print( "the " );
        System.out.print( "Force, " );
        System.out.println( "Luke." ); 
        System.out.println();
        
        // Use a backslash in the string to print special caracters such as
        // double quotes (\"), newlines (\n), single quotes (\') and tabs (\t)
        System.out.println( "George Lucas directed \"Star Wars\"." );
        System.out.println();
        
        System.out.println( "Music by\nJohn Williams" );
        System.out.println();
        
        System.out.println( "\"\'Star Wars\' was a technical watershed that " +
                            "influenced many of the movies that came " +
                            "after.\"\n\t- Roger Ebert, Chicago Sun Times" );
        System.out.println();

        // you can print numbers and characters, too
        int length = 121;
        char rating = 'G';
        System.out.println( "Running Time: " + length + " minutes" );
        System.out.println( "Rating: " + rating );
        System.out.println();
        
        // you can add a string to itself this way:
        String searchKeywords = "";
        searchKeywords = searchKeywords + "sci-fi ";
        searchKeywords = searchKeywords + "fantasy ";
        searchKeywords = searchKeywords + "action ";
        
        System.out.println( "Search Keywords: " + searchKeywords );

        // or this way:
        String searchKeywords2 = "";
        searchKeywords2 += "sci-fi ";
        searchKeywords2 += "fantasy ";
        searchKeywords2 += "action ";
        
        System.out.println( "Search Keywords: " + searchKeywords2 );
        System.out.println();
        
        // you can compare strings
        String favorite = "Light Sabre";
        String guess = "Blaster";
        System.out.println( "Is Darth Vader's favorite weapon a " + 
                            guess + "?" );
        System.out.println( "Answer: " + favorite.equals( guess ) );
        System.out.println();
        
        // strings can tell you their length
        String ship = "X-Wing Fighter";
        System.out.println( "The String \"" + 
                            ship + "\" is " + 
                            ship.length() + " characters long." );
        System.out.println();
        
        // you can change the case of a string
        String hanSolo = "Harrison Ford";
        System.out.println( "HAN SOLO: " + hanSolo.toUpperCase() );
        System.out.println( "han solo: " + hanSolo.toLowerCase() );
        System.out.println();
        
        // you can search for a string
        String soloShip = "Millenium Falcon";
        int falcon = soloShip.indexOf( "Falcon" );
        int eagle = soloShip.indexOf( "Eagle" );
        
        System.out.println( "\"" + soloShip + "\" contains Falcon at " + 
                            falcon + " and Eagle at " + eagle );
        System.out.println();
        
        // strings within strings
        String jediMaster = "Obi Wan Kenobi";
        String hermit = "Ben " + jediMaster.substring(8);
        
        System.out.println( hermit + " is really " + jediMaster );
        System.out.println();
        
        String messengers = "C3PO and R2D2 have a message.";
        String recording = messengers.substring(9,13);
        
        System.out.println( messengers );
        System.out.println( recording + " has the recording." );
 */              
    }
}
