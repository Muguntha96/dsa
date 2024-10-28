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
		
		int secondMaxValueofarr=secodnMax(arra);
		System.out.println(secondMaxValueofarr);
		
		int[] zArr= {0,1,0,2,3,0,4,0};
		int[] movedZerosArr=moveZeros(zArr);
		System.out.println(Arrays.toString(movedZerosArr));
		
		int[] yArr= {10,2,34,54,12,3};
		int[] sortedAsc=desc(yArr);
		printArray(sortedAsc);

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
		if(n==0) {
			throw new IllegalArgumentException("Invalid Input");
		}
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
			if((arr[i]!=min) && (arr[i]!=secMin) && arr[i]<thrdMin) thrdMin=arr[i];
			i++;
		}
		if(secMin==Integer.MAX_VALUE)secMin=-1;
		if(thrdMin==Integer.MAX_VALUE)thrdMin=-1;
		
		return new int[] {secMin,thrdMin};
		 
	 }
	 
	 //second Max in array
	 static int secodnMax(int[] arr) {
		 int max=Integer.MIN_VALUE;
		 int secMax=Integer.MIN_VALUE;
		 int n=arr.length;
		 if(arr==null || n==0) {
			 throw new IllegalArgumentException("Invalid Input");
		 }
		 for(int i=0;i<n;i++) {
			 if(arr[i]>max) {
				 secMax=max;
				 max=arr[i];
			 }else if(arr[i]!=max && arr[i]>secMax) {
				 secMax=arr[i];
			 }
			 
		 }
		 
		 
		 return secMax;
		 
	 }
	 
	 //move 0s to end of the array
	 
	 static int[] moveZeros(int[] arr) {
		int n=arr.length;
		int i=0,j=0;
		while(i<n) {
			if(arr[i]!=0 ) {
				if(i!=j) {
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
				j++;
			}
			
				
						i++;
		}
		
		 
		return arr;
		 
	 }
	 //sort array ass to descending
	 static int[] desc(int[] a) {
		 //Bubble Sort (inefficient)
			/*
			 * if(a.length<=1) { return a; } for(int i=0;i<a.length-1;i++) { for(int
			 * j=0;j<a.length-1-i;j++) { if(a[j]>a[j+1]) { int temp=a[j]; a[j]=a[j+1];
			 * a[j+1]=temp; } } }
			 * 
			 * 
			 * return a;
			 */
		 if(a.length<=1) {
			 return a;
		 }
		 int seperate=a.length/2;
		 int[] left=Arrays.copyOfRange(a, 0, seperate);
		 int[] right=Arrays.copyOfRange(a, seperate, a.length);
		 
		return merge(sortAsc(left),sortAsc(right));
			 
		 }
	private static int[] merge(int[] left, int[] right) {
		int[] sortedArr=new int[left.length +right.length];
		int i=0,j=0,k=0;
		while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
                sortedArr[k++] = left[i++];
            } else {
                sortedArr[k++] = right[j++];
            }
        }
		while(i<left.length) {
			sortedArr[k++]=left[i++];
			
		}
		while(j<right.length) {
			sortedArr[k++] = right[j++];
		}
		return sortedArr;
	}
	 
	 
}
