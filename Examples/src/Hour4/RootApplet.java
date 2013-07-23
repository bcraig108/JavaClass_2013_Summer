package Hour4;

import java.awt.Graphics;

public class RootApplet extends javax.swing.JApplet
{
    int number;
    
    public void init()
    {
        number = 225;
    }
    
    public void paint(Graphics screen)
    {
        screen.drawString( "The square root of " + number + 
                           " is " + Math.sqrt(number), 
                           5, 
                           50 );
    }
}
