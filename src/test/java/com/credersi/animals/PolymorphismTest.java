package com.credersi.animals;

import static org.junit.Assert.*;

import org.junit.Test;

public class PolymorphismTest {

	private boolean checkMate(PlayChess playChesser) {
		return playChesser.playChess();
	}
	@Test
	public void testCheck() {
		PlayChess rhino = new Rhino();
		assertTrue(this.checkMate(rhino));
	}
	
	private int oldAnimals(AverageAge olderBetter) {
		return olderBetter.averageAge();
	}
	@Test
	public void testAge() {
		AverageAge rhino = new Rhino();
		AverageAge parrot = new Parrot();
		
		assertEquals(this.oldAnimals(parrot), 40);
		assertEquals(this.oldAnimals(rhino), 50);
	}

}
