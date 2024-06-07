package com.binarysearch;

public class KthElement {

	public long kthElement(int arr1[], int arr2[], int n, int m, int k) {
		
		int smallerArrayLength = Math.min(arr1.length, arr2.length);
		int min = 0;
		int max = Math.min(smallerArrayLength, k);
		int smallArray[] = arr1.length<=arr2.length?arr1:arr2;
		int largeArray[] = arr1.length>arr2.length?arr1:arr2;
		
		while(min<=max) {
			int mid = (min+max)/2;
			
			int leftMax = Math.max(smallArray[mid-1], largeArray[k-mid-1]);
			int rigthMin = Math.max(smallArray[mid], largeArray[mid]);
			
			if(leftMax<rigthMin) {
				
				break;
			}
		}
		

		return 2l;
	}

}
