package com.recurssion;

import java.util.ArrayList;
import java.util.List;

public class PalindromePartition {
	

	
    private boolean isPalindrome(String str){
        int i = 0;
        int j = str.length() -1;
        while(i<j){
            if(str.charAt(i)!=str.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
    
    public List<List<String>> palindrome(String str,List<String> chotaList,List<List<String>> badaList ){
        if(str.length() == 0){
        	badaList.add(chotaList);
        }

        for(int i=1; i<str.length()+1;i++){
            if(isPalindrome(str.substring(0,i))){
               List<String> temp = new ArrayList<>(chotaList);
                temp.add(str.substring(0,i));
               palindrome(str.substring(i,str.length()),temp,badaList);
            }
        }
        return badaList;
    }

}
