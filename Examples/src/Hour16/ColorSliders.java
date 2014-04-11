
package Hour16;

import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class ColorSliders extends JFrame implements ChangeListener {

    ColorPanel  canvas;
    ColorSlider red;
    ColorSlider green;
    ColorSlider blue;
    
    ColorSliders() {
        super( "Color Sliders");
        
        setSize( 275, 300 );
        setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        
        red   = new ColorSlider( "Red ", this );
        green = new ColorSlider( "Green ", this );
        blue  = new ColorSlider( "Blue ", this );
        canvas = new ColorPanel( mixColor() );
        
        GridLayout grid = new GridLayout( 4, 1 );
        setLayout( grid );
        
        add( red );
        add( green );
        add( blue );        
        add( canvas );
        
        setVisible( true );
    }
    
    @Override
    public void stateChanged(ChangeEvent ce) {
        
        JSlider source = (JSlider)ce.getSource();
        
        if ( source.getValueIsAdjusting() == false ) {
            canvas.changeColor( mixColor() );
            canvas.repaint();
        }
    }

    Color mixColor() {
        return new Color( red.getValue(), green.getValue(), blue.getValue() );
    }
    
    public static void main(String[] args) {
        ColorSliders sliders = new ColorSliders();
    }

}
