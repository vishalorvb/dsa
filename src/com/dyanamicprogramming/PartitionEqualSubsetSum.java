package com.dyanamicprogramming;

import java.util.Arrays;

public class PartitionEqualSubsetSum {

	private boolean getSubsequence(int[] arr, int target) {

		boolean dp[][] = new boolean[arr.length + 1][target + 1];
		for (int i = 0; i < dp.length; i++) {
			dp[i][0] = true;
		}
		for (int i = 1; i < dp[0].length; i++) {
			dp[0][i] = false;
		}
		for (int i = 1; i < dp.length; i++) {
			for (int j = 1; j < dp[0].length; j++) {
				if (j < arr[i - 1]) {
					dp[i][j] = dp[i - 1][j];
					continue;
				}
				dp[i][j] = dp[i - 1][j - arr[i - 1]] || dp[i - 1][j];
			}
		}

		return dp[arr.length][target];
	}

	public boolean canPartition(int[] nums) {

		int sum = Arrays.stream(nums).sum();
		if (sum % 2 != 0) {
			return false;
		}
		return getSubsequence(nums, sum / 2);
	}
}
