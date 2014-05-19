package Hour23;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import javax.swing.JFrame;

public class SimpleColorDemo extends JFrame {

    public SimpleColorDemo() {
        super("Simple Color Demo");

        setSize(420, 240);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setVisible(true);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);

        Graphics2D g2 = (Graphics2D) g;

        g2.setFont(new Font("Wide Latin", Font.PLAIN, 30));
        g2.setRenderingHint(
                RenderingHints.KEY_ANTIALIASING, 
                RenderingHints.VALUE_ANTIALIAS_ON);
        g2.setColor(Color.blue);
        g2.fillRect( 10, 120, 400, 40 );
        g2.setColor(Color.orange);
        g2.drawString("Go ORANGE!", 20, 150);
    }

    public static void main(String[] args) {
        SimpleColorDemo demo = new SimpleColorDemo();
    }
}
