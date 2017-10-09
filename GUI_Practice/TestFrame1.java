import java.awt.*; //1. import the application windowing toolkit
import javax.swing.*; //2. import the Swing classes. Not the "x" in javax

public class TestFrame1 {
	//usual main method
	public static void main(String [] args) {
		JFrame frame = new JFrame ("Test Frame 1"); //3. construct a JFrame object and create a reference to that object
		frame.setSize(200,100); // 4. set it to 200 pixels wide and 100 pixels tall
		frame.setVisible(true); // 5. ask the frame to become visible
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 6. say what the close button does
	}
}
