package com.credersi.animals;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class AnimalTest {
		@Test 
		public void testChess() {
			Parrot parrot = new Parrot();
			Rhino rhino = new Rhino();
			assertTrue(!parrot.playChess());
			assertTrue(rhino.playChess());
		}
		@Test
		public void testAverageAge() {
			Parrot parrot = new Parrot();
			Rhino rhino = new Rhino();
			assertEquals(parrot.averageAge(), 40);
			assertEquals(rhino.averageAge(), 50);
		}
	}

