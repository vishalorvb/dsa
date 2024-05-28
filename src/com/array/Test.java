package com.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		
		Inversion i = new Inversion();
		long[] arr = new long[] {3l,2l,1l};
		
		long l = i.getInversions(arr, arr.length);
		
		System.out.println(l);
}
}
