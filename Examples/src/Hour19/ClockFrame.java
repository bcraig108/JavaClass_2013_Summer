package Hour19;

import javax.swing.JFrame;

public class ClockFrame extends JFrame {

    public ClockFrame() {
        super( "Clock Frame" );
        setSize( 400, 300 );
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        ClockPanel clock = new ClockPanel();
        add( clock );
        
        setVisible( true );
    }

    public static void main(String[] args) {
        ClockFrame frame = new ClockFrame();
    }
}
