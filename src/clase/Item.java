package clase;

public class Item extends Shop{

	private String itemName;
	private int itemPrice;
	
	public Item(String itemName, int itemPrice) {
		super();
		this.itemName = itemName;
		this.itemPrice = itemPrice;
	}

	
	@Override
	public void descriere() {
		System.out.println(itemName + " has the following price "+ itemPrice);
	}

}
