package leetcode.parenthesis;

import java.util.ArrayList;
import java.util.List;

public class GenrateParenthesis {
	public static void main(String[] args) {
		System.out.println(new Solution().generateParenthesis(3));
	}
}

class Solution {

	public List<String> generateParenthesis(int n) {
		return generateParenthesis(n, 0, 0, "", new ArrayList<>());
	}

	public List<String> generateParenthesis(int n, int openCount, int closeCount, String expresseion,
			List<String> list) {
		if (openCount > n || closeCount > n)
			return list;
		if (openCount == n && closeCount == n) {
			list.add(expresseion);
			return list;
		}

		if (openCount > closeCount)
			generateParenthesis(n, openCount, closeCount + 1, expresseion + ")", list);

		generateParenthesis(n, openCount + 1, closeCount, expresseion + "(", list);

		return list;

	}
}
