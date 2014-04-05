/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Hour15;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author Dad
 */
public class KeyListenerDemo2 extends JFrame implements KeyListener {

    JLabel feedbackLabel;
    
    KeyListenerDemo2() {

        super( "KeyListener Demo 2" );
                
        setSize( 300, 100 );

        Font font = new Font( Font.MONOSPACED, Font.BOLD, 20 );
        
        feedbackLabel = new JLabel( "" );
        feedbackLabel.setFont(font);        
        add( feedbackLabel );
        
        addKeyListener(this);

        setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );

        setVisible( true );
    }
    
    @Override
    public void keyTyped(KeyEvent ke) {}

    @Override
    public void keyPressed(KeyEvent ke) {
        int code =  ke.getKeyCode();
        if ( code == KeyEvent.VK_ESCAPE ) {
            feedbackLabel.setForeground(Color.red);
        }
        else {
            feedbackLabel.setForeground(Color.black);
        }
        feedbackLabel.setText( 
            "Key Code " + code + ": " + KeyEvent.getKeyText( code ) );
    }

    @Override
    public void keyReleased(KeyEvent ke) {    
        feedbackLabel.setText( "" );
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        KeyListenerDemo2 demo = new KeyListenerDemo2();
    }   
}
