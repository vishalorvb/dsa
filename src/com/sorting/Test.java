package com.sorting;

import java.util.Arrays;

public class Test {

	public static void main(String[] args) {
		int arr1[] = {18,20,22,69};
		int[] arr2 = {3,12,9,29,2};

		Sort sort = new Sort();
		int[] arr = sort.Mergesort(arr2, 0, arr2.length-1);
		
		System.out.println(Arrays.toString(arr));

	}

}
