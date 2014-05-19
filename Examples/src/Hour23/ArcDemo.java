package Hour23;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Arc2D;
import java.awt.geom.Rectangle2D;
import java.awt.geom.RoundRectangle2D;
import javax.swing.JFrame;

public class ArcDemo extends JFrame {

    public ArcDemo() {
        
        super("Ellipse Demo");

        setSize(420, 240);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setVisible(true);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);

        Graphics2D g2 = (Graphics2D) g;

        g2.setColor(Color.red);
        Arc2D.Float arcOpen = 
                new Arc2D.Float( 50F, 50F, 300F, 100F, 0, 90, Arc2D.OPEN );
        g2.draw(arcOpen);
        
        g2.setColor(Color.blue);
        Arc2D.Float arcPie1 = 
                new Arc2D.Float( 100F, 100F, 50F, 100F, 90, 90, Arc2D.PIE );
        g2.draw(arcPie1);
        
        g2.setColor(Color.blue);
        Arc2D.Float arcPie2 = 
                new Arc2D.Float( 250F, 125F, 75F, 75F, 0, 45, Arc2D.PIE );
        g2.fill(arcPie2);
        
        g2.setColor(Color.green);
        Arc2D.Float arcChord1 = 
                new Arc2D.Float( 75F, 75F, 100F, 100F, 180, 90, Arc2D.CHORD );
        g2.draw(arcChord1);
        
        g2.setColor(Color.orange);
        Arc2D.Float arcChord2 = 
                new Arc2D.Float( 200F, 100F, 50F, 50F, 270, 90, Arc2D.CHORD );
        g2.fill(arcChord2);
    }
    
    public static void main(String[] args) {
        ArcDemo demo = new ArcDemo();
    }
}
