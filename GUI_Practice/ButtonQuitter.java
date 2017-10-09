//all the necessary imports needed for the program
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

//In this program, everything is done within one class
public class ButtonQuitter extends JFrame implements ActionListener {
	JButton bQuit = new JButton("Click here to exit");

	//creates the frame
	public ButtonQuitter(String title) {
		super(title); //constructor from the JFrame class
		setLayout(new FlowLayout()); //kind of layout needed for the fram
		bQuit.addActionListener(this); //the bQuit button looks out for an action (done by clicking the button)
		add(bQuit); //adds the button to the frame
	}
	//what will happen when the action listener finds an action (clicks the button)
	public void actionPerformed(ActionEvent evt) {
		System.exit(0); //closes the frame and the program
	}
	public static void main(String[] args) {
		ButtonQuitter frame = new ButtonQuitter("Button Quitter"); //creates the button quitter object
		frame.setSize(200,100); //how big the frame will be
		frame.setVisible(true);
	}
}
