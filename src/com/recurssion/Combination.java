package com.recurssion;

import java.util.ArrayList;
import java.util.List;

public class Combination {
	
	
	int arr[];
	public Combination(int arr[]) {
		this.arr = arr;
	}
	
	
	public List<List<Integer>> getCombination2(List<List<Integer>>badaList,List<Integer>chotaList, int indx, int sum, int target){
        if(sum  == target){
        	badaList.add(chotaList);
            return badaList;
        }
        if(sum > target || indx == arr.length){
            return badaList;
        }
        getCombination2(badaList,new ArrayList<>(chotaList),indx+1, sum, target);
        chotaList.add(arr[indx]);
        return getCombination2(badaList,new ArrayList<>(chotaList), indx, sum + arr[indx], target);
	}

}
