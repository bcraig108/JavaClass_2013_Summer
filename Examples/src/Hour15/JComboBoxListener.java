package Hour15;

import java.awt.BorderLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.*;

public class JComboBoxListener extends JFrame implements ItemListener {
    
    JComboBox foodBox;
    JLabel orderLabel;
    
    public JComboBoxListener() {
        
        // set the title on the title bar
        super( "JComboBox Demo" );
                
        // set the size of the window (x,y)
        setSize( 250, 200 );
        
         // tell the program to exit when the x is clicked
        setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );

        BorderLayout border = new BorderLayout();
        setLayout( border );
        
        foodBox = new JComboBox();
        foodBox.addItem( "Spaghetti" );
        foodBox.addItem( "Pizza" );
        foodBox.addItem( "Chicken Parm" );
        foodBox.addItem( "Stromboli" );
        foodBox.addItem( "Calzone" );
        
        foodBox.setEditable(true);        
        foodBox.addItemListener(this);      // Added 
        
        add( foodBox, BorderLayout.NORTH );
        
        orderLabel = new JLabel( "No Order" );
        add( orderLabel, BorderLayout.SOUTH  );
        
        // make the frame visible
        setVisible( true );
    }   

    @Override
    public void itemStateChanged(ItemEvent ie) {
        orderLabel.setText( "You Ordered " + ie.getItem().toString() );
    }

    public static void main(String[] args) {
        JComboBoxListener demo = new JComboBoxListener();
    }

}
