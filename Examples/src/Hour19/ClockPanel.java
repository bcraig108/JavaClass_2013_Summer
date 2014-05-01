package Hour19;

import java.text.DateFormat;
import java.util.Calendar;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ClockPanel extends JPanel implements Runnable {

    JLabel timeLabel;
    Thread timeThread;
    
    public ClockPanel() {
        setSize( 100, 50 );
        timeLabel = new JLabel();
        add( timeLabel );
        
        timeThread = new Thread( this );
        timeThread.start();
    }

    @Override
    public void run() {
        
        while ( timeThread == Thread.currentThread() ) {
            
            timeLabel.setText( 
                    DateFormat.getTimeInstance(DateFormat.LONG).format( 
                        Calendar.getInstance().getTime() ) );
            
            try {
                Thread.sleep( 1000 );
            }
            catch ( InterruptedException e ) {
                // do nothing
            }
        }
    }
}
