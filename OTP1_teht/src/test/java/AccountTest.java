import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class AccountTest {
    private Account account;

    @BeforeEach
    public void setUp(){
        this.account = new Account();
    }

    @Test
    public void testBalance(){
        assertEquals(0.0, account.getBalance());
    }

    @Test
    public void testDeposit(){
        account.deposit(100.0);
        assertEquals(100.0, account.getBalance());
    }

    @Test
    public void testWithdraw(){
        account.deposit(100.0);
        assertEquals(50.0, account.withdraw(50.0));
        assertEquals(50.0, account.getBalance());
        assertEquals(0.00,account.withdraw(100.0));
        assertEquals(50.0,account.withdraw(50.0));
        assertEquals(0.0,account.getBalance());
    }




}
