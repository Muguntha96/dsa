package org.build_array;

import java.util.Arrays;

public class ArrayDsa {

	public static void main(String[] args) {
		int[] arr= {1,2,3,4};
		System.out.println(Arrays.toString(addingEle(arr)));;

	}
	
	static int[] addingEle(int[] arr) {
		int[] newArr=new int[arr.length+1];
		for(int i=0;i<newArr.length;i++) {
			if(i<3) {
				newArr[i]=arr[i];
			}else if(i==3) {
				newArr[i]=10;
			}else {
				newArr[i]=arr[i-1];
			}
		}
		
		return newArr;
		
	}

}
