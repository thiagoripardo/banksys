package banksys.account;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

import banksys.account.exception.InsufficientFundsException;
import banksys.account.exception.NegativeAmountException;

public class OrdinaryAccountTest {

	private OrdinaryAccount account;
	
	@Before
	public void setUp() throws Exception {
		account = new OrdinaryAccount("123A");
	}
	
	@Test
	public void testCredit50AndDebit30(){
		try {
			account.credit(50);
			assertEquals("Erro na op", 50, account.getBalance(), 0.0);
			account.debit(30);
			assertEquals("Erro na op", 20, account.getBalance(), 0.0);
		} catch (NegativeAmountException e) {
			// TODO Auto-generated catch block
			fail(e.getMessage());
		} catch (InsufficientFundsException e) {
			// TODO Auto-generated catch block
			fail(e.getMessage());
		}
	}

	@Test
	public void testDebit() {
		try {
			account.debit(30);
			assertEquals("message", 30, account.getBalance(), 0.0);
		} catch (NegativeAmountException e) {
			// TODO Auto-generated catch block
			fail(e.getMessage());
		} catch (InsufficientFundsException e) {
			// TODO Auto-generated catch block
			fail(e.getMessage());
		}
	}

	@Test
	public void testOrdinaryAccount() {
		fail("Not yet implemented");
	}

	@Test
	public void testCredit() {
		fail("Not yet implemented");
	}

}
