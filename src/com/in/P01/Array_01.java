package com.in.P01;

import java.util.ArrayList;
import java.util.List;

public class Array_01 {
	public static int[] findPermutation(String s) {
		int n = s.length();
		int[] perm = new int[n + 1];
		List<Integer> remaining = new ArrayList<>();

		for (int i = 0; i <= n; i++) {
			remaining.add(i);
		}

		for (int i = 0; i < n; i++) {
			if (s.charAt(i) == 'I') {
				perm[i] = remaining.remove(0);
			} else {
				perm[i] = remaining.remove(remaining.size() - 1);
			}
		}

		perm[n] = remaining.get(0);

		return perm;
	}

	public static void main(String[] args) {
		  String s = "IDID";

	        int[] perm = findPermutation(s);
	        for (int num : perm) {
	            System.out.print(num + " ");
	        }
	}

}
