package org.leetcode.array;

public class IsPrefixOfWord {
	public static void main(String[] args) {
		String sentence="i love eating burger";
		String searchWord="burg";
		int value=isPrefixOfWord(sentence, searchWord);
		printValue(value);
		
	}
	public static void printValue(int n) {
		System.out.println(n);
	}
	
    public static int isPrefixOfWord(String sentence,String searchWord) {
        String[] arr=sentence.split(" ");
		for(int i=0;i<arr.length;i++) {
			if(arr[i].startsWith(searchWord)) {
				return i+1;
			}
		}
		return -1;
		}
        
    
	
	
}
