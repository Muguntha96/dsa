package org.build_logical_thinking;

public class Leetcode {
    String s1;
	String s2;
	public Leetcode(String s1,String s2){
		this.s1=s1;
		this.s2=s2;
	}

    public static void main(String[] args) {
        Leetcode obj=new Leetcode("abi","abby");
		System.out.println(obj.checkInclusion("Muguuntha", "Nithya"));
    }

    public boolean checkInclusion(String s1, String s2){
        int len1=s1.length();
        int len2=s2.length();
        if(len1>len2){
            return false;
        }

        int[] charCount=new int[26];//alphabets 26 
        for(int i=0;i<len1;++i){
            charCount[s1.charAt(i)-'a']--;
            charCount[s2.charAt(i)-'a']++;
        } 

        int nonZeroCount = 0;
        for (int count : charCount) {
            if (count != 0) {
                nonZeroCount++;
            }
        }
        
        for(int i=len1;i<len2;++i){
            int charLeft=s2.charAt(i-len1)-'a';
            int charRight =s2.charAt(i)-'a';
            if(charCount[charRight]==0){
                nonZeroCount++;
            }
            charCount[charRight]++;
            if (charCount[charRight] == 0) {
                nonZeroCount--;
        }
        if (charCount[charLeft] == 0) {
            nonZeroCount++;
        }
        charCount[charLeft]--;
        if (charCount[charLeft] == 0) {
            nonZeroCount--;
        }
        if(nonZeroCount==0){
            return true;
        }
        }

        return false;
        
        
    }
}
