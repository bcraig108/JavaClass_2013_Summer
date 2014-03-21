package Hour13;

import javax.swing.*;

public class JFrameDemo extends JFrame {
    
    public JFrameDemo() {
        
        // set the title on the title bar
        super( "JFrame Demo" );   
//        setTitle( "JFrame Demo" );
        
        // set the size of the window (x,y)
        setSize( 250, 400 );
        
         // tell the program to exit when the x is clicked
        setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );

        // make the frame visible
        setVisible( true );
    }   

    public static void main(String[] args) {
        JFrameDemo demo = new JFrameDemo();
    }
}
