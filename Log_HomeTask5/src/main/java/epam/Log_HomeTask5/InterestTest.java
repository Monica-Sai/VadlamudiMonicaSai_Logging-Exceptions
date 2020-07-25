package epam.Log_HomeTask5;

import static org.junit.Assert.*;

import org.junit.Test;

public class InterestTest {

	@Test
	public void testSimpleInterest() {
		Interest_Calculator s=new Interest_Calculator();
		assertEquals(1500.00,s.SimpleInterest(10000.00, 3, 5.00),0);
	}

	@Test
	public void testCompoundInterest() {
		Interest_Calculator s=new Interest_Calculator();
		assertEquals(1210.0000000000002,s.CompoundInterest(1000, 2, 10),0);
	}

}
