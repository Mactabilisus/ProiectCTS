package teste;

import static org.junit.Assert.*;

import org.junit.Test;

import clase.Hero;

public class HeroTests {

	@Test
	public void testConstructorParams() {
		try{
			Hero hero = new Hero("Storm",1,30,30);
		}catch(Exception ex){
			ex.printStackTrace();
		}
	}
	
	@Test
	public void testRankHero() {
		try{
			new Hero().setRank(4);
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
			new Hero().setKDA(5.6);
		}catch (Exception ex)
		{
			ex.printStackTrace();
		}
	}
	
	@Test
	public void testMatchesHero()
	{
		try{
			new Hero().setMatchesPlayed(15);
		}catch (Exception ex)
		{
			ex.printStackTrace();
		}
	}

}
