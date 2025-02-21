package bankservice;

public class Account {
    private int balance = 0;
    private int amount;
    private String accountNumber = "2302646517";
    private String pin = "2121";
    private String firstName;
    private String lastName;


    public Account(String firstName, String lastName, String pin) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.pin = pin;

    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }

    public boolean isExist() {
        boolean isAccountExist = true;
        return true;
    }

    public int getBalance(String pin) {
        validatePin(pin);
        return balance;
    }


    public void deposit(int amount) {
        if (amount < 0){
            throw new IllegalArgumentException("Amount cannot be negative");
        }
        balance += amount;
    }


    public void withdraw(int amount, String pin) {
        validatePin(pin);
        boolean insufficientBalance = balance < amount;
        if (insufficientBalance) throw new IllegalArgumentException("Insufficient Balance");
        boolean negativeAmount = amount < 0;
        if (negativeAmount){ throw new IllegalArgumentException("Amount cannot be negative");
        }
        balance -= amount;
    }

    public boolean update(String oldPin, String newPin) {
        if (oldPin.equals(pin)) {
            pin = newPin;
            return true;
        }
        return false;
    }

    public String validatePin(String pin) {
        if(!this.pin.equals(pin)){
            throw new IllegalArgumentException("Invalid PIN");
        }
        return ("PIN is correct");
    }


    public String getAccountName(String firstName, String lastName) {
        return firstName + " " + lastName;
    }

    public String getAccountNumber() {
        return accountNumber;
    }


}


