package Hour19;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class PrimeFinder extends JFrame implements Runnable, ActionListener {

    Thread     primeThread;
    JLabel     howManyLabel;
    JTextField howManyField;
    JButton    displayButton;
    JTextArea  primesArea;

    public PrimeFinder() {
        super( "Prime Number Finder" );
        setSize( 400, 300 );
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        BorderLayout border = new BorderLayout();
        setLayout(border);
        
        howManyLabel = new JLabel( "Quantity: " );
        howManyField = new JTextField( "400", 10 );
        displayButton = new JButton( "Display Primes!" );
        primesArea = new JTextArea( 8, 40 );
        
        displayButton.addActionListener(this);
        howManyField.addActionListener(this);
        
        JPanel topPanel = new JPanel();
        topPanel.add( howManyLabel );
        topPanel.add( howManyField );
        topPanel.add( displayButton );
        add( topPanel, BorderLayout.NORTH );
        
        primesArea.setLineWrap( true );
        JScrollPane textPane = new JScrollPane( primesArea );
        add( textPane, BorderLayout.CENTER );
        
        setVisible( true );
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        if ( ae.getSource() == howManyField || 
             ae.getSource() == displayButton ) {
            displayButton.setEnabled( false );
            
            if ( primeThread == null ) {
                primeThread = new Thread( this );
                primeThread.start();
            }
        }
    }

    @Override
    public void run() {
        int quantity = Integer.parseInt( howManyField.getText() );
        int numPrimes = 0;
        int candidate = 2;
        
        primesArea.setText( "First " + quantity + " primes: " );
        
        while ( numPrimes < quantity ) {
            if ( isPrime( candidate ) ) {
                primesArea.append( candidate + ", " );
                numPrimes++;
            }
            candidate++;
        }
        
        primeThread = null;
        displayButton.setEnabled( true );
    }
    
    private static boolean isPrime( int candidate ) {
        double root = Math.sqrt( candidate );
        
        for ( int index = 2; index <= root; index++ ) {
            if ( candidate % index == 0 ) {
                return false;
            }
        }
        
        return true;
    }

    public static void main(String[] args) {
        PrimeFinder prime = new PrimeFinder();
    }
}
