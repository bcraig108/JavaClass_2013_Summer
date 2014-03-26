package Hour14;

import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class GridCrisis extends JFrame {

    JButton panicButton;
    JButton dontPanicButton;
    JButton blameButton;
    JButton mediaButton;
    JButton saveButton;
    
    public GridCrisis() {
        super( "Crisis" );
        setSize( 348, 128 );
        setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        
        GridLayout grid = new GridLayout( 2, 3 );
        setLayout( grid );
        
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
        GridCrisis crisis = new GridCrisis();
    }
}
