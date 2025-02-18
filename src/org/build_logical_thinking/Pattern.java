package org.build_logical_thinking;

public class Pattern {

	
	public static void main(String[] args) {
		nForest(5);
		pattern2(5);
		pattern3(5);
		pattern4(5);
		pattern5(5);
		pattern6(5);
		pattern7(4);
		pattern8(4);
		pattern9(4);
		pattern10(3);
		pattern11(4);
		
		
		
	}
//Exercise:1 Sam is making a forest visualizer. An N-dimensional forest is represented by the pattern of size NxN filled with ‘*’.

//For every value of ‘N’, help sam to print the corresponding N-dimensional forest.
	static void nForest(int n) {
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				System.out.print("# ");
			}
			System.out.println();
		}
	}

//Exercise :2 Sam is making a forest visualizer. An N-dimensional forest is represented by the pattern of size NxN filled with ‘*’.
//An N/2-dimensional forest is represented by the lower triangle of the pattern filled with ‘*’.
//For every value of ‘N’, help sam to print the corresponding N/2-dimensional forest.
	static void pattern2(int n) {
		for(int i=0;i<n;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
//Exercise:3 Sam is making a Triangular painting for a maths project.
//An N-dimensional Triangle is represented by the lower triangle of the pattern filled with integers starting from 1.
//For every value of ‘N’, help sam to print the corresponding N-dimensional Triangle.
	static void pattern3(int n) {
		for(int i=0;i<n;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print(j+1+" ");
			}
			System.out.println();
		}
	}
//Execise :4 Example:
//Input: ‘N’ = 3
//Output: 
//1
//2 2 
//3 3 3
	static void pattern4(int n) {
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(i+" ");
			}
			System.out.println();
		}
	}
	/*
	 * Exercise: 5 Input Format: N = 3 Result: * * *
	 * 	   
Input Format: N = 6
Result:
* * * * * *
* * * * * 
* * * * 
* * * 
* * 
*
	 */
	static void pattern5(int n) {
		for(int i=0;i<n;i++) {
			for(int j=n-1;j>=i;j--) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	/*
	 * Input Format: N = 6 Result:
1 2 3 4 5 6
1 2 3 4 5
1 2 3 4
1 2 3
1 2 
1
	 */
	static void pattern6(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = n;j>=i;j--) {
				System.out.print(n-j+1+" ");
			}
			System.out.println();
		}
	}
/*Exercise:7
Input Format: N = 6
Result:
	     *     
	    ***    
	   *****   
	  *******  
	 ********* 
	***********

	 */

	static void pattern7(int n) {
		for(int i=0;i<n;i++) {
			for(int j=0;j<n-i-1;j++) {
				System.out.print(" ");
			}
			for(int j=0;j<2*i+1;j++) {
				System.out.print("*");
			}
			for(int j=0;j<n-i-1;j++) {
				System.out.print(" ");
			}
			System.out.println();
		}
		System.out.println();
	}
	/*
Exercise:8
Input Format: N = 6 Result:
***********
 *********
  *******
   ***** 
    ***    
     *
	 */   
	static void pattern8(int n) {
		for(int i=0;i<n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(" ");
			}
			for(int j=0;j<2*n-(2*i+1);j++) {
				System.out.print("*");
			}
			for(int j=1;j<=i;j++) {
				System.out.print(" ");
			}
			System.out.println();
		}
	}

/* 	Exercise:9
	Input Format: N = 3
Result: 
  *  
 ***
***** 
*****  
 ***
  * */   
	static void pattern9(int n) {	
		for(int i=0;i<n;i++) {
			for(int j=0;j<n-i-1;j++) {
				System.out.print(" ");
			}
			for(int j=0;j<2*i+1;j++) {
				System.out.print("*");
			}
			for(int j=0;j<n-i-1;j++) {
				System.out.print(" ");
			}
			System.out.println();
		}
	
		for(int i=0;i<n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(" ");
			}
			for(int j=0;j<2*n-(2*i+1);j++) {
				System.out.print("*");
			}
			for(int j=1;j<=i;j++) {
				System.out.print(" ");
			}
			System.out.println();
		}
		

	}
/* 	Input Format: N = 3
Result: 
  *  
  **
  ***  
  **
  * 
*/
  	static void pattern10(int n){
	for(int i=0;i<n;i++) {
		for(int j=0;j<=i;j++) {
			System.out.print("* ");
		}
		System.out.println();
	}
	for(int i=0;i<n;i++) {
		for(int j=n-2;j>=i;j--) {
			System.out.print("* ");
		}
		System.out.println();
	}
  }
  /* 
   Input Format: N = 3
Result: 
1
01
101
   */
  	/* static void pattern11(int n){
		for(int i=0;i<n;i++){
			
		}
	}
 */
	/* 
567. Permutation in String
Medium
Topics
Companies
Hint

Given two strings s1 and s2, return true if s2 contains a
permutation
of s1, or false otherwise.

In other words, return true if one of s1's permutations is the substring of s2.

 

Example 1:

Input: s1 = "ab", s2 = "eidbaooo"
Output: true
Explanation: s2 contains one permutation of s1 ("ba").

Example 2:

Input: s1 = "ab", s2 = "eidboaoo"
Output: false

 

Constraints:

    1 <= s1.length, s2.length <= 104
    s1 and s2 consist of lowercase English letters.



*/

  	static void pattern11(int n){
  		for(int i=0;i<n;i++) {
  			for(int j=0;j<=i;j++) {
  				System.out.print("* ");
  			}
  			System.out.println();
  		}
  		for(int i=0;i<n;i++) {
  			for(int j=n-2;j>=i;j--) {
  				System.out.print("* ");
  			}
  			System.out.println();
  		}

}
}


