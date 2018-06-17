package leetcode.Equal01;

import java.util.HashMap;
import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for (int j = 0; j < t; j++) {
			String str = sc.next();
			int result = 0;
			int count = 0;
			HashMap<Integer, Integer> map = new HashMap<>();
			map.put(0, -1);
			for (int i = 0; i < str.length(); i++) {
				if (Integer.parseInt(str.charAt(i)+"") == 0)
					count--;
				else
					count++;
				if (map.containsKey(count)) {
					int lastIndex = map.get(count);
					int temp = i - lastIndex;
					result = Math.max(result, temp);
				} else {
					map.put(count, i);
				}
			}
			System.out.println(result);
		}
	}
}
	