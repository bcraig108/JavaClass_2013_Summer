package Hour8;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dad
 */
public class Benchmark {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        long startTime = System.currentTimeMillis();
        long endTime = startTime + 60000;
        
        long index = 0;
        
        while ( true ) {
            double x = Math.sqrt(index);
            
            long now = System.currentTimeMillis();
            
            if ( now > endTime ) {
                break;
            }
            index++;
        }
        System.out.println( index + " loops in one minute." );
    }
}
