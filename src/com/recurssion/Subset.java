package com.recurssion;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Subset {

	// Recursively calculating subset of array
	public void subset(List<Integer> temp, Integer i, int[] arr) {
		if (i == arr.length) {
			System.out.println(temp);
			return;
		}
		subset(new ArrayList<>(temp), i + 1, arr);
		temp.add(arr[i]);
		subset(new ArrayList<>(temp), i + 1, arr);
	}
	
	// Recursively calculating unique subset of array
	public void unique(List<Integer> temp,Integer i,int[] arr){
        if(i == arr.length){
        	System.out.println(temp);
            return;
        }
        Integer k = i+1;
        while(k<arr.length && arr[k-1]==arr[k]){
            k++;
        }
        unique(new ArrayList<>(temp),k,arr);
        temp.add(arr[i]);
        unique(new ArrayList<>(temp),i+1,arr);
    }

	public static List<List<Integer>> getSubset(List<Integer> arr) {
		if (arr.size() == 1) {
			List<List<Integer>> list = new ArrayList<>();
			List<Integer> blank = new ArrayList<>();
			List<Integer> self = new ArrayList<>();
			self.add(arr.get(0));
			list.add(blank);
			list.add(self);
			return list;
		}
		List<List<Integer>> prev = getSubset(arr.subList(1, arr.size()));
		int prevSize = prev.size();
		for (int i = 0; i < prevSize; i++) {
			List<Integer> subList = prev.get(i);
			List<Integer> temp = new ArrayList<>();
			temp.add(arr.get(0));
			temp.addAll(subList);
			prev.add(temp);
		}
		return prev;

	}

	public static ArrayList<Integer> subsetSums(ArrayList<Integer> arr) {

		List<List<Integer>> subset = getSubset(arr);
		ArrayList<Integer> sum = new ArrayList<Integer>();

		for (int i = 0; i < subset.size(); i++) {
			List<Integer> sub = subset.get(i);
			Integer tem = 0;
			for (int j = 0; j < sub.size(); j++) {
				tem = tem + sub.get(j);
			}
			sum.add(tem);
		}
		Collections.sort(sum);
		return sum;

	}

	private static List<List<Integer>> uniqueSubset(List<Integer> arr, Map<Integer, Integer> map,
			Map<Integer, Integer> z) {

		if (arr.size() == 1) {
			List<List<Integer>> list = new ArrayList<>();
			List<Integer> blank = new ArrayList<>();
			List<Integer> self = new ArrayList<>();
			self.add(arr.get(0));
			z.put(arr.get(0), 0);
			list.add(self);
			list.add(blank);
			return list;
		}
		List<List<Integer>> prev = uniqueSubset(arr.subList(1, arr.size()), map, z);
		int prevSize = prev.size();
		for (int i = 0; i < prevSize; i++) {
			List<Integer> subList = prev.get(i);
			List<Integer> temp = new ArrayList<>();
			if (arr.size() == 0 && z.get(arr.get(0)) != null) {
				continue;
			}
			if (subList.size() == 1 && map.get(arr.get(0)) == null) {
				temp.addAll(subList);
				temp.add(arr.get(0));
				prev.add(temp);
				map.put(arr.get(0), 0);
			} else {
				temp.addAll(subList);
				temp.add(arr.get(0));
				prev.add(temp);
				map.put(arr.get(0), 0);
			}
		}
		return prev;

	}

	public static List<List<Integer>> getuniqueSubset(List<Integer> arr) {
		Map<Integer, Integer> m = new HashMap<>();
		Map<Integer, Integer> z = new HashMap<>();
		return uniqueSubset(arr, m, z);
	}
}
