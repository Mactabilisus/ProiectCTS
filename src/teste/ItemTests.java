package teste;

import static org.junit.Assert.*;

import org.junit.Test;

import clase.Item;

public class ItemTests {

	@Test
	public void testItemParameters() {
		try{
			Item i = new Item("Some Item", 300);
		}
		catch(Exception ex){
			ex.printStackTrace();
		}
	}
	
	@Test
	public void testItemName(){
		try{
			new Item().setItemName("Some Item");
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
	}
	
	@Test
	public void testItemPrice(){
		try{
			new Item().setItemPrice(200);
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
	}
}
