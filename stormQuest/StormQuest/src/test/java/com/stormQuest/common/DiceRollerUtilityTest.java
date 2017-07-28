package com.stormQuest.common;

import static org.junit.Assert.*;

import org.junit.Test;

public class DiceRollerUtilityTest {
	
	private int[] sidesList = {2,4,6,8,10,12,20,30,60,100};
	private int numberOfTestToLoop = 10000;
	
	DiceRollerUtility dieRoller = new DiceRollerUtility();
	
	@Test
	public void testDieRoll() {
		boolean pass = false;
		while(numberOfTestToLoop > 0) {
			for (int sides : sidesList) {
				int roll = dieRoller.dieRoll(sides);
				if (roll > 0 && roll <= sides) {
					pass = true;
//					System.out.println("number of sides tested: " + sides + " the roll was: " + roll);
				}else {
					pass = false;
					break;
				}
			}
			numberOfTestToLoop--;
		}
		assertTrue(pass);
	}
	
	@Test
	public void testDieRollMin() {
		boolean pass = false;
		while(numberOfTestToLoop > 0) {
			for (int sides : sidesList) {
				int roll = dieRoller.dieRoll(sides);
				if (roll == 1) {
					pass = true;
					break;
				}else {
					pass = false;
				}
			}
			numberOfTestToLoop--;
		}
		assertTrue(pass);
	}
	
	@Test
	public void testDieRollMax() {
		boolean pass = false;
		while(numberOfTestToLoop > 0) {
			for (int sides : sidesList) {
				int roll = dieRoller.dieRoll(sides);
				if (roll == sides) {
					pass = true;
					break;
				}else {
					pass = false;
				}
			}
			numberOfTestToLoop--;
		}
		assertTrue(pass);
	}
	
	@Test
	public void testPercentRoll() {
		boolean pass = false;
		while(numberOfTestToLoop > 0) {
			int roll = dieRoller.percentRoll();
			if (roll > 0 && roll <= 100) {
				pass = true;
//				System.out.println(roll);
			}else {
				pass = false;
				break;
			}
			numberOfTestToLoop--;
		}
		assertTrue(pass);
	}
	
	
	@Test
	public void testPercentRollMin() {
		boolean pass = false;
		while(numberOfTestToLoop > 0) {
			int roll = dieRoller.percentRoll();
			if (roll == 1) {
				pass = true;
				break;
			}else {
				pass = false;
			}
			numberOfTestToLoop--;
		}
		assertTrue(pass);
	}
	
	@Test
	public void testPercentRollMax() {
		boolean pass = false;
		while(numberOfTestToLoop > 0) {
			int roll = dieRoller.percentRoll();
			if (roll == 100) {
				pass = true;
				break;
			}else {
				pass = false;
			}
			numberOfTestToLoop--;
		}
		assertTrue(pass);
	}
	
	@Test
	public void testMultiDieRoll() {
		boolean pass = false;
		int numberOfDice = 1;
		int totalRoll = 0;
		while(numberOfTestToLoop > 0) {
			for (int sides : sidesList) {
				int minRoll = numberOfDice;
				int maxRoll = numberOfDice * sides;
				totalRoll = dieRoller.multiDieRoll(numberOfDice, sides);
				if (totalRoll >= minRoll && totalRoll <= maxRoll) {
					pass = true;
				}else {
					pass = false;
//					System.out.println("number of sides tested: " + sides + " the roll was: " + totalRoll);
					break;
				}
			}
			numberOfTestToLoop--;
			numberOfDice++;
		}
		assertTrue(pass);
	}
	
	@Test
	public void testThousandSidedRoll() {
		boolean pass = false;
		while(numberOfTestToLoop > 0) {
			int roll = dieRoller.thousandSidedRoll();
			if (roll > 0 && roll <= 1000) {
				pass = true;
//				System.out.println(roll);
			}else {
				pass = false;
				break;
			}
			numberOfTestToLoop--;
		}
		assertTrue(pass);
	}
	
	
	@Test
	public void testThousandSidedRollMin() {
		boolean pass = false;
		while(numberOfTestToLoop > 0) {
			int roll = dieRoller.thousandSidedRoll();
			if (roll == 1) {
				pass = true;
				break;
			}else {
				pass = false;
			}
			numberOfTestToLoop--;
		}
		assertTrue(pass);
	}
	
	@Test
	public void testThousandSidedRollMax() {
		boolean pass = false;
		while(numberOfTestToLoop > 0) {
			int roll = dieRoller.thousandSidedRoll();
			if (roll == 1000) {
				pass = true;
				break;
			}else {
				pass = false;
			}
			numberOfTestToLoop--;
		}
		assertTrue(pass);
	}
}
