/*A permutation of an array of integers is an arrangement of its members into a sequence or linear order.

    For example, for arr = [1,2,3], the following are all the permutations of arr: [1,2,3], [1,3,2], [2, 1, 3], [2, 3, 1], [3,1,2], [3,2,1].

The next permutation of an array of integers is the next lexicographically greater permutation of its integer. More formally, if all the permutations of the array are sorted in one container according to their lexicographical order, then the next permutation of that array is the permutation that follows it in the sorted container. If such arrangement is not possible, the array must be rearranged as the lowest possible order (i.e., sorted in ascending order).

    For example, the next permutation of arr = [1,2,3] is [1,3,2].
    Similarly, the next permutation of arr = [2,3,1] is [3,1,2].
    While the next permutation of arr = [3,2,1] is [1,2,3] because [3,2,1] does not have a lexicographical larger rearrangement.

Given an array of integers nums, find the next permutation of nums.

The replacement must be in place and use only constant extra memory.

 

Example 1:

Input: nums = [1,2,3]
Output: [1,3,2]

Example 2:

Input: nums = [3,2,1]
Output: [1,2,3]

Example 3:

Input: nums = [1,1,5]
Output: [1,5,1]
*/
package org.leetcode.array;

public class NextPermutation {

	public static void main(String[] args) {
		int[] nums= {1,2,3};
		int[] perm=nextPermutation(nums);
		printValue(perm);

	}
	public static void printValue(int[] perm) {
		for(int p:perm) {
			System.out.println(p);
		}
	}
	 public static int[] nextPermutation(int[] nums) {
	        int i=nums.length-2;
	        while(i>=0 &&nums[i]>=nums[i+1]){
	            i--;
	        }
	        if(i!=-1){
	            int j=nums.length-1;
	            while(j>=0&& nums[i]>=nums[j]){
	                j--;
	            }
	            swap(nums,i,j);
	        }
	        int start=i+1;
	        int end=nums.length-1;
	        while(start<end){
	            swap(nums,start,end);
	            end--;
	            start++;

	        }
			return nums;
	    }
	    public static void swap(int[]nums,int a,int b){
	        int temp=nums[a];
	        nums[a]=nums[b];
	        nums[b]=temp;
	    }

}
