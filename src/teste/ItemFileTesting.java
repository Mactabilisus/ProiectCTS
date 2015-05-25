package teste;

import static org.junit.Assert.*;

import interfete.DecoratorAbilities;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import clase.Item;
import clase.OtherAbilities;

public class ItemFileTesting {
	public static File file;
	public static BufferedReader reader;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("Before Class");
		file = new File("OtherAbilities.txt");
		reader = new BufferedReader(new FileReader(file));
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("After class");
		reader.close();
	}

	@Test
	public void testItemName() {
		Item i = new Item();
		
		try{
			String linie = reader.readLine();
			while(linie != null){
				String[] results = linie.split(";");
				String q = results[0];
				int w = Integer.parseInt(linie.split(";")[1]);
				i.setItemName(q);
				i.setItemPrice(w);
				System.out.println(results[0] + " " + results[1]);
			//	System.out.println(oa.getQability()+ " "+oa.getWability());
				linie = reader.readLine();
				assertEquals(w,i.getItemPrice());
			}
		}catch(Exception ex)
		{
			ex.printStackTrace();
		}
		
	}

	@Test
	public void testItemPrice() {
		Item i = new Item();
		
		try{
			String linie = reader.readLine();
			while(linie != null){
				String[] results = linie.split(";");
				String q = results[0];
				int w = Integer.parseInt(linie.split(";")[1]);
				i.setItemName(q);
				i.setItemPrice(w);
				System.out.println(results[0] + " " + results[1]);
			//	System.out.println(oa.getQability()+ " "+oa.getWability());
				linie = reader.readLine();
				assertEquals(q,i.getItemName());
			}
		}catch(Exception ex)
		{
			ex.printStackTrace();
		}
		
	}

}
