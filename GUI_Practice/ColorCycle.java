import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ColorCycle extends JFrame implements ActionListener {
	JButton colorCycle;
	int clickCount = 0; //keeps track of how many times the button has been clicked
	
	public ColorCycle(String title) {
		super(title);
		colorCycle = new JButton("Color Cycle");

		colorCycle.setActionCommand("color cycle");

		setLayout(new FlowLayout());
		add(colorCycle);

		colorCycle.addActionListener(this);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public void actionPerformed (ActionEvent evt) {
		int colorCount = clickCount % 4; //depending on the number,
		//a specific color will show
		switch (colorCount){
			case 1:
				getContentPane().setBackground(Color.green);
				repaint();
				break;
			case 2:
				getContentPane().setBackground(Color.blue);
				repaint();
				break;
			case 3:
				getContentPane().setBackground(Color.gray);
				repaint();
				break;
			default:
				getContentPane().setBackground(Color.red);
				repaint();
		}
		clickCount++; //increments clickCount
	}
	public static void main(String[] args) {
		ColorCycle button = new ColorCycle("Click a button");
		button.setSize(200,150);
		button.setVisible(true);
	}
}