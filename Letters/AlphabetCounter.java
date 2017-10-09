import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class AlphabetCounter {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		String line;
		int totalLetters = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name of input file: ");
		String fname = sc.nextLine();
		Scanner input = new Scanner(new File (fname));
		int[] letterCount = new int[26];
		char[] letters = {'A','B','C','D','E','F','G','H','I','J','K','L','M',
		                  'N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
		while (input.hasNextLine()) {
			line = input.nextLine();
			totalLetters += line.length();
			for (int i = 0; i <line.length();i++) {
				char ch = line.trim().toUpperCase().charAt(i);
				if (ch >= letters[0] && ch <= letters[25]) {
					int index = ch - letters[0];
					letterCount[index]++;
				}
			}
			
		}
		System.out.println("Expected: 3918");
		System.out.println(totalLetters);
		System.out.println("Expected A's: 280");
		System.out.println(letterCount[0]);
		System.out.println("Expected E's: 517");
		System.out.println(letterCount[4]);
	}

}

