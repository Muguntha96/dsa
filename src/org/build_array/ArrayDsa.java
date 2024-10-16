package org.build_array;

import java.util.Arrays;

public class ArrayDsa {

	public static void main(String[] args) {
		int[] arr= {1,2,3,4};
		System.out.println(Arrays.toString(addingEle(arr)));
		String s= "Geeks";
		System.out.println(reverseString(s));
		System.out.println(Arrays.toString(insertEleEnd(arr)));
		System.out.println(Arrays.toString(insertAtAnyPosition(arr,2,20)));

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
	 //insert element at end
	 static int[] insertEleEnd(int[] arr) {
		 int[] newArr=new int[arr.length+1];
		 for(int i=0;i<newArr.length;i++) {
			if(i== newArr.length-1) {
				newArr[i]=20;
			}else {
				 newArr[i]=arr[i];
			}
		 }
		 
		 
		return newArr;
		 
	 }
	 //Inserting Elements in an Array at any Position:
	 static int[] insertAtAnyPosition(int[] arr,int pos,int val) {
		 int[] newArr=new int[arr.length+1];
		 for(int i=0;i<newArr.length;i++) {
			 if(i<pos){
					newArr[i]=arr[i];
					}else if(i==pos) {
						newArr[i]=val;
				}else {
					newArr[i]=arr[i-1];
				}
			 }
		return newArr;
		 
	 }
}
