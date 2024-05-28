package com.array;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstring {
	
	public int	lengthOfLongestSubstring(String s) {
        int count =0;
        int l=0;
        int r=0;
        Map<Character,Integer> map = new HashMap<>();
        
        while(r<s.length()) {
        	
        	if(map.containsKey(s.charAt(r))) {
        		
        		while(s.charAt(l)!=s.charAt(r)) {
        			map.remove(s.charAt(l));
        			l++;
        		}
        		l++;
        	}
        	else {
        		map.put(s.charAt(r),1);
        		int temp = r-l+1;
        		if(temp>count) {
        			count = temp;
        		}
        	}
        	r++;
        }
        System.out.println(count);
        
        return count;
    }

}
