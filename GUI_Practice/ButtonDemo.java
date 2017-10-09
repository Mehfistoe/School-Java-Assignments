import java.awt.*;
import javax.swing.*;

class ButtonFrame extends JFrame {
	JButton bChange;
	
	ButtonFrame(String title) {
		super(title);
		setLayout(new FlowLayout());
		
		bChange = new JButton("Click Me!");
		add(bChange);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
public class ButtonDemo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ButtonFrame frm = new ButtonFrame("Button Demo");
		frm.setSize(150,75);
		frm.setVisible(true);
	}

}
