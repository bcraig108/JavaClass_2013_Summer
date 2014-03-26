package Hour14;

import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class Crisis extends JFrame {

    JButton panicButton;
    JButton dontPanicButton;
    JButton blameButton;
    JButton mediaButton;
    JButton saveButton;
    
    public Crisis() {
        super( "Crisis" );
        setSize( 348, 128 );
        setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        
        FlowLayout flow = new FlowLayout();
        setLayout( flow );
        
        panicButton = new JButton( "Panic" );
        dontPanicButton = new JButton( "Don't Panic" );
        blameButton = new JButton( "Blame Others" );
        mediaButton = new JButton( "Notify the Media" );
        saveButton = new JButton( "Save Yourself" );
        
        add( panicButton );
        add( dontPanicButton );
        add( blameButton );
        add( mediaButton );
        add( saveButton );
        
        setVisible(true);
        
                
    }
    
    public static void main(String[] args) {
        Crisis crisis = new Crisis();
    }
}
