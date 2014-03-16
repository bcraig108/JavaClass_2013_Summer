/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Hour12;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JApplet;

/**
 *
 * @author Brian
 */
public class HappyApplet extends JApplet {
    
    /**
     * initialize
     */
    @Override
    public void init() {
        // make the background black
        setBackground( Color.black );
    }   
    
    @Override
    public void paint( Graphics g ) {
        // draw something happy
        g.setColor(Color.yellow);
        g.fillOval(50, 50, 100, 100);
        g.setColor(Color.black);
        g.drawArc( 70, 70, 60, 60, 0, -180 );
        g.fillOval( 80, 80, 10, 10 );
        g.fillOval( 110, 80, 10, 10 );
    }
}
