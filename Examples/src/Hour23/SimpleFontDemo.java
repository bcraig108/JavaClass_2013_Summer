package Hour23;

import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import javax.swing.JFrame;

public class SimpleFontDemo extends JFrame {

    public SimpleFontDemo() {
        super("Font Demo");

        setSize(640, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setVisible(true);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);

        Graphics2D g2 = (Graphics2D) g;

        Font font = new Font("Serif", Font.PLAIN, 30);
        
        g2.setFont( font );

        g2.setRenderingHint(
                RenderingHints.KEY_ANTIALIASING,
                RenderingHints.VALUE_ANTIALIAS_ON);

        g2.drawString(
                "The quick brown fox jumped over the lazy dogs.",
                20,
                150);
    }

    public static void main(String[] args) {
        SimpleFontDemo demo = new SimpleFontDemo();
    }
}
