package clase;

public class Item extends Shop{

	private String itemName;
	private int itemPrice;
	
	public Item(String _itemName, int _itemPrice) {
		super();
		if (_itemName != null && !_itemName.matches("[0-9]+")){
		
			this.itemName = _itemName;
		}
		else
		{
			System.out.println("Item name gresit");	
		}
		if(_itemPrice < 0){
			System.out.println("Item price gresit");
		}
		else
		{
			this.itemPrice = _itemPrice;
		}
	}

	
	public Item() {
	}


	public String getItemName() {
		return itemName;
	}


	public void setItemName(String _itemName) {
		if (_itemName != null && !_itemName.matches("[0-9]+")){
			this.itemName = _itemName;
		}
		else
		{
			System.out.println("Item name gresit");
			
		}
	}


	public int getItemPrice() {
		return itemPrice;
	}


	public void setItemPrice(int _itemPrice) {
		if(_itemPrice <= 0){
			System.out.println("Item price gresit");
		}
		else
		{
			this.itemPrice = _itemPrice;
		}
	}


	@Override
	public void descriere() {
		System.out.println(itemName + " has the following price "+ itemPrice);
	}

}
