import java.awt.Graphics;

public class TrigApp extends javax.swing.JApplet{
    
    public void paint(Graphics screen){
        
        double x = 3.14 / 4.0;
        double y = Math.cos( x );
        double z = Math.sin( x );

        screen.drawString( "The cosine of " + x + " is " + y + ".", 5, 50 );
        screen.drawString( "The sine of " + x + " is " + z + ".", 5, 100 );
    }    
}
