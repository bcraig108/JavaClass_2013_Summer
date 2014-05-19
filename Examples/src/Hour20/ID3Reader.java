package Hour20;

import java.io.File;
import java.io.FileInputStream;

public class ID3Reader {

    public static void main( String[] args ) {
        try {
            File            file    = new File( args[0] );
            FileInputStream stream  = new FileInputStream( file );
            long            size    = file.length();
            byte[]          last128 = new byte[128];

            stream.skip( size - 128 );
            stream.read( last128 );

            String id3 = new String( last128 );
            String tag = id3.substring( 0, 3 );

            if ( tag.equals( "TAG" ) ) {
                System.out.println( "Title : " + id3.substring(  3, 32 ) );
                System.out.println( "Artist: " + id3.substring( 33, 62 ) );
                System.out.println( "Album : " + id3.substring( 63, 92 ) );                
                System.out.println( "Year  : " + id3.substring( 93, 97 ) );                
                System.out.println( "Other : " + id3.substring( 98, 127 ) );                
            } else {
                System.out.println( "No ID3 data" ); 
            }
            stream.close();
        }
        catch ( Exception e ) {
            System.out.println( "Error - " + e.toString() );
        }
    }
}
