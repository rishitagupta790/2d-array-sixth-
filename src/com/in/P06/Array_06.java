package com.in.P06;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Array_06 {
	public static int[] findOriginalArray(int[] changed) {
		int n = changed.length;
		if (n % 2 != 0) {
			return new int[0]; // If the changed array length is odd, it cannot be a valid doubled array
		}

		Map<Integer, Integer> countMap = new HashMap<>();
		for (int num : changed) {
			countMap.put(num, countMap.getOrDefault(num, 0) + 1);
		}

		List<Integer> originalList = new ArrayList<>();
		for (Map.Entry<Integer, Integer> entry : countMap.entrySet()) {
			int num = entry.getKey();
			int count = entry.getValue();

			if (count > 0 && countMap.getOrDefault(2 * num, 0) > 0) {
				for (int i = 0; i < count; i++) {
					originalList.add(num);
					countMap.put(num, count - 1);
					countMap.put(2 * num, countMap.get(2 * num) - 1);
				}
			} else if (count > 0) {
				return new int[0]; // If the count of an element or its double value is missing, it is not a valid
									// doubled array
			}
		}

		int[] originalArray = new int[originalList.size()];
		for (int i = 0; i < originalList.size(); i++) {
			originalArray[i] = originalList.get(i);
		}

		return originalArray;
	}

	public static void main(String[] args) {
		int[] changed = { 1, 3, 4, 2, 6, 8 };
		int[] original = findOriginalArray(changed);

		if (original.length == 0) {
			System.out.println("No valid original array found.");
		} else {
			System.out.print("Original array: ");
			for (int num : original) {
				System.out.print(num + " ");
			}
			System.out.println();
		}
	}

}
