package leetcode.roman;

import java.util.HashMap;

public class Solution {
	public static void main(String[] args) {
		System.out.println(new Solution().intToRoman(110));
	}

	public String intToRoman(int num) {
		String result = "";
		int count = 0;
		while (num > 0) {
			result = getRoman(num % 10, count) + result;
			count++;
			num = num / 10;

		}
		return result;
	}

	private String getRoman(int i, int count) {
		String[] I = { "I", "X", "C", "M" };
		String[] V = { "V", "L", "D" };
		if (i == 0)
			return "";
		else if (i > 8)
			return getRoman(i - 8, count) + I[count + 1];
		else if (i >= 5)
			return V[count] + getRoman(i - 5, count);
		else if (i > 3)
			return getRoman(i - 3, count) + V[count];
		else
			return getRoman(i - 1, count) + I[count];
	}
}
