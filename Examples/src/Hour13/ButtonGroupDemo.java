/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Hour13;

import java.awt.FlowLayout;
import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JFrame;

/**
 *
 * @author Brian & Denise
 */
public class ButtonGroupDemo extends JFrame {
    
    public ButtonGroupDemo() {
            
        // set the title on the title bar
        super( "ButtonGroup Demo" );
                
        // set the size of the window (x,y)
        setSize( 250, 100 );
        
         // tell the program to exit when the x is clicked
        setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );

        // set the layout to use a Flow layout - simple
        FlowLayout flow = new FlowLayout();
        setLayout( flow );
        
        JCheckBox leftBox = new JCheckBox( "Left" );
        JCheckBox centerBox = new JCheckBox( "Center", true );
        JCheckBox rightBox = new JCheckBox( "Right" );

        ButtonGroup group = new ButtonGroup();
        group.add( leftBox );
        group.add( centerBox );
        group.add( rightBox );
        
        add( leftBox );
        add( centerBox );
        add( rightBox );
                                
        // make the frame visible
        setVisible( true );
    }   

    public static void main(String[] args) {
        ButtonGroupDemo demo = new ButtonGroupDemo();
    }
}
