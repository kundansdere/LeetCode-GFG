package leetcode.watercontainer;

public class Solution {
	public int maxArea(int[] height) {
		int area = 0;
		int max_area = 0;
		int i = 0, j = height.length - 1;
		while (i < j) {
			max_area = (j - i) * Math.min(height[i], height[j]);
			if(max_area>area)
				area = max_area;
			
			if(height[i]<height[j])
				i++;
			else
				j--;
		}

		return area;
	}
}
