public class Card {
	public String[] names = {"Ace","2","3","4","5","6","7","8","9","Jack","Queen","King"};
	public String[] suits = {" of Hearts"," of Clubs"," of Spades"," of Diamonds"};
	//constructor
	public Card(int cardNumber, int suit) {
		String cardName = names[cardNumber-1];
		String cardSuit = suits[suit-1];
		String actualCard = cardName + cardSuit;
	}
}