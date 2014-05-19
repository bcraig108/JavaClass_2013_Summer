package Hour23;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;
import java.awt.geom.RoundRectangle2D;
import javax.swing.JFrame;

public class EllipseDemo extends JFrame {

    public EllipseDemo() {
        
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
        Ellipse2D.Float ellipse1 = new Ellipse2D.Float( 50F, 50F, 300F, 100F );
        g2.draw(ellipse1);
        
        g2.setColor(Color.blue);
        Ellipse2D.Float ellipse2 = new Ellipse2D.Float( 100F, 100F, 50F, 100F );
        g2.fill(ellipse2);
        
        g2.setColor(Color.green);
        Ellipse2D.Float circle1 = new Ellipse2D.Float( 75F, 75F, 100F, 100F );
        g2.draw(circle1);
        
        g2.setColor(Color.orange);
        Ellipse2D.Float circle2 = new Ellipse2D.Float( 200F, 100F, 50F, 50F );
        g2.fill(circle2);
        
    }
    
    public static void main(String[] args) {
        EllipseDemo demo = new EllipseDemo();
    }
}
