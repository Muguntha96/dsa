package org.leetcode.array;

public class FindFirstandLastPositionofElementinSortedArray {

	public static void main(String[] args) {
		int[] nums= {5,7,7,8,8,10};
		int target=8;
		int[] firstAndLastPosition=searchRange(nums, target);
		printValue(firstAndLastPosition);

	}
	public static void printValue(int[] a) {
		for(int i : a) {
			System.out.println(i);
		}
	}
	public static int[] searchRange(int[] nums, int target) {
        int ans1=frontSearch(nums,target);
        int ans2=lastSearch(nums,target);
        int[] res={ans1,ans2};
        return res;
      
    }
    public static int frontSearch(int[] nums,int target){
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                return i;
            }
        }
        return -1;
    }
    public static int lastSearch(int[] nums,int target){
        for(int j=nums.length-1;j>=0;j--){
            if(nums[j]==target){
                return j;
            }
        }
        return -1;
    }

}
