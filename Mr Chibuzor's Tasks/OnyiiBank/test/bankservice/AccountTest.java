package bankservice;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AccountTest {
    Account account;

    @BeforeEach
    public void setUp() {
        account = new Account("Autumn", "Jordan", "2121");
    }

    @Test
    public void testAccountExist(){
        assertTrue(account.isExist());
    }

    @Test
    public void testAccountBalance(){
        assertEquals(0,account.getBalance("2121"));
    }

    @Test
    public void testAccountDeposit(){
        account.deposit(5_000);
        assertEquals(5_000,account.getBalance("2121"));
    }

    @Test
    public void testThatNegativeAmountCannotBeDeposited(){
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class,
                ()-> account.deposit(-3_000));
        assertEquals("Amount cannot be negative", exception.getMessage());
    }

    @Test
    public void testAccountWithdraw_Deposit10k_Withdraw5k_Balance5k(){
        account.deposit(10_000);
        assertEquals(10_000,account.getBalance("2121"));
        account.withdraw(5_000, "2121");
        assertEquals(5_000,account.getBalance("2121"));
    }

    @Test
    public void testForPinUpdate(){
        boolean updatedPin = account.update("2121", "1212");
        assertTrue(updatedPin);
    }

//    @Test
//    public void testForPinValidity(){
//        pin = account.validatePin("pin");
//        assertTrue(true);
//    }

    @Test
    public void testAccountNameForFirstNameAndLastName(){
        assertEquals("Autumn Jordan", account.getAccountName("Autumn", "Jordan"));
    }

    @Test
    public void testAccountNumber() {
        assertEquals("2302646517", account.getAccountNumber());
    }

}
