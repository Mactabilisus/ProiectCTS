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

}
