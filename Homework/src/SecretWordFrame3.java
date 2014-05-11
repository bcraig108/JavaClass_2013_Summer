
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class SecretWordFrame3 extends JFrame implements ActionListener {

    JTextField guessField;
    JButton    guessButton;
    JButton    hintButton;
    JLabel     hintLabel;
    SecretWordV5 secretWord;
    
    SecretWordFrame3() {
        super( "Secret Word" );
        
        setSize( 520, 100 );
        setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );

        FlowLayout flow = new FlowLayout();
        setLayout( flow );

        JLabel instLabel = new JLabel("Guess the secret word!");
        
        guessField = new JTextField( 20 );
        guessField.addActionListener(this);
        
        guessButton = new JButton( "Guess" );
        guessButton.addActionListener(this);
        
        hintButton = new JButton( "Hint" );
        hintButton.addActionListener(this);
        
        hintLabel = new JLabel("This is a hint");
        
        secretWord = new SecretWordV5();
        
        add( instLabel );
        add( guessField );
        add( guessButton );
        add( hintButton );
        add( hintLabel );
        
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if ( e.getSource() ==  guessField || e.getSource() == guessButton ) {
            if ( secretWord.guess( guessField.getText() ) ) {
                hintLabel.setText( "You got it right!" );
            }
            else {
                hintLabel.setText( "Sorry, try again!" );
                guessField.setText( "" );
            }
        }
        else if ( e.getSource() ==  hintButton ) {
            hintLabel.setText( secretWord.hint() );
        }
    }
    
    public static void main(String[] args) {
        SecretWordFrame3 frame = new SecretWordFrame3();
    }

}
