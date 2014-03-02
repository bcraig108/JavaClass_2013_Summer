
import java.awt.Graphics;



/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Brian & Denise
 */
public class TrigApp extends javax.swing.JApplet {
    
    public void paint( Graphics screen ) {
                
        double angle = Math.PI;
               
        screen.drawString( "The cosine of " + angle +" is " + Math.cos(angle),
                5,
                50 ); 
        screen.drawString( "The sine of " + angle + " is " + Math.sin(angle),
                5,
                100 ); 
    }
}
