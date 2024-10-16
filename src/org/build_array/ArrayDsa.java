package org.build_array;

import java.util.Arrays;

public class ArrayDsa {

	public static void main(String[] args) {
		int[] arr= {1,2,3,4};
		System.out.println(Arrays.toString(addingEle(arr)));
		String s= "Geeks";
		System.out.println(reverseString(s));

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
	//Reverse Strings
	 public static String reverseString(String s) {
//		StringBuilder sb=new StringBuilder(s);
//		sb.reverse();
		char[] sArr=s.toCharArray();
		for(int i=0;i<sArr.length/2;i++) {
			char temp=sArr[i];
			sArr[i]=sArr[sArr.length-i-1];
			sArr[sArr.length-i-1]=temp;
		}
		
		String newString=new String(sArr);
		return newString;
	       
	    }

}
