package Hour13;

import java.awt.FlowLayout;
import javax.swing.*;

public class JLabelTextDemo extends JFrame {
    
    public JLabelTextDemo() {
        
        // set the title on the title bar
        super( "JLabelText Demo" );
                
        // set the size of the window (x,y)
        setSize( 500, 75 );
        
        // set the layout to use a Flow layout - simple
        FlowLayout flow = new FlowLayout();
        setLayout( flow );
        
        JLabel pageLabel = new JLabel( "Web page address: " );
        add( pageLabel );

        JTextField pageTextField = new JTextField( "http://www.google.com", 25 );
        add( pageTextField );
        
         // tell the program to exit when the x is clicked
        setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );

        // make the frame visible
        setVisible( true );
    }   

    public static void main(String[] args) {
        JLabelTextDemo demo = new JLabelTextDemo();
    }
}
