package atm;

import java.util.ArrayList;

public class Client {

    private int clientId;

    private String firstName;
    private String lastName;
    private String midName;

    private ArrayList<Account> accountList;

    public int getClientId () {
        return clientId;
    }

    public ArrayList<Account> getAccountList () {
        return accountList;
    }

    public String getFullName () {
        return lastName + " " + firstName + " " + midName;
    }

}
