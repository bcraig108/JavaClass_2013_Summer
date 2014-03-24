package Hour13;

import java.awt.FlowLayout;
import javax.swing.*;

public class JComboBoxDemo extends JFrame {
    
    public JComboBoxDemo() {
        
        // set the title on the title bar
        super( "JComboBox Demo" );
                
        // set the size of the window (x,y)
        setSize( 250, 200 );
        
         // tell the program to exit when the x is clicked
        setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );

        // set the layout to use a Flow layout - simple
        FlowLayout flow = new FlowLayout();
        setLayout( flow );
        
        JComboBox foodBox = new JComboBox();
        foodBox.addItem( "Spaghetti" );
        foodBox.addItem( "Pizza" );
        foodBox.addItem( "Chicken Parm" );
        foodBox.addItem( "Stromboli" );
        foodBox.addItem( "Calzone" );
        
        foodBox.setEditable(true);
        
        add( foodBox );
                
        // make the frame visible
        setVisible( true );
    }   

    public static void main(String[] args) {
        JComboBoxDemo demo = new JComboBoxDemo();
    }
}
