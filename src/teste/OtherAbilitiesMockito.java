package teste;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

import clase.Atacuri;
import clase.Income;
import clase.OtherAbilities;

public class OtherAbilitiesMockito {
	@Mock
	OtherAbilities oa;
	
	
	@Before
	public void setUp() throws Exception {
		oa = mock(OtherAbilities.class);
		System.out.println("am trecut de setup");
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testQAbilityMockito() {
		Mockito.when(oa.getQability()).thenReturn("Necromastery");
		
		assertEquals("Necromastery",oa.getQability());
	}
	
	@Test
	public void testWAbilityMockito() {
		Mockito.when(oa.getWability()).thenReturn("Requiem");
		
		assertEquals("Requiem",oa.getWability());
	}
	
	
	
	

}
