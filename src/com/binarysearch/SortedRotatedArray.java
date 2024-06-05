package com.binarysearch;

public class SortedRotatedArray {

	public int getPivot(int arr[], int low, int high) {
		
		int mid = (low + high) / 2;
		if(arr[high]>=arr[low]) {
			return low;
		}

		if (arr[low] < arr[mid]) {
			return getPivot(arr, mid + 1, high);
		} else {
			return getPivot(arr, low, mid);
		}
	}
}
