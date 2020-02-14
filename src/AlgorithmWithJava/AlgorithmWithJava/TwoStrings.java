package AlgorithmWithJava;

/**
 * Given two strings, determine if they share a common substring. A substring may be as small as one character.

	For example, the words "a", "and", "art" share the common substring 'a'. The words "be" and "cat" do not share a substring.
	
	Function Description
	
	Complete the function twoStrings in the editor below. It should return a string, either YES or NO based on whether the strings share a common substring.
	
	twoStrings has the following parameter(s):
	
	s1, s2: two strings to analyze .
	Input Format
	
	The first line contains a single integer , the number of test cases.
	
	The following  pairs of lines are as follows:
	
	The first line contains string .
	The second line contains string .
	Constraints
	
	 and  consist of characters in the range ascii[a-z].
	Output Format
	
	For each pair of strings, return YES or NO.
 * 
 * @author HackerRank
 * URL: https://www.hackerrank.com/challenges/two-strings/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=dictionaries-hashmaps
 * 
 * 
 * **/

public class TwoStrings {

	public static void main(String[] args) {
		String s1 = "hello";
		String s2 = "world";
		char[] s1Char = {};
		char[] s2Char = {};
		
		for(int i = 0; i<s1.length(); i++) {
			s1Char[i] = s1.charAt(i);
		}//S1 String to char array.
		for(int i = 0; i<s2.length(); i++) {
			s2Char[i] = s2.charAt(i);
		}//S2 String to char array.
	}
}
