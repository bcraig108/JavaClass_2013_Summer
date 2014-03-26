/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Hour13;

import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JTextArea;

/**
 *
 * @author Dad
 */
public class JTextAreaDemo extends JFrame {
    
    public JTextAreaDemo() {
        
        // set the title on the title bar
        super( "JTextArea Demo");   
        
         // tell the program to exit when the x is clicked
        setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );

        // set the size of the window (x,y)
        setSize( 300, 200 );
        
        // set the layout to use a Flow layout - simple
        FlowLayout flow = new FlowLayout();
        setLayout( flow );

        // create a text area
        JTextArea area = new JTextArea( 8, 15 );
        add( area );
        area.setText( "The quick brown fox \njumped over the lazy dogs.");

        // make the frame visible
        setVisible( true );
    }   

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        JTextAreaDemo demo = new JTextAreaDemo();
    }
}
