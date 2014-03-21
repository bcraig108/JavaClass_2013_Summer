package Hour13;

import javax.swing.JWindow;

public class JWindowDemo extends JWindow {
    
    public JWindowDemo() {
        
        // set the size of the window (x,y)
        setSize( 250, 400 );
        
        // make the window visible
        setVisible( true );
    }   

    public static void main(String[] args) {
        JWindowDemo demo = new JWindowDemo();
    }
}
