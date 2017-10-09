import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class TwoButtons extends JFrame implements ActionListener {
	JButton redButton;
	JButton grnButton;
	JButton bluButton;
	JButton gryButton;

	//constructor for TwoButtons
	public TwoButtons(String title) {
		super(title);
		redButton = new JButton("Red");
		grnButton = new JButton("Green");
		bluButton = new JButton("Blue");
		gryButton = new JButton("Gray");
		//because we want the two buttons to do different things
		//we need to differentiate between the ActionEvents 
		//delivered to actionPerformed
		redButton.setActionCommand("red");
		grnButton.setActionCommand("green");
		bluButton.setActionCommand("blue");
		gryButton.setActionCommand("gray");

		//choose the layout manager
		setLayout(new FlowLayout());
		add(redButton);
		add(grnButton);
		add(bluButton);
		add(gryButton);

		//register the buttonDemo frame(this)
		//as a listener for both JButtons
		redButton.addActionListener(this);
		grnButton.addActionListener(this);
		bluButton.addActionListener(this);
		gryButton.addActionListener(this);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public void actionPerformed(ActionEvent evt) {
		//check which command has been sent
		if (evt.getActionCommand().equals("red")) {
			getContentPane().setBackground(Color.red);
		}
		else if (evt.getActionCommand().equals("green")){
			getContentPane().setBackground(Color.green);
		}else if (evt.getActionCommand().equals("blue")) {
			getContentPane().setBackground(Color.blue);
		}else if (evt.getActionCommand().equals("gray")) {
			getContentPane().setBackground(Color.gray);
		}
		repaint();
	}
	public static void main (String[] args) {
		TwoButtons demo = new TwoButtons("Click a Button");
		demo.setSize(200,150);
		demo.setVisible(true);
	}
}