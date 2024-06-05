package com.binarysearch;

public class NthRoot {
    public static int getNthRoot(int n, int m) {
   int high = (m/n) +1;
    for(int i=2; i<=high; i++){
        int prod = 1;
        for(int j=0; j<n; j++){
            prod = prod*i;
        }
        if(prod == m){
            return i; 
        }
        if(prod>m){
            return -1;
        }
    }
    return -1;
    }
}
