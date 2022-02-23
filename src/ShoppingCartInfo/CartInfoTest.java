package ShoppingCartInfo;
import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.*;

import org.junit.Test;



import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;



public class CartInfoTest {

	@Test
	public void test() {
		ShoppingDetails shoppingdetails = new ShoppingDetails();
		shoppingdetails.addToOrder(CartInfo.BREAD, 1);
		shoppingdetails.addToOrder(CartInfo.COKE, 2);
	
		assertEquals(1,shoppingdetails.getTypeCount(CartInfo.BREAD));
		assertEquals(2,shoppingdetails.getTypeCount(CartInfo.COKE));
	}
	
	
	@Test
	
    public void _11_validateFurniture() {
    	for (CartInfo f : CartInfo.values()) {
    		switch(f.label()) {
    		case("Grains"):
    			assertEquals(20,f.cost());
    			break;
    		case("Bread"):
    			assertEquals(10,f.cost());
    			break;
    		case("Coke"):
    			assertEquals(5,f.cost());
    			break;
    		}
    	}
	}
	
	

}
