package org.build_array;

import java.util.Arrays;

public class ArrayDsa {

	public static void main(String[] args) {
		int[] arr= {1,2,3,4};
		int[] addedArr=addingEle(arr);
		printArray(addedArr);
		
		String s= "Geeks";
		System.out.println(reverseString(s));
		
		int[] insertedEnd=insertEleEnd(arr);
		printArray(insertedEnd);
		
		int[] insertedAtAnyPoint=insertAtAnyPosition(arr,2,20);
		printArray(insertedAtAnyPoint);
		
		int[] nArr= {2,1,3,4,5,6,8,10};
		int[] remove = removeEven(nArr);
		printArray(remove);
		
		int[] reversedArr=reverseArray(arr);
		printArray(reversedArr);
		
		int minimunValueOfUnsortedArr=unsortFindMin(nArr);
		System.out.println(minimunValueOfUnsortedArr);
		int[] arra= {2,10,200,199,144,100};
		int[] minValueOfSecThrd=unsortedFindSecThrdMin(arra);
		printArray(minValueOfSecThrd);
		

	}
	static void printArray(int[] array) {
		int n=array.length;
		for (int i : array) {
			System.out.print(i +" ");
		}
		System.out.println();
		
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
	 
	 //Remove even integers 
	 static int[] removeEven(int[] arr) {
		 //We can not change the size of the array so we need to create new array
		 //We need to find the size of new array by
		 	//iterate each elemtn in orignal array and chck the element is odd number or not and count the elements
		 	//then create an array with that size
		 //new iterate original array and check the element is even or not
		 	//if the element is even skip the element using continue
		 	//else add the element to new array
		// return the new array
		 int countOdd=0;
		 for (int i : arr) {
			if(i%2!=0) {
				countOdd++;
			}
		 }
		 int[] oddArr = new int[countOdd];
		 int idx=0;
		 for (int i1=0;i1<arr.length;i1++) {
			
			if(arr[i1]%2!=0) {
				oddArr[idx]=arr[i1];
				idx++;
			}
		}
		
		 
		return oddArr;
		 
	 }
	 
	 //reverse Array
	 static int[] reverseArray(int[] arr) {
		 int n=arr.length;
			/*
			 * for(int i=0;i<n/2;i++) { int temp=arr[i]; arr[i]=arr[n-i-1]; arr[n-1]=temp; }
			 */
		 int start=0;
		 int end=n-1;
		 while(start<end) {
			 int temp=arr[start];
			 arr[start]=arr[end];
			 arr[end]=temp;
			 start++;
			 end--;
		 }
		return arr;
		
		 
	 }
	 
	 //find minimum value in the unsorted array
	 
	 static int unsortFindMin(int[] arr) {
		 int min=Integer.MAX_VALUE;
		 int n=arr.length;
		 int i=0;
		 if(n ==0) {
			 return 0;
		 }
		 while(i<n) {
			 if(arr[i]<min) {
				 min=arr[i];
			 }
			 i++;
		 }
		return min;
		 
	 }
	 
	 //find second and third min value from unsorted array
	 static int[] unsortedFindSecThrdMin(int[] arr) {
		int min=Integer.MAX_VALUE;
		int secMin=Integer.MAX_VALUE;
		int thrdMin=Integer.MAX_VALUE;
		int n=arr.length;
		int i=0;
		if(n==0)return new int[0];
		while(i<n) {
			if(arr[i]<min) {
				thrdMin=secMin;
				secMin=min;
				min=arr[i];
			}
			if((arr[i]!=min) && arr[i]<secMin) {
				thrdMin=secMin;
				secMin=arr[i];
			}
			if((arr[i]!=min) && (arr[i]!=secMin) && arr[i]<thrdMin)thrdMin=arr[i];
			i++;
		}
		if(secMin==Integer.MAX_VALUE)secMin=-1;
		if(thrdMin==Integer.MAX_VALUE)thrdMin=-1;
		
		return new int[] {secMin,thrdMin};
		 
	 }
	 
}
