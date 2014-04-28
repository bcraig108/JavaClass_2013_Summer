package Hour18;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class NumberDividerFrame extends JFrame implements ActionListener {

    JTextField numField;
    JTextField denField;
    JButton    compButton;
    JTextField ansField;
    JTextField remField;
    
    NumberDividerFrame() {
        super( "Divide!" );
        setSize( 300, 100 );
        setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        
        FlowLayout flow = new FlowLayout();
        setLayout( flow );

        numField = new JTextField( 3 );
        add( numField );
        
        JLabel divLabel = new JLabel( " / " );
        add( divLabel );
        
        denField = new JTextField( 3 );
        add( denField );
        
        compButton = new JButton( " = " );
        compButton.addActionListener(this);
        add( compButton );
        
        ansField = new JTextField( 3 );
        add( ansField );

        JLabel remLabel = new JLabel( " r " );
        add( remLabel );

        remField = new JTextField( 3 );
        add( remField );
        
        setVisible( true );
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
            
        try {
            int ans = 
                    Integer.parseInt( numField.getText() ) / 
                    Integer.parseInt( denField.getText() );
            int rem = 
                    Integer.parseInt( numField.getText() ) % 
                    Integer.parseInt( denField.getText() );

            ansField.setText( Integer.toString( ans ) );
            remField.setText( Integer.toString( rem ) );
        }
        catch ( NumberFormatException | ArithmeticException ex ) {
            JOptionPane.showMessageDialog( 
                    this, 
                    ex.getMessage(), 
                    "Divide Error", 
                    JOptionPane.ERROR_MESSAGE );
            ansField.setText( "" );
            remField.setText( "" );
        }
    }
    
    public static void main(String[] args) {
        NumberDividerFrame frame = new NumberDividerFrame();
    }
}
