package com.week_165_1;

public class Solution {
	public static void main(String[] args) {
		// int[][] moves = { { 0, 0 }, { 2, 0 }, { 1, 1 }, { 2, 1 }, { 2, 2 } };
		int[][] moves = { { 0, 0 }, { 1, 1 }, { 2, 0 }, { 1, 0 }, { 1, 2 }, { 2, 1 }, { 0, 1 }, { 0, 2 }, { 2, 2 } };
		Solution so = new Solution();
		System.out.println(so.tictactoe(moves));
	}

	private boolean isWin(int[][] table, int x, int y) {
		boolean win = false;
		//
		if (table[0][y] == table[1][y] && table[1][y] == table[2][y] && table[1][y] != 0)
			return true;
		if (table[x][0] == table[x][1] && table[x][1] == table[x][2] && table[x][1] != 0)
			return true;
		if (table[0][0] == table[1][1] && table[2][2] == table[1][1] && table[1][1] != 0)
			return true;
		if (table[0][2] == table[1][1] && table[2][0] == table[1][1] && table[1][1] != 0)
			return true;
		return win;
	}

	public String tictactoe(int[][] moves) {
		int[][] table = new int[3][3];
		boolean XA = true;
		for (int[] move : moves) {
			if (XA) {
				table[move[0]][move[1]] = 1;// 判断是X
				if (isWin(table, move[0], move[1])) {
					return "A";
				}
				XA = false;
			} else {
				table[move[0]][move[1]] = 2;// 判断是O
				if (isWin(table, move[0], move[1])) {
					return "B";
				}
				XA = true;
			}
		}
		boolean pending = moves.length == 9 ? false : true;// ����Ƿ�Ϳ��
		if (pending) {
			return "Pending";
		} else {
			return "Draw";
		}
	}
}
