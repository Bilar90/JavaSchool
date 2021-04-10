package atm;

public class Card {

    private int accountId;
    private int clientId;
    private int pinCode;
    private int cardId;
    private int cardNumber;

    public int getCardNumber () {
        return cardNumber;
    }

    public int getCardId() {
        return cardId;
    }

    public void setPinCode (int pinCode) {
        this.pinCode = pinCode;
    }

}
