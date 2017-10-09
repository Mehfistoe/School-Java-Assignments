import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.Random;

public class ThreeButtonMonte extends JFrame implements ActionListener {
	//instance variables
	JButton unButton;
	JButton deuxButton;
	JButton troisButton;
	Random randNum = new Random(); //create a Random number object

	//constructor for ThreeButtonMonte
	public ThreeButtonMonte(String title) {
		super(title);
		unButton = new JButton("one");
		deuxButton = new JButton("two");
		troisButton = new JButton("three");

		unButton.setActionCommand("uno");
		deuxButton.setActionCommand("dos");
		troisButton.setActionCommand("tres");

		//choose the layout manager
		setLayout(new FlowLayout());
		add(unButton);
		add(deuxButton);
		add(troisButton);

		//register the ThreeButtonMonte frame(this)
		//as a listener for the JButtons
		unButton.addActionListener(this);
		deuxButton.addActionListener(this);
		troisButton.addActionListener(this);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public void actionPerformed(ActionEvent evt) {
		int someInt = randNum.nextInt(3); //someInt gets a number from 0 to 2
		//check which command has been sent
		if(evt.getActionCommand().equals("uno")) {
			if(someInt == 0) { //0 is the losing number
				System.exit(0); //program will close
			}else {
				getContentPane().setBackground(Color.green); //if the number is not 0, 
				//then it will change color
			}
		}
		if(evt.getActionCommand().equals("dos")) {
			if(someInt == 0) {
				System.exit(0);
			}else {
				getContentPane().setBackground(Color.blue);
			}
		}
		if(evt.getActionCommand().equals("tres")) {
			if(someInt == 0) {
				System.exit(0);
			}else {
				getContentPane().setBackground(Color.red);
			}
		}
	}
	public static void main (String[] args) {
		ThreeButtonMonte demo = new ThreeButtonMonte("Click a Button");
		demo.setSize(200,150);
		demo.setVisible(true);
	}
}