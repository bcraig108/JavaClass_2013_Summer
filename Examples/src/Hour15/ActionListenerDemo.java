/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Hour15;

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
public class ActionListenerDemo extends JFrame implements ActionListener {

    JTextField text;
    JButton    ok;
    JLabel     label;
    
    public ActionListenerDemo() {
        // ====================================================================
        // Setup the window
        
        // set the title on the title bar
        super( "Action Demo");   
        
        // set the size of the window (x,y)
        setSize( 200, 200 );
        
         // tell the program to exit when the x is clicked
        setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );

        // set the layout to "Flow" so that component drop in where they fit best
        FlowLayout flo = new FlowLayout();
        setLayout( flo );

        text = new JTextField( 12 );
        add( text );
        
        // create and add a play button
        ok = new JButton( "OK" );
        add( ok );
        ok.addActionListener( this );
        
        label = new JLabel( "" );
        add( label );
        
        setVisible(true);
    }
            
    @Override
    public void actionPerformed(ActionEvent ae) {
        
        Object source = ae.getSource();
        
        if ( source == ok )
        {
            label.setText( "You typed: " + text.getText() );
            text.setText( "" );
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ActionListenerDemo demo = new ActionListenerDemo();
    }

}
