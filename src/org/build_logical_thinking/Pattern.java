package org.build_logical_thinking;

public class Pattern {

	public static void main(String[] args) {
		nForest(5);
		pattern2(5);

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
}

