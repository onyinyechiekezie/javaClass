package main.java.com.semicolon.africa;

public class Account {
    private boolean isAccountExist;
    private String customerPhoneNumber;
    private String accountNumber;
    private int accountBalance;
    private String customerName;
    private String customerMailAddress;

    public String getAccountNumber() {
        return accountNumber;
    }
    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }
    public String getCustomerName() {
        return customerName;
    }
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }
    public String getCustomerMailAddress() {
        return customerMailAddress;
    }
    public void setCustomerMailAddress(String customerMailAddress) {
        this.customerMailAddress = customerMailAddress;
    }
    public String getCustomerPhoneNumber() {
        return customerPhoneNumber;
    }
    public void setCustomerPhoneNumber(String customerPhoneNumber) {
        this.customerPhoneNumber = customerPhoneNumber;
    }

    public int getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(int accountBalance) {
        this.accountBalance = accountBalance;
    }




    public boolean isAccountExist() {
        return isAccountExist;
    }

    public void setAccountExist(boolean accountExist) {
        isAccountExist = accountExist;
    }
}
