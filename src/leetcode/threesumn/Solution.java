package leetcode.threesumn;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {

	public int threeSumClosest(int[] nums, int target) {
		int mindiff = Integer.MAX_VALUE;
		int sumTotal = 0;

		Arrays.sort(nums);
		for (int i = 0; i < nums.length - 2; i++) {
			int l = i + 1;
			int r = nums.length - 1;
			while (l < r) {
				int sum = nums[i] + nums[l] + nums[r];
				if (mindiff > Math.abs(sum - target)) {
					mindiff = Math.abs(sum - target);
					sumTotal = sum;
				} 
				if (sum < target)
					l++;
				else if (sum > target)
					r--;

			}
		}
		return sumTotal;

	}
}
