import java.awt.*; 
import java.awt.event.*;
import javax.swing.*;

public class Repeater extends JFrame implements ActionListener
{
    JLabel inLabel = new JLabel("Enter Your Name: ");
    JTextField inText = new JTextField(15);

    JLabel outLabel = new JLabel("Here is your name: ");
    JTextField outText = new JTextField(15);

    //constructor
    public Repeater(String title)
    {
        super(title);
        setLayout(new FlowLayout());
        outText.setEditable(false);

        add(inLabel);
        add(inText);
        add(outLabel);
        add(outText);

        inText.addActionListener(this);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    //application code
    void copyText()
    {
        String name = inText.getText();
        outText.setText(name);
    }

    public void actionPerformed(ActionEvent evt)
    {
        copyText();
        repaint();
    }

    public static void main(String[] args)
    {
        Repeater echo = new Repeater("Repeater");
        echo.setSize(300,100);
        echo.setVisible(true);
    }
}