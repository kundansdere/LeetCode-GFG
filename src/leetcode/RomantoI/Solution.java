package leetcode.RomantoI;

import java.util.HashMap;

public class Solution {
	public int romanToInt(String s) {
		int result = 0;
		HashMap<Character, Integer> map = new HashMap<>();
		map.put('I', 1);
		map.put('V', 5);
		map.put('X', 10);
		map.put('L', 50);
		map.put('C', 100);
		map.put('D', 500);
		map.put('M', 1000);

		while (!s.equals("")) {
			char ch = s.charAt(0);
			if (s.length()>=2 && map.get(ch) < map.get(s.charAt(1)))
				result -= map.get(ch);
			else
				result += map.get(ch);		

			s = s.substring(1);
		}
		return result;

	}
}
