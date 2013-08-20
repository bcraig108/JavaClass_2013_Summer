/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Hour13;

import java.awt.FlowLayout;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author Dad
 */
public class ComponentDemo extends JFrame {
    
    public ComponentDemo() {
        
        // ====================================================================
        // Setup the window
        
        // set the title on the title bar
        super( "Component Demo");   
        
        // set the size of the window (x,y)
        setSize( 250, 400 );
        
         // tell the program to exit when the x is clicked
        setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );

        // set the layout to "Flow" so that component drop in where they fit best
        FlowLayout flo = new FlowLayout();
        setLayout( flo );
/*        
        // ====================================================================
        // Buttons
        
        // create and add a play button
        JButton play = new JButton( "Play" );
        add( play );
/*        
        // create and add a stop button
        JButton stop = new JButton( "Stop" );
        add( stop );
/*        
        // create and add a pause button
        JButton pause = new JButton( "Pause" );
        add( pause );
/*        
        // ====================================================================
        // Labels
        
        // create and add a label
        JLabel label = new JLabel( "Name:" );
        add( label );
/*        
        // ====================================================================
        // Text Fields
        
        // create and add a text field
        JTextField field = new JTextField( 15 );
        add( field );
        field.setText( "Brian" );
/*        
        // ====================================================================
        // Check Boxes

        // create and add "Large" checkbox
        JCheckBox large = new JCheckBox( "Large" );
        add( large );
 /*       
        // create and add "Medium" checkbox
        JCheckBox medium = new JCheckBox( "Medium", true );
        add( medium );
 /*       
        // create and add "Small" checkbox
        JCheckBox small = new JCheckBox( "Small" );
        add( small );
 /*       
        // ====================================================================
        // Button Groups

        // create a button group - this makes only one of the 3 buttons checked
        // at a time
        ButtonGroup group = new ButtonGroup();
        group.add( large );
        group.add( medium );
        group.add( small );
/*   
        // ====================================================================
        // Combo Boxes
        
        // create a combo box
        JComboBox<String> mobs = new JComboBox<String>();
        mobs.addItem( "Creeper" );
        mobs.addItem( "Zombie" );
        mobs.addItem( "Slime" );
        mobs.addItem( "Enderman" );
        add( mobs );
/*
        // ====================================================================
        // Text Areas
        
        // create a text area
        JTextArea area = new JTextArea( 8, 15 );
        add( area );
        area.setText( "Badgers? Badgers!?! \n" +
                      "We don't need no \n" +
                      "stinking BADGERS!!!");
*/
        // make the frame visible
        setVisible( true );
    }   

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        ComponentDemo demo = new ComponentDemo();
    }
}
