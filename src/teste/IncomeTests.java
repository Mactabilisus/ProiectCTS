package teste;

import static org.junit.Assert.*;

import org.junit.Test;

import clase.Income;

public class IncomeTests {

	@Test
	public void testParametri() {
		try{
			Income inc = new Income("Storm", 40 , 40 , 40);
		}
		catch(Exception ex){
			ex.printStackTrace();
		}
	}
	
	
	@Test
	public void testDeathPenalty()
	{
		try{
			new Income().setDeathPenalty(40);
		}
		catch(Exception ex){
			ex.printStackTrace();
		}
	}
	
	@Test
	public void testGoldPeMinut()
	{
		try{
			new Income().setGoldPeMinut(520);
		}
		catch(Exception ex){
			ex.printStackTrace();
		}
	}
	
	@Test
	public void testKillsGold()
	{
		try{
			new Income().setKillsGold(300);
			
		}
		catch(Exception ex){
			ex.printStackTrace();
		}
	}
	
	@Test
	public void testNumeIncome()
	{
		try{
			new Income().setNume("Storm Spirit");
			
		}
		catch(Exception ex){
			ex.printStackTrace();
		}
	}
	

}
