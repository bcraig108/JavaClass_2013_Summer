/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Hour15;

import java.awt.GridLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author Brian & Denise
 */
public class JCheckBoxListener extends JFrame implements ItemListener {
    
    JCheckBox fredBox;
    JCheckBox daphneBox;
    JCheckBox velmaBox;
    JCheckBox shaggyBox;
    JCheckBox scoobyBox;
    
    JLabel fredLabel;
    JLabel daphneLabel;
    JLabel velmaLabel;
    JLabel shaggyLabel;
    JLabel scoobyLabel;
    
    
    public JCheckBoxListener() {
            
        // set the title on the title bar
        super( "JCheckBox Demo" );
                
        // set the size of the window (x,y)
        setSize( 500, 100 );
        
         // tell the program to exit when the x is clicked
        setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );

        // set the layout to use a Flow layout - simple
        GridLayout grid = new GridLayout( 2, 5 );
        setLayout( grid );
        
        fredBox = new JCheckBox( "Fred" );
        fredBox.addItemListener(this);
        add( fredBox );
                
        daphneBox = new JCheckBox( "Daphne" );
        daphneBox.addItemListener(this);
        add( daphneBox );
                
        velmaBox = new JCheckBox( "Velma" );
        velmaBox.addItemListener(this);
        add( velmaBox );
                
        shaggyBox = new JCheckBox( "Shaggy" );
        shaggyBox.addItemListener(this);
        add( shaggyBox );
                
        scoobyBox = new JCheckBox( "Scooby" );
        scoobyBox.addItemListener(this);
        add( scoobyBox );
        
        fredLabel = new JLabel();
        add( fredLabel );

        daphneLabel = new JLabel();
        add( daphneLabel );

        velmaLabel = new JLabel();
        add( velmaLabel );

        shaggyLabel = new JLabel();
        add( shaggyLabel );

        scoobyLabel = new JLabel();
        add( scoobyLabel );
                
        // make the frame visible
        setVisible( true );
    }
    
    @Override
    public void itemStateChanged(ItemEvent ie) {

        Object source = ie.getItem();
        int    state = ie.getStateChange();
        
        if ( source == fredBox ) {
            if ( state == ItemEvent.SELECTED )
                fredLabel.setText("Let's go gang!");
            else
                fredLabel.setText("");
        }
        else if ( source == daphneBox ) {
            if ( state == ItemEvent.SELECTED )
                daphneLabel.setText("Look out!");
            else
                daphneLabel.setText("");
        }
        else if ( source == velmaBox ) {
            if ( state == ItemEvent.SELECTED )
                velmaLabel.setText("Jinkies!");
            else
                velmaLabel.setText("");
        }
        else if ( source == shaggyBox ) {
            if ( state == ItemEvent.SELECTED )
                shaggyLabel.setText("Zoinks!");
            else
                shaggyLabel.setText("");
        }
        else if ( source == scoobyBox ) {
            if ( state == ItemEvent.SELECTED )
                scoobyLabel.setText("Ruh-Roh!");
            else
                scoobyLabel.setText("");
        }
    }

    public static void main(String[] args) {
        JCheckBoxListener demo = new JCheckBoxListener();
    }
}
