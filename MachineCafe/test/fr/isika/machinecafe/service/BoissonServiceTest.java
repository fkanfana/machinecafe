package fr.isika.machinecafe.service;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BoissonServiceTest {
	private BoissonService cafe;

	@Test
	void testChoixCafeChocolat () {
		boolean excepted = true;
		boolean reel = choixCafeChocolat(true);
		assertEquals(excepted, reel);
		
	}
	
	@Test
	void testChoixAvecSansLait () {
		boolean excepted = true;
		boolean reel = choixAvecSansLait(true);
		assertEquals(excepted, reel);
		
	}
	
	@Test
	void testChoixAvecSansSucre () {
		boolean excepted = true;
		boolean reel = choixAvecSansSucre(true);
		assertEquals(excepted, reel);
		
	}
	
	@Test
	void testChoixCourtLong () {
		boolean excepted = true;
		boolean reel = choixCourtLong(true);
		assertEquals(excepted, reel);
		
	}


}
