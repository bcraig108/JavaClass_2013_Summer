/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Hour13;

import java.awt.FlowLayout;
import javax.swing.JCheckBox;
import javax.swing.JFrame;

/**
 *
 * @author Brian & Denise
 */
public class JCheckBoxDemo extends JFrame {
    
    public JCheckBoxDemo() {
            
        // set the title on the title bar
        super( "JCheckBox Demo" );
                
        // set the size of the window (x,y)
        setSize( 250, 100 );
        
         // tell the program to exit when the x is clicked
        setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );

        // set the layout to use a Flow layout - simple
        FlowLayout flow = new FlowLayout();
        setLayout( flow );
        
        JCheckBox fredBox = new JCheckBox( "Fred" );
        add( fredBox );
                
        JCheckBox daphneBox = new JCheckBox( "Daphne" );
        add( daphneBox );
                
        JCheckBox velmaBox = new JCheckBox( "Velma" );
        add( velmaBox );
                
        JCheckBox shaggyBox = new JCheckBox( "Shaggy" );
        add( shaggyBox );
                
        JCheckBox scoobyBox = new JCheckBox( "Scooby", true );
        add( scoobyBox );
                
        // make the frame visible
        setVisible( true );
    }   

    public static void main(String[] args) {
        JCheckBoxDemo demo = new JCheckBoxDemo();
    }
}
