package com.dyanamicprogramming;

public class Egg {
	
	public int eggDrop(int n, int k) {
		int floor = k;
		int eggLeft = n;
		int count = 0;
		while(floor>0 && eggLeft>1) {
			floor = floor/2;
			eggLeft--;
			count++;
		}
		
		return count + floor;
	}

}
