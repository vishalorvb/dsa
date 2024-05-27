package com.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		
		int[] list = new int[] {1,0,-1,0,-2,2};
		List<List<Integer>> res = new ArrayList<List<Integer>>();
		FourSum f = new FourSum();
		Arrays.sort(list);
		f.getSum(list, new ArrayList<Integer>(), 0, 0,res);
		
}
}
