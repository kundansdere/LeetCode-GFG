package leetcode.threeSum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

public class Solution {

	public List<List<Integer>> threeSum(int[] nums) {
		HashMap<Integer, ArrayList<Integer>> map = new HashMap<>();
		List<List<Integer>> list = new ArrayList<List<Integer>>();
		Arrays.sort(nums);
		for (int i = 0; i < nums.length - 1; i++) {
			for (int j = i+1; j < nums.length; j++) {
				ArrayList<Integer> set = new ArrayList<>();
				set.add(i);
				set.add(j);
				if (map.containsKey(nums[i] + nums[j])) {
					ArrayList<Integer> temp = map.get(nums[i] + nums[j]);
					if (!temp.equals(set)) {
						map.put(nums[i] + nums[j], set);
					}
				}else{
					map.put(nums[i] + nums[j], set);		
				}
			}
		}
		for (int i = 0; i < nums.length; i++) {
			if (map.containsKey(-1 * nums[i])) {
				ArrayList<Integer> temp = map.get(-1 * nums[i]);
				if (!temp.contains(i)) {
					temp.add(i);
					list.add(temp);
				}
			}
		}
		return list;
	}
	/*
	 * public List<List<Integer>> threeSum(int[] nums) { List<List<Integer>>
	 * list = new ArrayList<List<Integer>>(); Arrays.sort(nums); for (int i = 0;
	 * i < nums.length - 2; i++) { int l = i + 1; int r = nums.length - 1; while
	 * (l < r) { int sum = nums[i] + nums[l] + nums[r]; if (sum == 0) {
	 * ArrayList<Integer> temp = new ArrayList<>(); temp.add(nums[i]);
	 * temp.add(nums[l]); temp.add(nums[r]); if (!list.contains(temp))
	 * list.add(temp); l++; r--; } else if (sum < 0) l++; else if (sum > 0) r--;
	 * 
	 * } } return list;
	 * 
	 * }
	 */
}
