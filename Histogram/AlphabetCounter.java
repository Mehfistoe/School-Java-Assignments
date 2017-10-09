import java.util.Scanner;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Polygon;
import java.awt.Font;
import java.io.File;
import java.io.FileNotFoundException;
public class AlphabetCounter {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the input file: ");
		String fname = sc.nextLine();
		Scanner input = new Scanner(new File(fname));
		
		int totalLetters = 0;
		int[] letterCount = new int[26];
		char[] letters = {'A','B','C','D','E','F','G','H','I','J','K','L','M',
		                  'N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
		String[] alphabet = {"A","B","C","D","E","F","G","H","I","J","K","L","M",
                			"N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
		while (input.hasNextLine() == true) {
			String line = input.nextLine().trim().toUpperCase().replaceAll(" ","").replaceAll("\\W", ""); //Removes the spaces in the line
			totalLetters += line.length(); //Counts the amount of letters in the line
			for (int i = 0; i <line.length();i++) { //beginning of for
				char ch = line.charAt(i);
				if (ch >= letters[0] && ch <= letters[25]) { //beginning of if
					int index = ch - letters[0];
						letterCount[index]++;
				} //End of if
			} //End for
		}
		//Finding the most frequent letter
		int highestCount = letterCount[0];
		for (int j = 1; j < letterCount.length - 1; j++) {
			if (letterCount[j] > highestCount) {
				highestCount = letterCount[j];
			}
		}
		System.out.println("Number of letters in File: " + totalLetters);
		DrawingPanel p = new DrawingPanel(1050,600);
		Graphics g = p.getGraphics();
		Font f = new Font("Serif", Font.PLAIN,14);
		g.setFont(f);
		int n = 0;
		int x = 20;
		for (; n < letterCount.length; n++,x+=40) {
			int height = (int) 400.0*letterCount[n]/highestCount;//start at 560
			g.setColor(Color.BLUE);
			//Make the highest bar a different color
			if (letterCount[n] == highestCount) {
				g.setColor(Color.RED);
			}
			g.fillRect(x,560-height,20,height);
			g.drawString(alphabet[n],x,575);
			String s = String.valueOf(letterCount[n]);
			g.drawString(s,x,550-height);
			
		}
	}
}
