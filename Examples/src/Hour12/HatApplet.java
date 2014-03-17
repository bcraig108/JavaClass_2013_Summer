/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Hour12;

import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author Brian & Denise
 */
public class HatApplet extends HappyApplet {
    
    @Override
    public void paint( Graphics g ) {
        super.paint(g);
        g.setColor(Color.red);
        g.fillRect(75, 10, 50, 50);
        g.fillRect(50, 55, 100, 5);
    }
}
