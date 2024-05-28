package com.array;

import java.util.Arrays;

public class Inversion {
		
	static Long  count = 0l;
	
    public static long getInversions(long arr[], int n) {
        // Write your code here.
    	Mergesort(arr,0,n-1);
    	return count;
    }
	
    public static long[] Mergesort(long arr[],int low, int high) {
		if(low == high) {
			long[] t = new long[1];
			t[0] = arr[low];
			return t;
		}
		
		int mid = (high+low)/2;
		long[] fh = Mergesort(arr, low, mid);
		long[] sh  = Mergesort(arr, mid+1, high);
		
		return mergerSortedArray(fh, sh);
	}

    public static long[] mergerSortedArray(long arr1[], long arr2[]) {
		long temp[] = new long[arr1.length + arr2.length];
		int i = 0;
		int j = 0;
		int k = 0;
		
	System.out.println(Arrays.toString(arr1));
	System.out.println(Arrays.toString(arr2));

		while (i < arr1.length && j < arr2.length) {
			if (arr1[i] > arr2[j]) {
				temp[k] = arr2[j];
				System.out.println(arr1[i]+","+arr2[j]);
				count = count + (arr1.length -i);
				System.out.println(count);
				j++;
			} else {
				temp[k] = arr1[i];
				i++;
			}
			k++;
		}
		while (i < arr1.length) {
			temp[k] = arr1[i];
			k++;
			i++;
		}
		while (j < arr2.length) {
			temp[k] = arr2[j];
			k++;
			j++;
		}
		System.out.println("===============");
		return temp;
	}
	
}
