package com.array;

import java.util.ArrayList;
import java.util.List;

public class FourSum {

	public void getSum(int[] list,List<Integer> chotaList, int indx, int target, List<List<Integer>> res) {
		if(indx == list.length || chotaList.size() == 4) {
			int sum = chotaList.stream().mapToInt(Integer::intValue).sum();
			if(target == sum && chotaList.size() == 4) {
				System.out.println(chotaList);
				res.add(new ArrayList<Integer>(chotaList));
			}
			return;
		}
		int i= indx;

		List<Integer> temp  =  new ArrayList<>(chotaList);
		getSum(list,temp , i+1, target,res) ;
		temp.add(list[i]);
		getSum(list,temp , i+1, target,res) ;
	}
}
