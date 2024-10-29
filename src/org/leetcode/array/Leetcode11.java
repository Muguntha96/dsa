/*You are given an integer array height of length n. There are n vertical lines drawn such that the two endpoints of the ith line are (i, 0) and (i, height[i]).

Find two lines that together with the x-axis form a container, such that the container contains the most water.

Return the maximum amount of water a container can store.

Notice that you may not slant the container.*/

package org.leetcode.array;

public class Leetcode11 {
	public static void main(String[] args) {
		int[] height= {1,8,6,2,5,4,8,3,7};
		int maximumArea=maxArea(height);
		printValue(maximumArea);
		
	}
	public static void printValue(int maxValue) {
		System.out.println(maxValue);
	}
	
	 public static int maxArea(int[] height) {
	        int maxArea=0;
	        int left=0;
	        int right=height.length-1;
	        while(left<right){
	            int current_area=(right-left)*(Math.min(height[left],height[right]));
	            maxArea=Math.max(maxArea,current_area);
	            if(height[left]<height[right]){
	                left++;
	            }else{
	                right--;
	            }
	        }
	        return maxArea;
	    }
}
