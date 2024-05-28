package com.array;

import java.util.Arrays;

public class ReversePair {
		int count =0;
		  public int reversePairs(int[] nums) {
			  Mergesort(nums,0,nums.length-1);
			  return count;
		    }
		
	    public  int[] Mergesort(int arr[],int low, int high) {
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
		
	   public  int[] mergerSortedArray(int arr1[], int arr2[]) {
		   int l = 0 ;
		   int r = 0 ;
		   int count1 =0;
		   int  max=0;
		   while(l<arr1.length) {	  
			   int count2 = 0;
			   while(r<arr2.length) {
				   if ((long) arr1[l] > (long) arr2[r] * 2) {
					   count2++;
					   r++;
				   }
				   else {
					   break;
				   }
			   }
			   count1 = count1 + (max+count2);
			   max = max + count2;
			   l++;
		   }
		   count = count + count1;
		   int temp[] = new int[arr1.length + arr2.length];
			int i = 0;
			int j = 0;
			int k = 0;
			while (i < arr1.length && j < arr2.length) {
				if (arr1[i] > arr2[j]) {
					temp[k] = arr2[j];
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
			return temp;
		}
}
