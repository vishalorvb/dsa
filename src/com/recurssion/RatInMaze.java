package com.recurssion;

import java.util.List;

public class RatInMaze {
	
	public List<String> getPath(List<String> badaList, String psf, int[][] arr,int row,int col){
		
		if(row == arr.length && col == arr[0].length) {
			badaList.add(psf);
		}
		
		if( col <= arr[0].length -1 ) {
			getPath(badaList,psf+"R",arr,row,col+1);
		}
		if(row <=  arr.length -1) {
			getPath(badaList,psf+"D",arr,row+1,col);
		}
		
		return badaList;
	}
	
	public List<String> getPathZeroOne(List<String> badaList, String psf, int[][] arr,int row,int col){
		
		if(row == arr.length -1 && col == arr[0].length -1) {
			badaList.add(psf);
		}
		
		if( col +1 < arr[0].length  && arr[row][col+1] == 1  ) {
			getPathZeroOne(badaList,psf+"R",arr,row,col+1);
		}
		if(row + 1<  arr.length  && arr[row+1][col] == 1 ) {
			getPathZeroOne(badaList,psf+"D",arr,row+1,col);
		}
		
		return badaList;
	}
	
}
