
package Hour16;

import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.event.ChangeListener;

public class ColorSlider extends JPanel {
    
    JSlider slider;
    
    ColorSlider( String name, ChangeListener listener ) {
        slider =  new JSlider( 0, 255, 0 );
        
        slider.setMajorTickSpacing( 64 );
        slider.setMinorTickSpacing( 16 );
        slider.setPaintTicks( true );
        slider.setPaintLabels( true );
        slider.addChangeListener( listener );
        
        JLabel label = new JLabel( name );

        FlowLayout right = new FlowLayout( FlowLayout.RIGHT );

        setLayout(right);
        add( label );
        add( slider );
    }
    
    int getValue() {
        return slider.getValue();
    }
}
