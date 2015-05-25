package teste;

import static org.junit.Assert.*;

import org.junit.Test;

import clase.Hero;

public class HeroTests {

	@Test
	public void testParametri() {
		try{
			Hero hero = new Hero("Storm",1,30,30);
		}catch(Exception ex){
			ex.printStackTrace();
		}
	}
	
	@Test
	public void testRankHero() {
		try{
			new Hero().setRank(40);
		}catch (Exception ex)
		{
			ex.printStackTrace();
		}
	}
	
	@Test
	public void testNumeHero() {
		try{
			new Hero().setHeroName("Storm");
		}catch (Exception ex)
		{
			ex.printStackTrace();
		}
	}
	
	@Test
	public void testKDAHero() {
		try{
			new Hero().setKDA(8.9);
		}catch (Exception ex)
		{
			ex.printStackTrace();
		}
	}
	
	@Test
	public void testMatchesHero()
	{
		try{
			new Hero().setMatchesPlayed(20);
		}catch (Exception ex)
		{
			ex.printStackTrace();
		}
	}
	


}
