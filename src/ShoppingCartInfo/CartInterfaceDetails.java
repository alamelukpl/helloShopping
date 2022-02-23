package ShoppingCartInfo;

import java.util.HashMap;
import java.util.Map;

interface CartInterfaceDetails {
	
	public void addToOrder(CartInfo item, int count);
	
	public HashMap<CartInfo, Integer> getOrderedDetails();
	
	public int getTypeCount(CartInfo item);

}
