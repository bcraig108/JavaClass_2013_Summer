package Hour20;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class ConfigWriter {
    
    String newline = System.getProperty( "line.separator" );

    public ConfigWriter() {
        try {
            File file = new File( "program.properties" );
            FileOutputStream stream = new FileOutputStream( file );
            
            String output = "username=bmcraig" + newline;
            stream.write( output.getBytes() );

            output = "score=12550" + newline;
            stream.write( output.getBytes() );
            
            output = "level=5" + newline;
            stream.write( output.getBytes() );
            stream.close();
        }
        catch ( IOException ioe ) {
            System.out.println( "Could not write file: " + ioe.getMessage() ) ; 
        }
    }

    private void write( FileOutputStream stream, String output ) 
            throws IOException {
        output += newline;
        byte[] data = output.getBytes();
        stream.write( data );
    }
    
    public static void main(String[] args) {
        ConfigWriter cf = new ConfigWriter();
    }
}
