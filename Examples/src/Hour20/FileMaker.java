package Hour20;

import java.io.File;
import java.io.IOException;

public class FileMaker {

    public static void main(String[] args) {

        File file = new File( "test.txt" );
        
        if ( file.exists() == false ) {
            System.out.println( file.getName() + " does not exist." );
            
            try {
                file.createNewFile();
            }
            catch ( IOException e ) {
            }
        }
        else {
            File file2 = new File( "test2.txt" );
            file.renameTo(file2);
        }
    }
}
