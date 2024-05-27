package com.dyanamicprogramming;

public class MaximumProduct {
	
	
    public int maxProduct(int[] nums) {

        int max = Integer.MIN_VALUE;
        int negativeNumbers = 0;
        int lastNegativeProduct = 1;
        int tempSubarray = 1;

        for(int i=0; i<nums.length;i++){
        	tempSubarray = tempSubarray *nums[i];
        	if(tempSubarray > max) {
        		max= tempSubarray;
        	}
        	
        	if(tempSubarray<0) {
        		negativeNumbers ++;
        		if(negativeNumbers%2 ==0) {
        			tempSubarray = tempSubarray*lastNegativeProduct;
        			if(tempSubarray>max) {
        				max = tempSubarray;
        			}
        		}
        		else {
        			lastNegativeProduct = tempSubarray;
        			tempSubarray =1;
        		}
        	}
        	if(tempSubarray == 0) {
        		tempSubarray = 1;
        		negativeNumbers = 0;
        		lastNegativeProduct =1;
        	}
            
        }
        
        negativeNumbers = 0;
        lastNegativeProduct = 1;
        tempSubarray = 1;
        
        
        for(int i=nums.length-1; i>=0;i--){
        	tempSubarray = tempSubarray *nums[i];
        	if(tempSubarray > max) {
        		max= tempSubarray;
        	}
        	
        	if(tempSubarray<0) {
        		negativeNumbers ++;
        		if(negativeNumbers%2 ==0) {
        			tempSubarray = tempSubarray*lastNegativeProduct;
        			if(tempSubarray>max) {
        				max = tempSubarray;
        			}
        			
        		}
        		else {
        			lastNegativeProduct = tempSubarray;
        			tempSubarray =1;
        		}
        	}
        	if(tempSubarray == 0) {
        		tempSubarray = 1;
        		negativeNumbers = 0;
        		lastNegativeProduct =1;
        	}
            
        }
        return max;
    }

}
