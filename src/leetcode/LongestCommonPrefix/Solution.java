package leetcode.LongestCommonPrefix;

import java.util.ArrayList;
import java.util.HashMap;

public class Solution {

	public String longestCommonPrefix(String[] strs) {
		if (strs.length == 0)
			return "";
		String prefix = strs[0];
		for (int i = 1; i < strs.length; i++) {
			int j = 0;
			while (j < strs[i].length() && j < prefix.length() && prefix.charAt(j) == strs[i].charAt(j)) {
				j++;
			}
			prefix = strs[i].substring(0, j);
		}
		return prefix;
	}
}
