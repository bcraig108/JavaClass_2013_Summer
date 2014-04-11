
package Hour16;

import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;


public class MailWriter extends JFrame {

    public MailWriter() {
        super( "Write an E-Mail" );
        
        setSize( 370, 270 );
        setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        
        FlowLayout flow = new FlowLayout();
        setLayout(flow);
        
        JPanel row1 = new JPanel();
        JLabel toLabel = new JLabel( "To: " );
        row1.add( toLabel );
        
        JTextField toField = new JTextField( 24 );
        row1.add( toField );
        
        add( row1 );
        
        JPanel row2 = new JPanel();
        JLabel subjectLabel = new JLabel( "Subject: " );
        row2.add( subjectLabel );
        JTextField subjectField = new JTextField( 24 );
        row2.add( subjectField );
        
        add( row2 );
        
        JPanel row3 = new JPanel();
        JLabel messageLabel = new JLabel( "Message:" );
        row3.add( messageLabel );
        
        JTextArea messageArea = new JTextArea( 4, 22 );
        messageArea.setLineWrap( true );
        messageArea.setWrapStyleWord( true );
        
        JScrollPane scroll = new JScrollPane( 
                messageArea,
                JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, 
                JScrollPane.HORIZONTAL_SCROLLBAR_NEVER );
        row3.add(scroll);
        add( row3 );
        
        JPanel row4 = new JPanel();
        JButton sendButton = new JButton( "Send" );
        row4.add( sendButton );
        add( row4 );
       
        setVisible( true );
    }

    public static void main(String[] args) {
        MailWriter mail = new MailWriter();
    }
}
