package com.sorting;

public class Sort {

	private void Swap(int Arr[], int i, int j) {
		int temp = Arr[j];
		Arr[j] = Arr[i];
		Arr[i] = temp;
	}

	public void Bubblesort(int Arr[]) {
		for (int i = 0; i < Arr.length; i++) {
			for (int j = 0; j < Arr.length - i - 1; j++) {
				if (Arr[j] > Arr[j + 1]) {
					Swap(Arr, j, j + 1);
				}
			}
		}
	}

	public int[] mergerSortedArray(int arr1[], int arr2[]) {
		int temp[] = new int[arr1.length + arr2.length];
		int i = 0;
		int j = 0;
		int k = 0;

		while (i < arr1.length && j < arr2.length) {
			if (arr1[i] < arr2[j]) {
				temp[k] = arr1[i];
				i++;
			} else {
				temp[k] = arr2[j];
				j++;
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
		return temp;
	}

	
	public int[] Mergesort(int arr[],int low, int high) {
		if(low == high) {
			int[] t = new int[1];
			t[0] = arr[low];
			return t;
		}
		
		int mid = (high+low)/2;
		int[] fh = Mergesort(arr, low, mid);
		int[] sh  = Mergesort(arr, mid+1, high);
		
		return mergerSortedArray(fh, sh);
		

	}

}
