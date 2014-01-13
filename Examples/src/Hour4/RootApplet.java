package Hour4;

import java.awt.Graphics;

public class RootApplet extends javax.swing.JApplet
{
    public void paint(Graphics screen)
    {
        int number = 225;
        screen.drawString( "The square root of " + number + 
                           " is " + Math.sqrt(number), 
                           5, 
                           50 );
    }
}
