
package Hour16;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

public class ColorPanel extends JPanel {
    
    Color background;

    public ColorPanel( Color color ) {
        background = color;
    }
    
    @Override
    public void paintComponent( Graphics comp ) {
        comp.setColor( background );
        comp.fillRect( 0, 0, getSize().width, getSize().height );
    }
    
    void changeColor( Color newBackground ) {
        background = newBackground;
    }
}
