package bankservice;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AccountTest {
    Account account;

    @BeforeEach
    public void setUp() {
        account = new Account("Autumn", "Barbie", "2121");
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
        account.deposit(-3_000);
        assertThrows(IllegalArgumentException.class, ()-> account.deposit(-3_000));
    }

    @Test
    public void testAccountWithdraw(){
        account.deposit(10_000);
        assertEquals(10_000,account.getBalance("2121"));
        account.withdraw(5_000, "2121");
        assertEquals(5_000,account.getBalance("2121"));
    }

    @Test
    public void testAccountTransfer(){

    }

}
