package com.week_165_2;

import java.util.ArrayList;
import java.util.List;

public class Solution {
	public static void main(String[] args) {
		int tomatoSlices = 4, cheeseSlices = 17;
		Solution so = new Solution();
		System.out.println(so.numOfBurgers(tomatoSlices, cheeseSlices));
	}

	public List<Integer> numOfBurgers(int tomatoSlices, int cheeseSlices) {
		List<Integer> ans = new ArrayList<>();
		int n = 0, m = 0;
		if ((tomatoSlices - 2 * cheeseSlices) % 2 == 0) {
			n = (tomatoSlices - 2 * cheeseSlices) / 2;
			m = cheeseSlices - n;
			if (n >= 0 && m >= 0) {
				ans.add(n);
				ans.add(m);
			}
		}
		return ans;
	}
}
