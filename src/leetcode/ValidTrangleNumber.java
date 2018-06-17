package leetcode;

import java.util.Arrays;

public class ValidTrangleNumber {
	public static void main(String[] args) {
		int nums[] = { 2, 2, 3, 4 };
		System.out.println(new Solution().triangleNumber(nums));
	}

}

class Solution {
	public int triangleNumber(int[] nums) {
		Arrays.sort(nums);
		int count = 0;
		for (int i = 0; i < nums.length - 2; i++) {
			int l = i + 1;
			int r = nums.length - 1;
			while (l < r) {
				if (nums[i] > Math.abs(nums[l] - nums[r]) && nums[i] < Math.abs(nums[l] + nums[r])) {
					count++;
				}
			}

		}
		return count;
	}
}
