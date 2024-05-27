package com.dyanamicprogramming;

public class Coin {

	public  int minimumCoin(int coins[], int target) {

		int dpArray[] = new int[target+1];
		for(int i=1; i< dpArray.length; i++) {
			int min = Integer.MAX_VALUE-1;
			for(int j=0;j<coins.length;j++) {
				if(coins[j]<=i) {
					int temp = dpArray[i-coins[j]] +1;
					if(temp<min) {
						min = temp;
					}
				}
			}
			dpArray[i] = min;
			
		}
		return dpArray[target]>=Integer.MAX_VALUE-1?-1:dpArray[target];
	}

}
