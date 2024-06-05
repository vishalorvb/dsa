package com.binarysearch;

public class Search {
	
	
	public int BinarySearch(int arr[],int target, int low, int high) {		
		if(low >= high && arr[low] != target) {
			return -1;
		}
		
		int mid = (high+low) /2;
		if(arr[mid] == target) {
			return mid;
		}
		if(target > arr[mid]) {
			return BinarySearch(arr, target, mid+1, high);
		}
		else {
			return BinarySearch(arr, target, low, mid-1);
		}
	}

}
