package com.recurssion;

import java.util.ArrayList;
import java.util.List;

public class KthPermutation {
	
	private Integer factorial(int n) {
		Integer num = 1;
		for(int i=1;i<=n;i++) {
			num = num*i;
		}
		return num;
	}
	

	
	private String kthpermu(List<Integer> arr, String s, int position) {
		System.out.println("arr"+arr);
		System.out.println("string"+s);
		System.out.println("position"+position);
		int lenth = arr.size();
		int fact = factorial(lenth-1);
		
		if(lenth == 2) {
			if(position ==1) {
				for(int i=0;i<arr.size();i++) {
					s = s+String.valueOf(arr.get(i));
				}
				return s;
			}
			if(position == 2) {
				for(int i=arr.size()-1;i>=0;i--) {
					s = s+String.valueOf(arr.get(i));
				}
				return s;
			}
		}
		
		int q = position/fact;
		int r = position%fact;
		 
		
		
		
		if(r == 0) {
			s = s+String.valueOf(arr.get(q-1));
			arr.remove(q-1);
			for(int i=arr.size()-1;i>=0;i--) {
				s = s+String.valueOf(arr.get(i));
			}
			return s;
		}
		s = s+String.valueOf(arr.get(q));
		arr.remove(q);
		
		return kthpermu(arr,s,r);
		

	
	}
	
	public String getPermutation(Integer n, Integer position) {
		List<Integer> arr = new ArrayList<>();
		for(int i=1;i<=n;i++) {
			arr.add(i);
		}
		return kthpermu(arr,"",position);
	}
	
	
}
