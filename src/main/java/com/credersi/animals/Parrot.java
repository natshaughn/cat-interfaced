package com.credersi.animals;

public class Parrot extends Animal implements PlayChess, AverageAge, Purr{
		
		public int purr() {
			return 5;
		}
		
		public boolean playChess() {
			return false;
		}
		
		public int averageAge() {
			return 40;
		}
}
