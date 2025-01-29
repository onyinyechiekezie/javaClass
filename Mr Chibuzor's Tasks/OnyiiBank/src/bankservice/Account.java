package bankservice;

public class Account {
    private int balance = 0;
    private int amount;
    private String accountNumber;


    public Account(String firstName, String lastName, String pin) {

    }

    public boolean isExist() {
        boolean isAccountExist = true;
        return true;
    }

    public int getBalance(String pin) {
        return balance;
    }


    public void deposit(int amount) {
        if (amount >= balance) {
            //throw new IllegalArgumentException("Amount cannot be negative");
            balance += amount;
        }

    }


    public void withdraw(int amount, String pin) {
        boolean insufficientBalance = balance < amount;
        if (insufficientBalance) throw new IllegalArgumentException("Insufficient Balance");
        boolean negativeAmount = amount < 0;
        if (negativeAmount){ throw new IllegalArgumentException("Amount cannot be negative");
        }
        balance -= amount;
    }
}


