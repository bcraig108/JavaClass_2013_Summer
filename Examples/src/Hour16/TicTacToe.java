/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Hour16;

import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Dad
 */
public class TicTacToe extends JFrame implements ActionListener {

    JButton [][] buttons;
    
    TicTacToe() {
        super( "Tic-Tac-Toe" );
        setSize( 300, 300 );
        setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        
        GridLayout grid = new GridLayout( 3, 3 );
        setLayout( grid );
        
        Font font = new Font( Font.MONOSPACED, Font.BOLD, 50 );
        
        buttons = new JButton[3][3];
        
        for ( int row = 0; row < 3; row++ ) {
            for ( int col = 0; col < 3; col++ ) {
                buttons[row][col] = new JButton();
                buttons[row][col].addActionListener( this );
                buttons[row][col].setFont( font );
                
                add( buttons[row][col] );
            }
        }
        
        setVisible( true );
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {

        JButton source = (JButton)ae.getSource();
        
        source.setText( "X" );
        source.setEnabled( false );
        
        makePlay();

        if ( checkForWinner( "O" ) ) {
            JOptionPane.showMessageDialog( 
                    this, 
                    "You Lose!", 
                    null, 
                    JOptionPane.PLAIN_MESSAGE );
        }
        else if ( checkForWinner( "X" ) ) {
            JOptionPane.showMessageDialog( 
                    this, 
                    "You Win!", 
                    null, 
                    JOptionPane.PLAIN_MESSAGE );
        }
    }

    void makePlay() {
        
        playLoop:
        for ( int row = 0; row < 3; row++ ) {
            for ( int col = 0; col < 3; col++ ) {
                if ( buttons[row][col].isEnabled() ) {
                    buttons[row][col].setText( "O" );
                    buttons[row][col].setEnabled( false );
                    break playLoop;
                }
            }
        }
    }

    boolean checkForWinner( String player ) {
        
        boolean winner = false;
        
        if ( ( buttons[0][0].getText().compareTo( player ) == 0 &&
               buttons[0][1].getText().compareTo( player ) == 0 &&
               buttons[0][2].getText().compareTo( player ) == 0 ) ||
             ( buttons[1][0].getText().compareTo( player ) == 0 &&
               buttons[1][1].getText().compareTo( player ) == 0 &&
               buttons[1][2].getText().compareTo( player ) == 0 ) ||  
             ( buttons[2][0].getText().compareTo( player ) == 0 &&
               buttons[2][1].getText().compareTo( player ) == 0 &&
               buttons[2][2].getText().compareTo( player ) == 0 ) ||  
             ( buttons[0][0].getText().compareTo( player ) == 0 &&
               buttons[1][0].getText().compareTo( player ) == 0 &&
               buttons[2][0].getText().compareTo( player ) == 0 ) ||  
             ( buttons[0][1].getText().compareTo( player ) == 0 &&
               buttons[1][1].getText().compareTo( player ) == 0 &&
               buttons[2][1].getText().compareTo( player ) == 0 ) ||  
             ( buttons[0][2].getText().compareTo( player ) == 0 &&
               buttons[1][2].getText().compareTo( player ) == 0 &&
               buttons[2][2].getText().compareTo( player ) == 0 ) ||  
             ( buttons[0][0].getText().compareTo( player ) == 0 &&
               buttons[1][1].getText().compareTo( player ) == 0 &&
               buttons[2][2].getText().compareTo( player ) == 0 ) ||  
             ( buttons[0][2].getText().compareTo( player ) == 0 &&
               buttons[1][1].getText().compareTo( player ) == 0 &&
               buttons[2][0].getText().compareTo( player ) == 0 ) ) {
            winner = true;
        }        

        return winner;
    }

    public static void main(String[] args) {
        TicTacToe ticTacToe = new TicTacToe();
    }

}
