package Hour18;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class JOptionsPaneDemo extends JFrame implements ActionListener {

    JButton input1Button;
    JButton input2Button;
    JButton input3Button;
    JButton input4Button;
    JButton input5Button;
    JButton input6Button;
    String name;
    
    JOptionsPaneDemo() {
        super( "JOptionsPane Demo" );
        
        name = "No Name";

        setSize( 400, 300 );
        setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        
        GridLayout grid = new GridLayout( 5, 1 );
        setLayout( grid );

        input1Button = new JButton( "showInputDialog(Object)" );
        input1Button.addActionListener(this);
        add( input1Button );
        
        input2Button = new JButton( "showInputDialog(Object, Object)" );
        input2Button.addActionListener(this);
        add( input2Button );

        input3Button = new JButton( "showInputDialog(Component, Object)" );
        input3Button.addActionListener(this);
        add( input3Button );

        input4Button = new JButton( 
                "showInputDialog(Component, Object, Object)" );
        input4Button.addActionListener(this);
        add( input4Button );

        input5Button = new JButton(
                "showInputDialog(Component, Object, String, int)");
        input5Button.addActionListener(this);
        add( input5Button );
               
        setVisible( true );
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {

        if ( e.getSource() == input1Button ) {
            name = JOptionPane.showInputDialog( "Please Enter Your Name" );
//            inputLabel.setText(name);
        }
        else if ( e.getSource() == input2Button ) {
            name = JOptionPane.showInputDialog( 
                    "Please Enter Your Name", name );
        }
        else if ( e.getSource() == input3Button ) {
            name = JOptionPane.showInputDialog( 
                    this,
                    "Please Enter Your Name" );            
        }
        else if ( e.getSource() == input4Button ) {
            name = JOptionPane.showInputDialog(
                    this,
                    "Please Enter Your Name", 
                    name );
        }
        else if ( e.getSource() == input5Button ) {
            name = JOptionPane.showInputDialog(
                    this,
                    "Please Enter Your Name", 
                    "ERROR - Your Name",
                    JOptionPane.ERROR_MESSAGE );
        }            
    }

    public static void main(String[] args) {
        JOptionsPaneDemo demo = new JOptionsPaneDemo();
    }
}
