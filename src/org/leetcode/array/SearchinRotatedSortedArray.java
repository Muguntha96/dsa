package org.leetcode.array;

public class SearchinRotatedSortedArray {

	public static void main(String[] args) {
		int[] nums= {4,5,6,7,0,1,2};
		int target=0;
		int searchRotatedArr=search(nums,target);
		printValue(searchRotatedArr);
		

	}
	public static void printValue(int a) {
		System.out.println(a);
	}
	public static int search(int[] nums, int target) {
        int start=0;
        int end=nums.length-1;
        while(start<=end){
            int middle=(start+end)/2;
            if(nums[middle]==target){
                return middle;
            }else if(nums[middle]>=nums[start]){
                if(nums[start]<=target && target <=nums[middle]){
                    end=middle-1;
                }else{
                    start=middle+1;
                }
            }else{
                if(nums[middle]<=target && target <=nums[end]){
                    start=middle+1;
                }else{
                    end=middle-1;
                }
            }
        }
        return -1;
    }
}
