package leetcode.letterphone;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Solution {
	HashMap<Integer, String> map;

	public static void main(String[] args) {
		ArrayList<String> result = (ArrayList<String>) new Solution().letterCombinations("234");
		for (int i = 0; i < result.size(); i++) {
			System.out.println(result.get(i));
		}
	}
	public Solution() {
		map = new HashMap<>();
		map.put(2, "abc");
		map.put(3, "def");
		map.put(4, "ghi");
		map.put(5, "jkl");
		map.put(6, "mno");
		map.put(7, "pqrs");
		map.put(8, "tuv");
		map.put(9, "wxyz");

	}

	public List<String> letterCombinations(String digits) {
		ArrayList<String> result = new ArrayList<>();
		if (digits.equals(""))
			return result;
		String str = map.get(Integer.parseInt(digits.charAt(0) + ""));
		for (int i = 0; i < str.length(); i++) {
			ArrayList<String> temp = (ArrayList<String>) letterCombinations(digits.substring(1));
			if (temp.size() == 0)
				result.add(str.charAt(i) + "");
			else {
				for (int j = 0; j < temp.size(); j++) {
					result.add(str.charAt(i) + temp.get(j));
				}
			}
		}
		return result;
	}
}
