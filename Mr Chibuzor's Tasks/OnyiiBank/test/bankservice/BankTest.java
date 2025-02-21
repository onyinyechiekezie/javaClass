package bankservice;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BankTest {
    Bank onyiiBank;

    @BeforeEach
    public void setUp() {
        onyiiBank = new Bank();
        onyiiBank.createAccount("Autumn", "Jordan", "2121", "2302646517");
    }
    @Test
    public void testThatNumberOfAccountIsZero() {
        assertEquals(0, onyiiBank.getNumberOfAccounts());
    }

    @Test
    public void testThatAnAccountIsCreated(){
        Account createdAccount = onyiiBank.accounts.get(0);
        assertEquals("Autumn", createdAccount.getFirstName());
        assertEquals("Jordan", createdAccount.getLastName());
    }
}
