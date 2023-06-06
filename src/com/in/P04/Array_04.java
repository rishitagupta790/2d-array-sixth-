package com.in.P04;

import java.util.HashMap;
import java.util.Map;

public class Array_04 {
	public static int findMaxLength(int[] nums) {
		int maxLength = 0;
		int count = 0;
		Map<Integer, Integer> countMap = new HashMap<>();
		countMap.put(0, -1);

		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 0) {
				count++;
			} else {
				count--;
			}

			if (countMap.containsKey(count)) {
				int prevIndex = countMap.get(count);
				maxLength = Math.max(maxLength, i - prevIndex);
			} else {
				countMap.put(count, i);
			}
		}

		return maxLength;
	}

	public static void main(String[] args) {
		int[] nums = { 0, 1 };
		int maxLength = findMaxLength(nums);
		System.out.println(maxLength);
	}

}
