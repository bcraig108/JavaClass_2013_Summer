package Hour20;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class WordsReader {

    public WordsReader() {
        try {
            File file = new File( "Words.txt" );
            FileReader reader = new FileReader( file );
            BufferedReader buffer = new BufferedReader( reader );
            
            String line = null;
            
            while ( true ) {
                line = buffer.readLine();
                
                if ( line == null ) break;
    
                System.out.println( line ); 
            };
            
            buffer.close();
        }
        catch ( Exception e ) {
            System.out.println( "Error - " + e.toString() );
        }
    }
    
    public static void main(String[] args) {
        WordsReader reader = new WordsReader();
    }
}
