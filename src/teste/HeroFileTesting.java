package teste;

import static org.junit.Assert.*;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import clase.Hero;
import clase.Item;

public class HeroFileTesting {
	public static File file;
	public static BufferedReader reader;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("Before Class");
		file = new File("Hero.txt");
		reader = new BufferedReader(new FileReader(file));
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("After class");
		reader.close();
	}

	@Test
	public void testHeroName() {
		Hero hero = new Hero();
		
		try{
			String linie = reader.readLine();
			while(linie != null){
				String[] results = linie.split(";");
				String q = results[0];
				int w = Integer.parseInt(linie.split(";")[1]);
				double d = Double.parseDouble(linie.split(";")[2]);
				int r = Integer.parseInt(linie.split(";")[3]);
				hero.setHeroName(q);
				hero.setKDA(d);
				hero.setMatchesPlayed(w);
				hero.setRank(r);
				System.out.println(results[0] + " " + results[1] + " "+ results[2] + " "+results[3]);
			//	System.out.println(oa.getQability()+ " "+oa.getWability());
				linie = reader.readLine();
				assertEquals(q,hero.getHeroName());
						}
		}catch(Exception ex)
		{
			ex.printStackTrace();
		}
		
	}
	
	@Test
	public void testHeroKDA() {
		Hero hero = new Hero();
		
		try{
			String linie = reader.readLine();
			while(linie != null){
				String[] results = linie.split(";");
				String q = results[0];
				int w = Integer.parseInt(linie.split(";")[1]);
				double d = Double.parseDouble(linie.split(";")[2]);
				int r = Integer.parseInt(linie.split(";")[3]);
				hero.setHeroName(q);
				hero.setKDA(d);
				hero.setMatchesPlayed(w);
				hero.setRank(r);
				System.out.println(results[0] + " " + results[1] + " "+ results[2] + " "+results[3]);
			//	System.out.println(oa.getQability()+ " "+oa.getWability());
				linie = reader.readLine();
				assertEquals(d,hero.getKDA());
						}
		}catch(Exception ex)
		{
			ex.printStackTrace();
		}
		
	}
	
	@Test
	public void testHeroRank() {
		Hero hero = new Hero();
		
		try{
			String linie = reader.readLine();
			while(linie != null){
				String[] results = linie.split(";");
				String q = results[0];
				int w = Integer.parseInt(linie.split(";")[1]);
				double d = Double.parseDouble(linie.split(";")[2]);
				int r = Integer.parseInt(linie.split(";")[3]);
				hero.setHeroName(q);
				hero.setKDA(d);
				hero.setMatchesPlayed(w);
				hero.setRank(r);
				System.out.println(results[0] + " " + results[1] + " "+ results[2] + " "+results[3]);
			//	System.out.println(oa.getQability()+ " "+oa.getWability());
				linie = reader.readLine();
				assertEquals(r,hero.getRank());
						}
		}catch(Exception ex)
		{
			ex.printStackTrace();
		}
		
	}
	
	@Test
	public void testHeroMatchesPlayed() {
		Hero hero = new Hero();
		
		try{
			String linie = reader.readLine();
			while(linie != null){
				String[] results = linie.split(";");
				String q = results[0];
				int w = Integer.parseInt(linie.split(";")[1]);
				double d = Double.parseDouble(linie.split(";")[2]);
				int r = Integer.parseInt(linie.split(";")[3]);
				hero.setHeroName(q);
				hero.setKDA(d);
				hero.setMatchesPlayed(w);
				hero.setRank(r);
				System.out.println(results[0] + " " + results[1] + " "+ results[2] + " "+results[3]);
			//	System.out.println(oa.getQability()+ " "+oa.getWability());
				linie = reader.readLine();
				assertEquals(w,hero.getMatchesPlayed());
						}
		}catch(Exception ex)
		{
			ex.printStackTrace();
		}
		
	}
	
	

}
