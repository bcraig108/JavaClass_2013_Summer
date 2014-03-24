/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Hour13;

import java.awt.FlowLayout;
import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Brian & Denise
 */
public class JPanelDemo extends JFrame {
    
    public JPanelDemo() {
            
        // set the title on the title bar
        super( "JPanel Demo" );
                
        // set the size of the window (x,y)
        setSize( 500, 150 );
        
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
        
        JCheckBox fredBox = new JCheckBox( "Fred" );        
        JCheckBox daphneBox = new JCheckBox( "Daphne" );
        JCheckBox velmaBox = new JCheckBox( "Velma" );
        JCheckBox shaggyBox = new JCheckBox( "Shaggy" );        
        JCheckBox scoobyBox = new JCheckBox( "Scooby", true );

        if ( true ) {
            JPanel groupPanel = new JPanel();

            groupPanel.add( leftBox );
            groupPanel.add( centerBox );
            groupPanel.add( rightBox );

            JPanel checkPanel = new JPanel();

            checkPanel.add( fredBox );
            checkPanel.add( daphneBox );
            checkPanel.add( velmaBox );
            checkPanel.add( shaggyBox );
            checkPanel.add( scoobyBox );

            add( groupPanel );
            add( checkPanel );
        }
        else {
            add( leftBox );
            add( centerBox );
            add( rightBox );
            add( fredBox );
            add( daphneBox );
            add( velmaBox );
            add( shaggyBox );
            add( scoobyBox );
        }
        
        // make the frame visible
        setVisible( true );
    }   

    public static void main(String[] args) {
        JPanelDemo demo = new JPanelDemo();
    }
}
