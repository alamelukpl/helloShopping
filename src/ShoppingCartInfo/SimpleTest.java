package ShoppingCartInfo;


import static org.junit.Assert.*;

import org.junit.Test;

public class SimpleTest {

	@Test
	public void test() {
		ShoppingDetails shoppingdetails = new ShoppingDetails();
		shoppingdetails.addToOrder(CartInfo.BREAD, 1);
	
		assertEquals(1,shoppingdetails.getTypeCount(CartInfo.BREAD));
	}

}
