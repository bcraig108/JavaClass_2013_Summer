package Hour13;

import java.util.Calendar;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ClockPanel extends JPanel {

    public ClockPanel() {
        super();
        String currentTime = getTime();
        JLabel time = new JLabel( "Time: " );
        JLabel current = new JLabel( currentTime );
        add( time );
        add( current );
    }
    
    final String getTime() {
        Calendar now = Calendar.getInstance();
        
        int hour   = now.get( Calendar.HOUR_OF_DAY );
        int minute = now.get( Calendar.MINUTE );
        int month  = now.get( Calendar.MONTH );
        int day    = now.get( Calendar.DAY_OF_MONTH );
        int year   = now.get( Calendar.YEAR );
        
        return getMonth( month ) + " " + day + ", " + year + " " + 
                hour + ":" + minute;
    }
    
    String getMonth( int month ) {
        switch ( month + 1 ) {
            case  1: return "Jan";
            case  2: return "Feb";
            case  3: return "Mar";
            case  4: return "Apr";
            case  5: return "May";
            case  6: return "Jun";
            case  7: return "Jul";
            case  8: return "Aug";
            case  9: return "Sep";
            case 10: return "Oct";
            case 11: return "Nov";
            case 12: return "Dec";
            default: return "???";
        }
    }
}
