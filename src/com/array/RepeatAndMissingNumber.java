package com.array;

public class RepeatAndMissingNumber {
	
	public int[] repeatedNumber(final int[] A) {
		int sum = 0;
		int actual_sum = 0;
		int squareSum = 0;
		int actual_square = 0;
		
		for(int i=0; i<A.length;i++) {
			sum = sum + i +1;
			actual_sum = actual_sum + A[i];
			squareSum = squareSum + (i+1)*(i+1);
			actual_square = actual_square + (A[i]*A[i]);
		}
		int d = sum - actual_sum;
		int sd =  squareSum - actual_square;
		
		int x = (d + sd/d)/2;
		int y  = x-d;
		System.out.println(x);
		System.out.println(y);
		return new int[] {y,x};
		
	}
}
