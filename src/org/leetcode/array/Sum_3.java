/*Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]] such that i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0.

Notice that the solution set must not contain duplicate triplets.*/
package org.leetcode.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Sum_3 {

	public static void main(String[] args) {
		int[] nums= {-1,0,1,2,-1,-4};
		List<List<Integer>> sumof3=threeSum(nums);
		printValue(sumof3);

	}
	public static void printValue(List<List<Integer>> sumof3) {
		System.out.println(sumof3);
	}
	public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>>res=new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            if(i>0 && nums[i]==nums[i-1]){
                continue;
            }
            int j=i+1;
            int k=nums.length-1;
            while(j<k){
                int total=nums[i]+nums[j]+nums[k];
                if(total>0){
                    k--;
                }else if(total <0){
                    j++;
                }else{
                    res.add(Arrays.asList(nums[i],nums[j],nums[k]));
                    j++;
                    while(nums[j]==nums[j-1] && j<k){
                        j++;
                    }
                }
            }
        }
        return res;
    }

}
