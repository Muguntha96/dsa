/*Given an integer array nums of length n and an integer target, find three integers in nums such that the sum is closest to target.

Return the sum of the three integers.

You may assume that each input would have exactly one solution.

 

Example 1:

Input: nums = [-1,2,1,-4], target = 1
Output: 2
Explanation: The sum that is closest to the target is 2. (-1 + 2 + 1 = 2).

Example 2:

Input: nums = [0,0,0], target = 1
Output: 0
Explanation: The sum that is closest to the target is 0. (0 + 0 + 0 = 0).*/

package org.leetcode.array;

import java.util.Arrays;

public class ThreeSumClosest {

	public static void main(String[] args) {
		int[] nums= {-1,2,1,-4};
		int target=1;
		int sumClosest=threeSumClosest(nums,target);
		printValue(sumClosest);

	}
	public static void printValue(int sum) {
		System.out.println(sum);
	}
    public static int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int closestSum=Integer.MAX_VALUE;
        for(int i=0;i<nums.length-2;i++){
            int left =i+1;
            int right=nums.length-1;
            while(left<right){
                int currentSum=nums[i]+nums[left]+nums[right];
                if(Math.abs(currentSum-target)<Math.abs(closestSum-target))
                {
                closestSum=currentSum;
                }
            if(currentSum<target){
                left++;
            }else if(currentSum>target){
                right--;
            }else{
                return currentSum;
            }
            }
        
        }
        return closestSum;

    }
}


