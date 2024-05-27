package com.recurssion;

import java.util.ArrayList;
import java.util.List;

public class Permutation {
	
	List<List<Integer>> getPermutation(List<List<Integer>> badaList,List<Integer> tempList , int[] arr , int indx){
		if(indx == arr.length) {
			badaList.add(new ArrayList<>(tempList));
			return badaList;
		}
		
		for(int i=0; i<arr.length;i++ ) {
			if(tempList.get(i) == null) {
				tempList.set(i, arr[indx]);
				getPermutation(badaList,tempList ,  arr ,indx+1);
				tempList.set(i, null);
			}
		}
		
		return badaList;
	
	}
	
	public List<List<Integer>> permute(int[] nums){
		List<List<Integer>> badaList = new ArrayList<>();
		List<Integer> tempList=new ArrayList<>();
		for(int i=0;i<nums.length;i++) {
			tempList.add(null);
		}
		getPermutation(badaList,tempList,nums,0);
		return badaList;
		
	}

}
