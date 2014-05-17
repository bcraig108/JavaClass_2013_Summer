package Hour23;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.JCheckBox;
import javax.swing.JColorChooser;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.colorchooser.AbstractColorChooserPanel;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class CrazyFontDemo extends JFrame implements 
        ActionListener, ItemListener, ChangeListener {

    JComboBox     fontComboBox;
    JCheckBox     boldCheckBox;
    JCheckBox     italicCheckBox;
    JSlider       sizeSlider;
    JCheckBox     antiAliasCheckBox;
    JColorChooser colorChooser;
    JPanel        drawingPanel;
    
    public CrazyFontDemo() {
        super( "Font Demo" );
        
        setSize( 640, 480 );
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        BorderLayout border = new BorderLayout();
        setLayout(border);

        JPanel topPanel = new JPanel();
        
        fontComboBox = new JComboBox();
        fontComboBox.addItem( "Broadway" );
        fontComboBox.addItem( "Calibri" );
        fontComboBox.addItem( "Comic Sans MS" );
        fontComboBox.addItem( "Cooper Black" );
        fontComboBox.addItem( "Courier New" );
        fontComboBox.addItem( "Times New Roman" );
        fontComboBox.addItemListener(this);
        topPanel.add(fontComboBox);

        boldCheckBox = new JCheckBox( "Bold" );
        boldCheckBox.addActionListener(this);
        topPanel.add(boldCheckBox);
        
        italicCheckBox = new JCheckBox( "Italic" );
        italicCheckBox.addActionListener(this);
        topPanel.add( italicCheckBox );
        
        JLabel sizeLabel = new JLabel( "Size" );
        topPanel.add( sizeLabel );

        sizeSlider = new JSlider( 0, 200, 50 );
        sizeSlider.setMajorTickSpacing( 100 );
        sizeSlider.setMinorTickSpacing( 25 );
        sizeSlider.setPaintTicks( true );
        sizeSlider.setPaintLabels( true );
        sizeSlider.addChangeListener(this);
        topPanel.add( sizeSlider );
        
        antiAliasCheckBox = new JCheckBox( "Anti-Aliasing" );
        antiAliasCheckBox.addActionListener(this);
        topPanel.add( antiAliasCheckBox );
        
        colorChooser = new JColorChooser( Color.WHITE );
        colorChooser.getSelectionModel().addChangeListener(this);
        colorChooser.setPreviewPanel(new JPanel());
        
        AbstractColorChooserPanel[] panels = colorChooser.getChooserPanels();
        for (AbstractColorChooserPanel accp : panels) {
            if ( accp.getDisplayName().equals("RGB") == false ) {
                AbstractColorChooserPanel[] newPanel = { accp };        
                colorChooser.setChooserPanels( newPanel );
            }
        }
        add( colorChooser, BorderLayout.SOUTH );
        
        add( topPanel, BorderLayout.NORTH );

        drawingPanel = new JPanel();
        add( drawingPanel, BorderLayout.CENTER );
        
        setVisible( true );
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        repaint();
    }

    @Override
    public void itemStateChanged(ItemEvent ie) {
        repaint();
    }

    @Override
    public void stateChanged(ChangeEvent ce) {
        repaint();
    }

    @Override
    public void paint( Graphics g ) {

        super.paint(g);
        
        if (drawingPanel != null) {
            Graphics2D dpg = (Graphics2D)drawingPanel.getGraphics();

            String fontString = (String)fontComboBox.getSelectedItem();
            
            int style = Font.PLAIN;
            
            if ( boldCheckBox.isSelected() ) {
                style |= Font.BOLD;
            }
            
            if ( italicCheckBox.isSelected() ) {
                style |= Font.ITALIC;
            }
                        
            int size = sizeSlider.getValue();
            
            Font font = new Font( fontString, style, size );
            dpg.setFont( font );

            Color color = colorChooser.getColor();
            dpg.setColor(color);
            
            Object hintValue = RenderingHints.VALUE_ANTIALIAS_OFF;
            
            if ( antiAliasCheckBox.isSelected() ) {
                hintValue = RenderingHints.VALUE_ANTIALIAS_ON;
            }
            
            dpg.setRenderingHint( RenderingHints.KEY_ANTIALIASING, hintValue );
            
            dpg.drawString( fontString, 20, 150 );
        }
    }
    
    public static void main(String[] args) {
        CrazyFontDemo demo = new CrazyFontDemo();
    }

}
