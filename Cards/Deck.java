///////////////////////////////////////////////////
//Name:McKenzie Rochester						 //
//Program: Deck.java							 //
///////////////////////////////////////////////////
//first import the Vector class from the library
import java.util.*;

public class Deck {
	
	public static void main(String[] arg) {
		String[] name = {"Ace","King","Queen","Jack","10","9","8","7","6","5","4","3","2"};
		String[] suit = {" of Hearts"," of Clubs"," of Spades"," of Diamonds"};

		Vector<String> deck = new Vector<String>(13,3);

		for(int i = 1; i < 4; i++) {
			for(int j = 1; j < 13; j++) {
				deck.add(name[j]+suit[i]);
			}
		}
		System.out.println("Original Deck: ");
		for(int k = 0; k < deck.size(); k++) {
			System.out.println(deck.get(k));
		}
		System.out.println("New Deck: ");
		Vector<String> newDeck = new Vector<String>();
		for(int shuffleTime = 0; shuffleTime < 20; shuffleTime++) {
			newDeck = shuffle(deck);
		}

		for(int j = 0; j < newDeck.size(); j++) {
			System.out.println(newDeck.get(j));
		}
	}
	
	public static Vector<String> shuffle(Vector<String> myVector) {
		Random rand = new Random();
		for (int i = 0; i < myVector.size(); i++) {
			int randomPosition = rand.nextInt(myVector.size()-1);
			String thing = myVector.get(i);
			String otherThing = myVector.get(randomPosition);
			myVector.set(i,otherThing);
			myVector.set(randomPosition,thing);
		}
		return myVector;
	}
}