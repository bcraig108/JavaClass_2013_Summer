package Hour14;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class BoxCrisis extends JFrame {

    JButton panicButton;
    JButton dontPanicButton;
    JButton blameButton;
    JButton mediaButton;
    JButton saveButton;
    
    public BoxCrisis() {
        super( "Crisis" );
        setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        
        panicButton = new JButton( "Panic" );
        dontPanicButton = new JButton( "Don't Panic" );
        blameButton = new JButton( "Blame Others" );
        mediaButton = new JButton( "Notify the Media" );
        saveButton = new JButton( "Save Yourself" );
        
        JPanel pane = new JPanel();
        BoxLayout box = new BoxLayout( pane, BoxLayout.X_AXIS );
        pane.setLayout( box );
        
        pane.add( panicButton );
        pane.add( dontPanicButton );
        pane.add( blameButton );
        pane.add( mediaButton );
        pane.add( saveButton );
        
        add( pane );

        pack();
        
        setVisible(true);                
    }
    
    public static void main(String[] args) {
        BoxCrisis crisis = new BoxCrisis();
    }
}
