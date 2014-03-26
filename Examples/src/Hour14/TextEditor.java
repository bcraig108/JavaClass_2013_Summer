package Hour14;

import java.awt.BorderLayout;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class TextEditor extends JFrame {
    
    JPanel buttonPanel;

    JButton newButton;
    JButton openButton;
    JButton saveButton;
    JButton saveAsButton;
        
    JPanel mainPanel;

    public TextEditor() {
        super( "Text Editor v 1.0" );
        
        setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        
        // setup the button panel
        newButton = new JButton( "New..." );
        openButton = new JButton( "Open..." );
        saveButton = new JButton( "Save" );
        saveAsButton = new JButton( "Save As..." );
        
        JPanel buttonPanel = new JPanel();
        BoxLayout box = new BoxLayout( buttonPanel, BoxLayout.X_AXIS );
        buttonPanel.setLayout( box );
        
        buttonPanel.add( newButton );
        buttonPanel.add( openButton );
        buttonPanel.add( saveButton );
        buttonPanel.add( saveAsButton );
        
        BorderLayout border = new BorderLayout();
        setLayout( border );
        add( buttonPanel, BorderLayout.NORTH );

        JTextArea text = new JTextArea( 30, 80 );
        add( text, BorderLayout.CENTER );
        
        pack();
        
        setVisible(true);
    }
    
    public static void main( String[] args ) {
        TextEditor editor = new TextEditor();
    }    
}
