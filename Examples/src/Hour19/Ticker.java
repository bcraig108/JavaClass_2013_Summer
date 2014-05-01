package Hour19;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Ticker extends JFrame implements ActionListener, Runnable {

    JLabel  tickerLabel;
    JButton configButton;
    String  message;
    Thread  tickerControl;
    
    public Ticker() {
        super( "Ticker" );
        
        setSize( 900, 100 );
        setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        
        message = "The quick brown fox jumped over the lazy dogs.";

        tickerLabel = new JLabel( message );
        tickerLabel.setForeground( Color.red );
        tickerLabel.setBackground( Color.black );
        tickerLabel.setFont( Font.getFont("Arial") );
        
        configButton = new JButton( "Configure..." );
        configButton.addActionListener( this );
                
        BorderLayout border = new BorderLayout();
        setLayout(border);
        
        add( tickerLabel, BorderLayout.CENTER );
        add( configButton, BorderLayout.EAST );
        
        setVisible( true );
        
        tickerControl = new Thread( this );
        tickerControl.start();
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {

        message = JOptionPane.showInputDialog( 
                this, 
                "Enter your message: ", 
                message );
    }

    @Override
    public void run() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public static void main(String[] args) {
        Ticker ticker = new Ticker();
    }
}
