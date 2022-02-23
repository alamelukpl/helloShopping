package ShoppingCartInfo;

import java.util.HashMap;
import java.util.Map;

public class ShoppingDetails implements CartInterfaceDetails {
	
	private HashMap<CartInfo, Integer> order;
	
	 ShoppingDetails()
	{
		order = new HashMap<>();
	}

	@Override
	public void addToOrder(CartInfo item, int qty) {
		Integer count = order.get(item);
	       if(count != null)
	       
	    	   order.put(item, qty+count);
	       
	       else
	    	   order.put(item, qty);
	    }
		
	

	@Override
	public HashMap<CartInfo, Integer> getOrderedDetails() {
		// TODO Auto-generated method stub
		return order;
	}

	@Override
	public int getTypeCount(CartInfo item) {
	       int count=0;
	       if(order.get(item)!=null)
	       {
	    	   count = order.get(item);
	       }
	        return count;
	    }

}
