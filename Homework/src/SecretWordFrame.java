
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class SecretWordFrame extends JFrame {

    SecretWordFrame() {
        super( "Secret Word" );
        
        setSize( 520, 100 );
        setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );

        FlowLayout flow = new FlowLayout();
        setLayout( flow );

        JLabel instLabel = new JLabel("Guess the secret word!");
        JTextField guessField = new JTextField( 20 );
        JButton guessButton = new JButton( "Guess" );
        JButton hintButton = new JButton( "Hint" );
        JLabel hintLabel = new JLabel("This is a hint");
        
        add( instLabel );
        add( guessField );
        add( guessButton );
        add( hintButton );
        add( hintLabel );
        
        setVisible(true);
    }
    
    public static void main(String[] args) {
        SecretWordFrame frame = new SecretWordFrame();
    }
}
