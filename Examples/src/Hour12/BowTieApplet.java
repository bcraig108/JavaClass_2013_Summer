/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Hour12;

import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author Dad
 */
public class BowTieApplet extends HatApplet {
    
    @Override
    public void paint( Graphics g ) {
        super.paint(g);
        g.setColor(Color.blue);
        int [] x = { 75, 100, 75 };
        int [] y = { 140, 150, 160 };
        g.fillPolygon( x, y, x.length );
        x[0] = 125;
        x[2] = 125;
        g.fillPolygon( x, y, x.length );
    }
}
