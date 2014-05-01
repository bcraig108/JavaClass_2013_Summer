
package Hour19;

import java.awt.BorderLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JToolBar;

public class Tool extends JFrame {

    Tool() {
        super( "Tool" );
        setSize( 370, 200 );
        setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        
        ImageIcon newIcon  = new ImageIcon( "images/newfile.gif" );
        JButton newButton  = new JButton( "New...", newIcon );
        newButton.setToolTipText( "Use this to create a new file..." );
        
        ImageIcon openIcon = new ImageIcon( "images/openfile.gif" );
        JButton openButton = new JButton( openIcon );
        openButton.setToolTipText( "Open..." );
        
        ImageIcon saveIcon = new ImageIcon( "images/savefile.gif" );
        JButton saveButton = new JButton( saveIcon );
        saveButton.setToolTipText( "Save..." );
        
        JToolBar bar = new JToolBar();
        bar.add( newButton );
        bar.add( openButton );
        bar.add( saveButton );
        
        JTextArea editArea   = new JTextArea( 8, 40 );
        JScrollPane editPane = new JScrollPane( editArea );
        ClockPanel clockPanel = new ClockPanel();
        
        BorderLayout border = new BorderLayout();
        setLayout( border );
        
        add( bar, BorderLayout.NORTH );
        add( editPane, BorderLayout.CENTER );
        add( clockPanel, BorderLayout.SOUTH );
        
        setVisible( true );
    }
    
    public static void main(String[] args) {
        Tool tool = new Tool();
    }
}
