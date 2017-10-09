import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MazeButtons extends JFrame implements ActionListener {

	//instance variables
	JButton decks;
	JButton dorms;
	JButton turnerField;

	//constructor
	public MazeButtons(String title) {

		super(title);//???
		decks = new JButton("Decks");
		dorms = new JButton("Dorms");
		turnerField = new JButton("Turner Field");

		decks.setActionCommand("one");
		dorms.setActionCommand("two");
		turnerField.setActionCommand("three");

		//choose the layout manager
		setLayout(new FlowLayout());
		add(decks);
		add(dorms);
		add(turnerField);
	}
}