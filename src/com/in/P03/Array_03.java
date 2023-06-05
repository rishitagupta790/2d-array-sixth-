package com.in.P03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Array_03 {
	public static void nextPermutation(int[] nums) {
		int i = nums.length - 2;

		// Find the first pair of adjacent elements where nums[i] < nums[i+1]
		while (i >= 0 && nums[i] >= nums[i + 1]) {
			i--;
		}

		if (i >= 0) {
			int j = nums.length - 1;

			// Find the largest index j such that nums[j] > nums[i]
			while (j >= 0 && nums[j] <= nums[i]) {
				j--;
			}

			swap(nums, i, j);
		}

		// Reverse the subarray starting from index i+1
		reverse(nums, i + 1);
	}

	private static void swap(int[] nums, int i, int j) {
		int temp = nums[i];
		nums[i] = nums[j];
		nums[j] = temp;
	}

	private static void reverse(int[] nums, int start) {
		int i = start;
		int j = nums.length - 1;
		while (i < j) {
			swap(nums, i, j);
			i++;
			j--;
		}
	}

	public static void main(String[] args) {
		int[] nums = { 1, 2, 3 };
		nextPermutation(nums);
		System.out.println("Next Permutation: " + Arrays.toString(nums));
	}

}
