package com.multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MultiThreading {
	
	public static void main(String[] args) {
		System.out.println("hello");
		
		ExecutorService ex = Executors.newFixedThreadPool(3);
		for(int i=0;i<20;i++) {
			ex.submit(()->System.out.println("Hello"));
		}
	}

}
