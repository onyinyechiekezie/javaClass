package bankservice;

import java.util.ArrayList;



public class Bank {
    private int numberOfAccounts;
    ArrayList<Account> accounts = new ArrayList<>();

    public int getNumberOfAccounts() {
        return 0;
    }

    public void createAccount(String firstName, String lastName, String pin, String accountNumber) {
        Account account = new Account(firstName, lastName, pin);
        accounts.add(account);
        numberOfAccounts++;
    }

    public String getFirstName(Account account) {
        return account.getFirstName();
    }

    public String getLastName(Account account) {
        return account.getLastName();
    }

//    public String getPin(String pin) {
//        return pin;
//    }
//    public String transferMoney(String from, String to, int amount) {
//
//    }
}
