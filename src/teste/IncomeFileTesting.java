package teste;

import static org.junit.Assert.*;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import clase.Income;
import clase.Item;

public class IncomeFileTesting {
	public static File file;
	public static BufferedReader reader;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("Before Class");
		file = new File("Income.txt");
		reader = new BufferedReader(new FileReader(file));
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("After class");
		reader.close();
	}
	
	@Test
	public void testDeathPenaltyFile() {
		Income i = new Income();
		
		try{
			String linie = reader.readLine();
			while(linie != null){
				String[] results = linie.split(";");
				int q =Integer.parseInt(linie.split(";")[0]);
				int w = Integer.parseInt(linie.split(";")[1]);
				int e =Integer.parseInt(linie.split(";")[2]);
				String r = results[3];
				i.setDeathPenalty(q);
				i.setGoldPeMinut(w);
				i.setKillsGold(e);
				i.setNume(r);
				System.out.println(results[0] + " " + results[1]);
			//	System.out.println(oa.getQability()+ " "+oa.getWability());
				linie = reader.readLine();
				assertEquals(q,i.getDeathPenalty());
			}
		}catch(Exception ex)
		{
			ex.printStackTrace();
		}
		
	}
	
	@Test
	public void testGoldPerMinute() {
		Income i = new Income();
		
		try{
			String linie = reader.readLine();
			while(linie != null){
				String[] results = linie.split(";");
				int q =Integer.parseInt(linie.split(";")[0]);
				int w = Integer.parseInt(linie.split(";")[1]);
				int e =Integer.parseInt(linie.split(";")[2]);
				String r = results[3];
				i.setDeathPenalty(q);
				i.setGoldPeMinut(w);
				i.setKillsGold(e);
				i.setNume(r);
				System.out.println(results[0] + " " + results[1]);
			//	System.out.println(oa.getQability()+ " "+oa.getWability());
				linie = reader.readLine();
				assertEquals(w,i.getGoldPeMinut());
			}
		}catch(Exception ex)
		{
			ex.printStackTrace();
		}
		
	}
	
	@Test
	public void testKillsGold() {
		Income i = new Income();
		
		try{
			String linie = reader.readLine();
			while(linie != null){
				String[] results = linie.split(";");
				int q =Integer.parseInt(linie.split(";")[0]);
				int w = Integer.parseInt(linie.split(";")[1]);
				int e =Integer.parseInt(linie.split(";")[2]);
				String r = results[3];
				i.setDeathPenalty(q);
				i.setGoldPeMinut(w);
				i.setKillsGold(e);
				i.setNume(r);
				System.out.println(results[0] + " " + results[1] + " "+results[2] + " "+results[3] );
			//	System.out.println(oa.getQability()+ " "+oa.getWability());
				linie = reader.readLine();
				assertEquals(e,i.getKillsGold());
			}
		}catch(Exception ex)
		{
			ex.printStackTrace();
		}
		
	}
	
	@Test
	public void testName() {
		Income i = new Income();
		
		try{
			String linie = reader.readLine();
			while(linie != null){
				String[] results = linie.split(";");
				int q =Integer.parseInt(linie.split(";")[0]);
				int w = Integer.parseInt(linie.split(";")[1]);
				int e =Integer.parseInt(linie.split(";")[2]);
				String r = results[3];
				i.setDeathPenalty(q);
				i.setGoldPeMinut(w);
				i.setKillsGold(e);
				i.setNume(r);
				System.out.println(results[0] + " " + results[1]);
			//	System.out.println(oa.getQability()+ " "+oa.getWability());
				linie = reader.readLine();
				assertEquals(r,i.getNume());
			}
		}catch(Exception ex)
		{
			ex.printStackTrace();
		}
		
	}

}
