package com.in.P05;

import java.util.Arrays;

public class Array_05 {
	public static int minProductSum(int[] nums1, int[] nums2) {
		Arrays.sort(nums1);
		Arrays.sort(nums2);

		int n = nums1.length;
		int productSum = 0;

		for (int i = 0; i < n; i++) {
			productSum += nums1[i] * nums2[n - 1 - i];
		}

		return productSum;
	}

	public static void main(String[] args) {
		int[] nums1 = { 5, 3, 4, 2 };
		int[] nums2 = { 4, 2, 2, 5 };
		int minProductSum = minProductSum(nums1, nums2);
		System.out.println(minProductSum);
	}

}
