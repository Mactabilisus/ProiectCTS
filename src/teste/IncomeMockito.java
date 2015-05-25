package teste;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import static org.mockito.Mockito.*;

import clase.Income;


public class IncomeMockito {
	@Mock
	Income i;
	
	
	
	@Before
	public void setUp() throws Exception {
		i = mock(Income.class);
		System.out.println("am trecut de setup");
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testHeroNameMockito() {
		Mockito.when(i.getNume()).thenReturn("Storm");
	
		assertEquals("Storm", i.getNume());	
	}
	
	@Test
	public void testHeroKillsGoldMockito() {
		Mockito.when(i.getKillsGold()).thenReturn(150);
		
		//System.out.println(i.getNume());
		assertEquals(150, i.getKillsGold());	
		i.getDeathPenalty();
		i.getGoldPeMinut();
	}
	
	@Test
	public void testHeroDeathPenaltyMockito(){
		Mockito.when(i.getDeathPenalty()).thenReturn(130);
		
		assertEquals(130,i.getDeathPenalty());
	}
	
	@Test
	public void testHeroGoldPerMinuteMockito(){
		Mockito.when(i.getGoldPeMinut()).thenReturn(520);
		
		assertEquals(520,i.getGoldPeMinut());
	}
	
	
}
