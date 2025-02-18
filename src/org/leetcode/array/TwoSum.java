/*Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.

 

Example 1:

Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].

Example 2:

Input: nums = [3,2,4], target = 6
Output: [1,2]

Example 3:

Input: nums = [3,3], target = 6
Output: [0,1]*/

package org.leetcode.array;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
	public static void main(String[] args) {
		int target=6;
		int[] nums= {3,2,4};
		int[] twoSumPrint=twoSum(nums,target);
		printArray(twoSumPrint);
		
		
	}
	
	public static void printArray(int[]nums) {
		System.out.println(Arrays.toString(nums));
//		System.out.println();
		
	}
	public static int[] twoSum(int[] nums,int target) {
		HashMap<Integer, Integer> hashMap=new HashMap<Integer, Integer>();
		for(int i=0;i<nums.length;i++) {
			int value=target-nums[i];
			if(hashMap.containsKey(value)) {
				return new int[] {hashMap.get(value),i};
			}else {
				hashMap.put(nums[i], i);
			}
		}
		return new int[0];
		
	}

}
