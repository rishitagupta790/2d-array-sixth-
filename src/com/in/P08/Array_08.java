package com.in.P08;


public class Array_08 {
	public static int[][] multiplySparseMatrices(int[][] mat1, int[][] mat2) {
		int m = mat1.length; // Number of rows in mat1
		int k = mat1[0].length; // Number of columns in mat1
		int n = mat2[0].length; // Number of columns in mat2

		int[][] result = new int[m][n]; // Initialize result matrix with zeros

		for (int i = 0; i < m; i++) { // Iterate over rows of mat1
			for (int j = 0; j < n; j++) { // Iterate over columns of mat2
				for (int p = 0; p < k; p++) { // Iterate over common dimension (columns of mat1 and rows of mat2)
					result[i][j] += mat1[i][p] * mat2[p][j]; // Compute dot product
				}
			}
		}

		return result;
	}

	public static void main(String[] args) {
		int[][] mat1 = { { 1, 0, 0 }, { -1, 0, 3 } };
		int[][] mat2 = { { 7, 0, 0 }, { 0, 0, 0 }, { 0, 0, 1 } };

		int[][] result = multiplySparseMatrices(mat1, mat2);

		// Print the result matrix
		for (int[] row : result) {
			for (int element : row) {
				System.out.print(element + " ");
			}
			System.out.println();
		}
	}

}
