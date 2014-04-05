package Hour15;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class CrisisListener extends JFrame implements ActionListener {

    JPanel northPanel;

    JButton panicButton;
    JButton dontPanicButton;
    JButton blameButton;
    JButton mediaButton;
    JButton saveButton;

    JLabel feedbackText;
    JLabel adviceText;
    
    public CrisisListener() {
        super( "Crisis" );
        setSize( 600, 128 );
        setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        
        panicButton = new JButton( "Panic" );
        dontPanicButton = new JButton( "Don't Panic" );
        blameButton = new JButton( "Blame Others" );
        mediaButton = new JButton( "Notify the Media" );
        saveButton = new JButton( "Save Yourself" );
        adviceText = new JLabel();
        feedbackText = new JLabel();
        
        northPanel = new JPanel();
        FlowLayout flow = new FlowLayout();
                
        northPanel.setLayout( flow );
        northPanel.add( panicButton );
        northPanel.add( dontPanicButton );
        northPanel.add( blameButton );
        northPanel.add( mediaButton );
        northPanel.add( saveButton );
        
        BorderLayout border = new BorderLayout();
        setLayout( border );
        
        add( northPanel, BorderLayout.NORTH );
        add( feedbackText, BorderLayout.CENTER );
        add( adviceText, BorderLayout.SOUTH );
        
        panicButton.addActionListener(this);
        dontPanicButton.addActionListener(this);
        blameButton.addActionListener(this);
        mediaButton.addActionListener(this);
        saveButton.addActionListener(this);
        
        setVisible(true);
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
                
        Object source = ae.getSource();
        
        if ( source == panicButton ) {
            adviceText.setText( 
                    "\"If I panic, everyone else panics.\" - Kobe Bryant" );
        }
        else if ( source == dontPanicButton ) {
            adviceText.setText( 
                    "Read \'Hitchhiker's Guide to the Galaxy\' " + 
                    "by Douglas Adams" );
        }
        else if ( source == blameButton ) {
            adviceText.setText( 
                    "\"When people are lame, they love to blame.\" " +
                    "- Robert Kiyosaki" );
        }
        else if ( source == mediaButton ) {
            adviceText.setText( 
                    "\"Kick 'em when they're up, kick 'em when they're down\"" +
                    " - Don Henley" );
        }
        else if ( source == saveButton ) {
            adviceText.setText( "\"Help!\"" );
        }
        
        feedbackText.setText( "You clicked: " + ae.getActionCommand() );
    }    
    
    public static void main(String[] args) {
        CrisisListener crisis = new CrisisListener();
    }

}
