package com.array;

import java.util.ArrayList;
import java.util.List;

public class FourSum {

	public void getSum(int[] list,List<Integer> chotaList, int indx, int target, List<List<Integer>> res,int sum) {
	
		if(indx == list.length || chotaList.size() == 4 || sum>target) {
			if(target == sum && chotaList.size() == 4) {
				System.out.println(chotaList);
				res.add(new ArrayList<Integer>(chotaList));
			}
			return;
		}
		if(sum + list[indx]>target){
			return;
		}
		int i= indx;
		while(i<list.length-1 && list[i] == list[i+1]) {
			i++;
		}
		List<Integer> temp  =  new ArrayList<>(chotaList);
		getSum(list,temp , i+1, target,res,sum) ;
		temp.add(list[indx]);
		getSum(list,temp , indx+1, target,res,sum+list[indx]) ;
	}
}
