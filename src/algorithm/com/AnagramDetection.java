package algorithm.com;

import java.util.Arrays;

public class AnagramDetection {

	public static void main(String[] args) {
	
		String s1="abcd";
		String s2="dcba";
		s1=s1.toLowerCase();
		s2=s2.toLowerCase();
		if(s1.length()!=s2.length() ){
			System.out.println("String are not equal");
		}else {
			char[] st1=s1.toCharArray();
			char[] st2=s2.toCharArray();
			Arrays.sort(st1);
			Arrays.sort(st2);
			if(Arrays.equals(st1, st2)==true) {
				System.out.println("Both strings are anagram");
			}else {
				System.out.println("Both strings are not anagram");
			}
		}

	}

}
