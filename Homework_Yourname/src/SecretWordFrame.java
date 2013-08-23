/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author Dad
 */
public class SecretWordFrame extends JFrame implements ActionListener {
    
    JTextField  field;
    JButton     guess;
    JLabel      result;
    SecretWord2 secret;
    
    public SecretWordFrame() {
        
        // ====================================================================
        // Setup the window
        
        // set the title on the title bar
        super( "Secret Word" );   
        
        // set the size of the window (x,y)
        setSize( 300, 100 );
        
         // tell the program to exit when the x is clicked
        setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );

        // set the layout to "Flow" so that component drop in where they fit best
        FlowLayout flo = new FlowLayout();
        setLayout( flo );
        
        // ====================================================================
        // Text Fields
        
        // create and add a text field
        field = new JTextField( 15 );
        add( field );
        field.setText( "" );

        // ====================================================================
        // Buttons
        
        // create and add a play button
        guess = new JButton( "Guess" );
        add( guess );
        guess.addActionListener( this );

        // ====================================================================
        // Labels
        
        // create and add a label
        result = new JLabel( "Guess the secret word!" );
        add( result );

        // make the frame visible
        setVisible( true );
        
        // create the secret word
        secret = new SecretWord2();
    }   

    @Override
    public void actionPerformed(ActionEvent ae) {
        
        Object source = ae.getSource();
        
        if ( source == guess )
        {
            if ( secret.guess( field.getText() ) )
            {
                result.setText( "You Win!" );
            }
            else
            {
                result.setText( secret.hint() );
            }

            field.setText( "" );
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        SecretWordFrame demo = new SecretWordFrame();
    }
}
