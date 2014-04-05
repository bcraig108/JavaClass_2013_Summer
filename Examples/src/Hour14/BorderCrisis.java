package Hour14;

import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class BorderCrisis extends JFrame {

    JButton panicButton;
    JButton dontPanicButton;
    JButton blameButton;
    JButton mediaButton;
    JButton saveButton;
    
    public BorderCrisis() {
        super( "Crisis" );
        setSize( 348, 128 );
        setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        
        panicButton = new JButton( "Panic" );
        dontPanicButton = new JButton( "Don't Panic" );
        blameButton = new JButton( "Blame Others" );
        mediaButton = new JButton( "Notify the Media" );
        saveButton = new JButton( "Save Yourself" );
        
        BorderLayout border = new BorderLayout();
        setLayout( border );
        
        add( panicButton, BorderLayout.NORTH );
        add( dontPanicButton, BorderLayout.SOUTH );
        add( blameButton, BorderLayout.EAST );
        add( mediaButton, BorderLayout.WEST );
        add( saveButton, BorderLayout.CENTER );
        
        setVisible(true);                
    }
    
    public static void main(String[] args) {
        BorderCrisis crisis = new BorderCrisis();
    }
}
