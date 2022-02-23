package ShoppingCartInfo;

public enum CartInfo{
	GRAINS("Grains",20),
	BREAD("Bread",10),
	COKE("Coke",5);
	
	private final String items;
	private final int price;

	CartInfo(String items, int price) {
		this.items = items;
		this.price = price;
	}
	
	public String label()
	{
		return this.items;
	}
	
	public int cost()
	{
		return this.cost();
	}
	
	
}
