package leetcode.raintrap;

public class Solution {
	public int trap(int[] height) {
		int result =0;
		if(height.length==0)
			return 0;
		int[] maxLeft = new  int[height.length];
		int[] maxRight = new int[height.length];
		
		maxLeft[0] =height[0];
		maxRight[height.length-1] =height[height.length-1];
		
		for (int i = 1; i < maxRight.length; i++) {
			maxLeft[i] = Math.max(maxLeft[i-1],height[i]);
		}
		
		for (int i = maxRight.length-2; i >=0; i--) {
			maxRight[i] = Math.max(maxRight[i+1],height[i]);			
		}
		
		for (int i = 0; i < maxRight.length; i++) {
			result+= Math.min(maxLeft[i], maxRight[i])-height[i];
		}
		return result;
	}
}
