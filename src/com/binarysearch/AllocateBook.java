package com.binarysearch;

public class AllocateBook {
	
	 public int books(int[] books, int man) {
		 
		 //if number of man is greater than numeber of books return -1
		 if(man>books.length) {
			 return -1;
		 }
		 //max size of book
		 int min = Integer.MIN_VALUE;
		 
		 //sum of book
		 int max = 0;
		 
		 for(int i=0; i< books.length; i++) {
			 max = max + books[i];
			 if(books[i]>min) {
				 min = books[i];
			 }
		 }
		 while(min <= max ) {
			 int count = 1;
			 int mid = (max+min)/2;
			 int tempSum = 0;
			 for(int i=0; i<books.length; i++) {
				 if(tempSum + books[i]<= mid) {
					 tempSum = tempSum + books[i];
				 }
				 else {
					 count++;
					 tempSum = books[i];
				 }
			 }
			 if(count<=man) {
				 max= mid-1;
			 }
			 else {
				 min = mid+1;
			 }
			 
		 }
		 return min;
	    }

}
