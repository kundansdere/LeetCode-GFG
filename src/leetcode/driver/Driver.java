package leetcode.driver;

import leetcode.threeSum.*;
public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] heights = {};
//		System.out.println(new Solution().maxArea(heights));;
//		System.out.println(new Solution().romanToInt("MCMXCIV"));
//		String [] str = {"flower","flow","flight"};
//		System.out.println(new Solution().longestCommonPrefix(str));
		int [] nums = {-1,0,1,2,-1,-4};
		System.out.println(new Solution().threeSum(nums));	
	}

}
