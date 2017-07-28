package com.stormQuest.common;

public class DiceRollerUtility {

	
	public int dieRoll(int sides) {
		int roll = 0;
		roll = (int) (Math.random() * sides) + 1;
		
		return roll;
	}
	
	public int multiDieRoll(int numberOfDies, int sides) {
		int totalRoll = 0;
		while(numberOfDies > 0) {
			totalRoll += dieRoll(sides);
			numberOfDies--;
		}
		return totalRoll;
	}
	
	public int percentRoll() {
		int percent = 0;
		percent = dieRoll(100);
		
		return percent;
	}
	
	public int thousandSidedRoll() {
		int roll = 0;
		roll = dieRoll(1000);
		
		return roll;
	}
}
