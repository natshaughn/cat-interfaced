package com.credersi.animals;

public class Parrot extends Animal implements PlayChess, AverageAge, Purr, CanFly{
		
		public int purr() {
			return 5;
		}
		
		public boolean playChess() {
			return false;
		}
		
		public int averageAge() {
			return 40;
		}
		
		public float canFly() {
//			
			if (this.canFly() < 10) 
				return 5;
			else 
				return 10;
			
		}
		
}
