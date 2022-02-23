package ShoppingCartInfo;
import static org.junit.Assert.*;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;



class CartTest {

	@Test
	public void test() {
		ShoppingDetails shoppingdetails = new ShoppingDetails();
		shoppingdetails.addToOrder(CartInfo.BREAD, 1);
	
		assertEquals(1,shoppingdetails.getTypeCount(CartInfo.BREAD));
	}

}


