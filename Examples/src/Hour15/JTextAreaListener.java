package Hour15;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class JTextAreaListener extends JFrame implements ActionListener {
    
    JTextField pageTextField;
    JLabel feedbackLabel;
    
    public JTextAreaListener() {
        
        // set the title on the title bar
        super( "JLabelText Demo" );
                
        // set the size of the window (x,y)
        setSize( 500, 150 );
        
        JPanel entryPanel = new JPanel();
        
        // set the layout to use a Flow layout - simple
        FlowLayout flow = new FlowLayout();
        entryPanel.setLayout( flow );
        
        JLabel pageLabel = new JLabel( "Web page address: " );
        entryPanel.add( pageLabel );

        pageTextField = new JTextField( "http://www.google.com", 25 );
        pageTextField.addActionListener(this);
        entryPanel.add( pageTextField );
        
        BorderLayout border = new BorderLayout();
        setLayout( border );
        
        add( entryPanel, BorderLayout.NORTH );
        
        feedbackLabel = new JLabel( "---" );
        add( feedbackLabel, BorderLayout.SOUTH );
        
        setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );

        setVisible( true );
    }   

    @Override
    public void actionPerformed(ActionEvent ae) {

        feedbackLabel.setText( "Contacting " + ae.getActionCommand() + "..." );
    }

    public static void main(String[] args) {
        JTextAreaListener demo = new JTextAreaListener();
    }

}
