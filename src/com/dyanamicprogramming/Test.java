package com.dyanamicprogramming;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test {
	
	
public static void main(String[] args) {
	
	int cuts[] = new int[]{5,6,1,4,2};
	Arrays.sort(cuts);
	Rod r  = new Rod();
	int min = r.getCost(0, 9, 0, cuts.length-1, cuts);
 
	System.out.println(min);
}
}
 