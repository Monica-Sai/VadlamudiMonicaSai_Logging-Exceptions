package epam.Log_HomeTask5;

import static org.junit.Assert.*;

import org.junit.Test;


public class HouseConstruction_Test {

	@Test
	public void testcost() {
		House_Construction h=new House_Construction();
		assertEquals(11250.00 ,h.cost("high", "yes", 4.5),0);
				
	}
}
