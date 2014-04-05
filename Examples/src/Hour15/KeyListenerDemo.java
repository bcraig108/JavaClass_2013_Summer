/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Hour15;

import java.awt.Font;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author Dad
 */
public class KeyListenerDemo extends JFrame implements KeyListener {

    JLabel keyLabel;
    
    KeyListenerDemo() {

        super( "KeyListener Demo" );
                
        setSize( 500, 500 );

        Font font = new Font( Font.MONOSPACED, Font.BOLD, 450 );
        
        keyLabel = new JLabel( "" );
        keyLabel.setFont(font);
        
        addKeyListener(this);
        add( keyLabel );
        
        setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );

        setVisible( true );
    }
    
    @Override
    public void keyTyped(KeyEvent ke) {
        keyLabel.setText( Character.toString( ke.getKeyChar() ) );
    }

    @Override
    public void keyPressed(KeyEvent ke) {}

    @Override
    public void keyReleased(KeyEvent ke) {}

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        KeyListenerDemo demo = new KeyListenerDemo();
    }   
}
