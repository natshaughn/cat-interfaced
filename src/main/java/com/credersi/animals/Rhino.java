package com.credersi.animals;

public class Rhino extends Animal implements PlayChess, AverageAge, Purr{
	
	public int purr() {
		return 0;
	}
	
	public boolean playChess() {
		return true;
	}
	
	public int averageAge() {
		return 50;
	}
}