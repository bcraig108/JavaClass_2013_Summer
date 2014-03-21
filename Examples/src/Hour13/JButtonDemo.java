package Hour13;

import java.awt.FlowLayout;
import javax.swing.*;

public class JButtonDemo extends JFrame {
    
    public JButtonDemo() {
        
        // set the title on the title bar
        super( "JButton Demo" );
                
        // set the size of the window (x,y)
        setSize( 250, 400 );
        
         // tell the program to exit when the x is clicked
        setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );

        // set the layout to use a Flow layout - simple
        FlowLayout flow = new FlowLayout();
        setLayout( flow );
        
        JButton okButton = new JButton( "OK!");
        add( okButton );
                
        // make the frame visible
        setVisible( true );
    }   

    public static void main(String[] args) {
        JButtonDemo demo = new JButtonDemo();
    }
}
