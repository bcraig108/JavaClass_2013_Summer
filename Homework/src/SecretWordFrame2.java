
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class SecretWordFrame2 extends JFrame {

    SecretWordFrame2() {
        super( "Secret Word" );
        
        setSize( 450, 200 );
        setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );

        JPanel top = new JPanel();

        FlowLayout flow = new FlowLayout();
        top.setLayout( flow );

        JLabel instLabel = new JLabel("Guess the secret word!");
        JTextField guessField = new JTextField( 20 );
        
        top.add( instLabel );
        top.add( guessField );
        
        JPanel middle = new JPanel();
        
        GridLayout grid = new GridLayout( 1, 2 );
        middle.setLayout( grid );
        
        JButton guessButton = new JButton( "Guess" );
        JButton hintButton = new JButton( "Hint" );
        
        middle.add( guessButton );
        middle.add( hintButton );
        
        
        JLabel hintLabel = new JLabel("This is a hint");
        
        GridLayout grid2 = new GridLayout( 3, 1 );
        
        setLayout( grid2 );
        
        add(top);
        add(middle);
        add( hintLabel );
        
        setVisible(true);
    }
    
    public static void main(String[] args) {
        SecretWordFrame2 frame = new SecretWordFrame2();
    }
}
