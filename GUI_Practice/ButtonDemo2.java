import java.awt.*;
import java.awt.event.*; //package that deals with events
import javax.swing.*;

class ButtonFrame2 extends JFrame implements ActionListener { //ActionListener is an interface, NOT a class. Whole thing is an interface
	JButton bChange; //instance variable

	ButtonFrame2(String title) { //listener object. What the button will do when clicked
		super(title);
		setLayout(new FlowLayout());

		bChange = new JButton("Click Me!"); //references the object
		//register the ButtonFrame object as the listener for the JButton
		bChange.addActionListener(this); //this refers to ButtonFrame2 object
		add(bChange); //adds button to the frame at the top center
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //closes the frame with the x button

	}

	//listener method for the ActionListener interface
	public void actionPerformed(ActionEvent evt) {
		getContentPane().setBackground(Color.blue); //Change the frame's background
		repaint(); //ask the system to paint the screen
	}
}

public class ButtonDemo2 {
	public static void main (String[] args) {
		ButtonFrame2 frm = new ButtonFrame2("Button Demo Two");

		frm.setSize(200,100);
		frm.setVisible(true);
	}
}