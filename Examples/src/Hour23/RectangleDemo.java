package Hour23;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;
import java.awt.geom.RoundRectangle2D;
import javax.swing.JFrame;

public class RectangleDemo extends JFrame {
    
    public RectangleDemo() {
        
        super("Rectangle Demo");

        setSize(420, 240);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setVisible(true);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);

        Graphics2D g2 = (Graphics2D) g;

        g2.setColor(Color.red);
        Rectangle2D.Float rect1 = new Rectangle2D.Float( 50F, 50F, 300F, 100F );
        g2.draw(rect1);
        
        g2.setColor(Color.blue);
        Rectangle2D.Float rect2 = new Rectangle2D.Float( 100F, 100F, 50F, 100F );
        g2.fill(rect2);
        
        g2.setColor(Color.green);
        RoundRectangle2D.Float rrect1 = 
                new RoundRectangle2D.Float( 75F, 75F, 150F, 100F, 25F, 5F );
        g2.draw(rrect1);
        
        g2.setColor(Color.orange);
        RoundRectangle2D.Float rrect2 = 
                new RoundRectangle2D.Float( 200F, 100F, 50F, 100F, 20F, 20F );
        g2.fill(rrect2);
        
    }


    public static void main(String[] args) {

        RectangleDemo demo = new RectangleDemo();
    }
}
