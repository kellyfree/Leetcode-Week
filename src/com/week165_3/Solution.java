package com.week165_3;

public class Solution {
	public static void main(String[] args) {
		Solution so = new Solution();
		int[][] matrix = { { 0, 1, 1, 1 }, { 1, 1, 1, 1 }, { 0, 1, 1, 1 } };
		System.out.println(so.countSquares(matrix));
	}

	public int countSquares(int[][] matrix) {
		int m = matrix.length;
		int n = m == 0 ? 0 : matrix[0].length;
		int res = 0;
		int[][] ans = new int[m + 1][n + 1];
		for (int i = 1; i <= m; i++) {
			for (int j = 1; j <= n; j++) {
				if (matrix[i - 1][j - 1] == 1) {
					ans[i][j] = Math.min(Math.min(ans[i - 1][j], ans[i][j - 1]), ans[i - 1][j - 1]) + 1;
					res += ans[i][j];
				}
			}
		}

		return res;
	}
}
