package Hour23;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Line2D;
import javax.swing.JFrame;

public class LineDemo extends JFrame {

    public LineDemo() {
        super("Line Demo");

        setSize(420, 240);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setVisible(true);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);

        Graphics2D g2 = (Graphics2D) g;

        g2.setColor(Color.red);
        
        float maxX = getSize().width;
        float maxY = getSize().height;
        
        Line2D.Float line = new Line2D.Float( 0F, 0F, maxX, maxY );
        g2.draw(line);
    }

    public static void main(String[] args) {
        LineDemo demo = new LineDemo();
    }
}
