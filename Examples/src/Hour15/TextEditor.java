package Hour15;

import java.awt.BorderLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class TextEditor extends JFrame implements ItemListener {
    
    JPanel buttonPanel;

    JButton newButton;
    JButton openButton;
    JButton saveButton;
    JButton saveAsButton;
    JCheckBox enableBox;
    JTextArea text;
    
    JPanel mainPanel;

    public TextEditor() {
        super( "Text Editor v 1.0" );
        
        setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        
        // setup the button panel
        newButton = new JButton( "New..." );
        openButton = new JButton( "Open..." );
        saveButton = new JButton( "Save" );
        saveAsButton = new JButton( "Save As..." );
        enableBox = new JCheckBox( "Enable", true );
        
        JPanel buttonPanel = new JPanel();
        BoxLayout box = new BoxLayout( buttonPanel, BoxLayout.X_AXIS );
        buttonPanel.setLayout( box );
        
        buttonPanel.add( newButton );
        buttonPanel.add( openButton );
        buttonPanel.add( saveButton );
        buttonPanel.add( saveAsButton );
        buttonPanel.add( enableBox );
        
        enableBox.addItemListener(this);
        
        BorderLayout border = new BorderLayout();
        setLayout( border );
        add( buttonPanel, BorderLayout.NORTH );

        text = new JTextArea( 30, 80 );
        add( text, BorderLayout.CENTER );
        
        pack();
        
        setVisible(true);
    }

    @Override
    public void itemStateChanged(ItemEvent ie) {

        boolean enabled = false;
        if ( ie.getStateChange() == ItemEvent.SELECTED ) {
            enabled = true;
        }
        
        newButton.setEnabled( enabled );
        openButton.setEnabled( enabled );
        saveButton.setEnabled( enabled );
        saveAsButton.setEnabled( enabled );
        text.setEnabled( enabled );
    }

    public static void main( String[] args ) {
        TextEditor editor = new TextEditor();
    }    
}
