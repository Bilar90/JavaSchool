package atm;

import java.util.ArrayList;

public class Account {

    private int accountId;
    private int clientId;
    private int balance;
    private ArrayList<Card> cardList;

    public int getAccountId() {
        return accountId;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int increment) {
        if (this.balance + increment >= 0) {
            this.balance = balance + increment;
        } else {
            System.out.println("Недостаточно средств для снятия. Пожалуйста, введите сумму не превышающую " + this.balance);
        }
    }

    public ArrayList<Card> getCardList() {
        return cardList;
    }
}
