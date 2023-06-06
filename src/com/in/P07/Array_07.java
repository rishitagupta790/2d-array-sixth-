package com.in.P07;

public class Array_07 {
	public static int[][] generateMatrix(int n) {
		int[][] matrix = new int[n][n];
		int top = 0;
		int bottom = n - 1;
		int left = 0;
		int right = n - 1;
		int num = 1;

		while (num <= n * n) {
			// Fill the top row
			for (int i = left; i <= right; i++) {
				matrix[top][i] = num++;
			}
			top++;

			// Fill the right column
			for (int i = top; i <= bottom; i++) {
				matrix[i][right] = num++;
			}
			right--;

			// Fill the bottom row
			for (int i = right; i >= left; i--) {
				matrix[bottom][i] = num++;
			}
			bottom--;

			// Fill the left column
			for (int i = bottom; i >= top; i--) {
				matrix[i][left] = num++;
			}
			left++;
		}

		return matrix;
	}

	public static void main(String[] args) {
		int n = 4;
        int[][] matrix = generateMatrix(n);

        System.out.println("Generated Spiral Matrix:");
        for (int[] row : matrix) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
	}

}
