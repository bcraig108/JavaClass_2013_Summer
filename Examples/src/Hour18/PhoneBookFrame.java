package Hour18;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class PhoneBookFrame extends JFrame implements ActionListener {

    JTextField nameField;
    JTextField phoneField;
    JButton    addButton;
    
    Vector<PhoneBookEntry> phoneBook;
    
    public PhoneBookFrame() {
        super( "Phone Book" );
        setSize( 280, 100 );
        setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        
        FlowLayout flow = new FlowLayout();
        setLayout( flow );

        JLabel nameLabel = new JLabel( "Name: " );
        add( nameLabel );
        
        nameField = new JTextField( 15 );
        add( nameField );
        
        JLabel phoneLabel = new JLabel( "Phone: " );
        add( phoneLabel );
        
        phoneField = new JTextField( 8 );
        add( phoneField );
        
        addButton = new JButton( "Add" );
        addButton.addActionListener(this);
        add( addButton );
        
        setVisible( true );
        
        phoneBook = new Vector<>();
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
        try {
            PhoneBookEntry entry = 
                    new PhoneBookEntry( 
                        nameField.getText(), 
                        phoneField.getText() );
            phoneBook.add(entry);
        }
        catch ( NumberFormatException ex ) {
            JOptionPane.showMessageDialog( 
                    this, 
                    ex.getMessage(), 
                    "Phone Book Entry Error", 
                    JOptionPane.ERROR_MESSAGE );
        }
        finally {
            nameField.setText( "" );
            phoneField.setText( "" );
        }
    }

    public static void main(String[] args) {
        PhoneBookFrame frame = new PhoneBookFrame();
    }
}
