package AlgorithmWithJava;

import java.util.Arrays;

import sun.security.util.Length;

/**
 * Mark and Jane are very happy after having their first child. Their son loves toys, so Mark wants to buy some. There are a number of different toys lying in front of him, tagged with their prices. Mark has only a certain amount to spend, and he wants to maximize the number of toys he buys with this money.
	
	Given a list of prices and an amount to spend, what is the maximum number of toys Mark can buy? 
	For example, if prices=[1,2,3,4] and Mark has k=7 to spend, he can buy items [1,2,3] for 6, or [3,4] for 7 units of currency. He would choose the first group of 3 items.
	
	Function Description
	
	Complete the function maximumToys in the editor below. It should return an integer representing the maximum number of toys Mark can purchase.
	
	maximumToys has the following parameter(s):
	
	prices: an array of integers representing toy prices
	k: an integer, Mark's budget
	Input Format
	
	The first line contains two integers,  and , the number of priced toys and the amount Mark has to spend.
	The next line contains  space-separated integers 
	
	Constraints
	
	
	A toy can't be bought multiple times.
	
	Output Format
	
	An integer that denotes the maximum number of toys Mark can buy for his son.
	
	Sample Input
	
	7 50
	1 12 5 111 200 1000 10
	Sample Output
	
	4
 * @author HackerRank
 * 
 * **/



public class MarkAndToys {
	public static void main(String[] args) {
		
		int[] testArr = {1,12,5,111,200,1000,10};
		int markHas = 50;
		int countItem = 0;
		int n = testArr.length-1;
		
		//First of all, Sorting.
//		for(int i = 0; i<n; i++) {
//			for(int j = 0; j<n-i; j++) {
//				if(testArr[j]>testArr[j+1]) {
//					swap(testArr, j, j+1);
//				}
//			}
//		}
		
		//more efficiency using java.util.
		//but still needs to study Big O of Sorting method.
		Arrays.sort(testArr);
		
		for(int i=0; i<n; i++) {
			System.out.print(testArr[i]+" ");
		}
		System.out.println();
		
		for(int i=0; i<n; i++) {
			if(markHas>=testArr[i]) {
				markHas -= testArr[i];
				countItem++;
			}			
		}
		System.out.println("counts: "+ countItem);
		
	}
	
	public static void swap(int[] array, int i, int j) {
		int test = array[i];
		array[i] = array[j];
		array[j] = test;
	}
}
