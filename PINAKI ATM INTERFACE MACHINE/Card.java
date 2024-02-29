
public class Card {
	private int cardId;
	private int pin;
	private int balance;
	
	public Card(int x, int y, int z) {
		cardId = x;
		pin = y;
		balance = z;
	}
	
	public int getCardId() {
		return cardId;
	}
	public int getCardPin() {
		return pin;
	}
	public int getCardBalance() {
		return balance;
	}
	
	public void setCardBalance(int x) {
		balance = x;
	}
}
