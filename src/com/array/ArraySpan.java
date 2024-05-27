package com.array;

import java.util.Scanner;

public class ArraySpan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array");
		Integer size = Integer.parseInt(sc.nextLine());

		Integer arr[] = new Integer[size];

		for (int i = 0; i < arr.length; i++) {
			System.out.println("Enter Integer value");
			arr[i] = Integer.parseInt(sc.nextLine());
		}

		Integer max = Integer.MIN_VALUE;
		Integer min = Integer.MAX_VALUE;

		for (Integer val : arr) {
			if (val < min) {
				min = val;
			}
			if (val > max) {
				max = val;
			}
		}

		System.out.println("Span is= " + (max - min));
	}

}
