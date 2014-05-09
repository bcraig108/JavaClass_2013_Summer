package Hour20;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class ConfigWriter2 {
    
    String newline = System.getProperty( "line.separator" );

    public ConfigWriter2() {
        try {
            File       file   = new File( "program2.properties" );
            FileWriter writer = new FileWriter( file );
            
            writer.write( "username=bmcraig" + newline );
            writer.write( "score=12550" + newline );
            writer.write( "level=5" + newline );
            writer.close();
        }
        catch ( IOException ioe ) {
            System.out.println( "Could not write file: " + ioe.getMessage() ) ; 
        }
    }
    
    public static void main(String[] args) {
        ConfigWriter2 cf = new ConfigWriter2();
    }
}
