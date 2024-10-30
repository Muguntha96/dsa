package org.leetcode.array;

import java.util.ArrayList;
import java.util.List;

public class CombinationSum {

	public static void main(String[] args) {
		int[] nums= {2,3,6,7};
		int target=7;
		List<List<Integer>> combine=combinationSum(nums, target);
		
		printValue(combine);
	}
	public static void printValue(List<List<Integer>> combine) {
		for(List<Integer> p:combine) {
			System.out.println(p);
		}
	}
    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        find(res,new ArrayList<>(),candidates,target,0);
        return res;
    }
    public static void find(List<List<Integer>> res,List<Integer> temp,int[] nums,int target,int st){
        if(target<0){
            return;
        }
        if(target==0){
            res.add(new ArrayList<>(temp));
            return;
        }
        for(int i=st;i<nums.length;i++){
            temp.add(nums[i]);
            find(res,temp,nums,target-nums[i],i);
            temp.remove(temp.size()-1);
        }
    }
}
