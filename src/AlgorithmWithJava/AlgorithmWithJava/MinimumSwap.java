package AlgorithmWithJava;


/**
 * You are given an unordered array consisting of consecutive integers  [1, 2, 3, ..., n] without any duplicates. You are allowed to swap any two elements. You need to find the minimum number of swaps required to sort the array in ascending order.

	For example, given the array  we perform the following steps:
	
	i   arr                         swap (indices)
	0   [7, 1, 3, 2, 4, 5, 6]   swap (0,3)
	1   [2, 1, 3, 7, 4, 5, 6]   swap (0,1)
	2   [1, 2, 3, 7, 4, 5, 6]   swap (3,4)
	3   [1, 2, 3, 4, 7, 5, 6]   swap (4,5)
	4   [1, 2, 3, 4, 5, 7, 6]   swap (5,6)
	5   [1, 2, 3, 4, 5, 6, 7]
	It took  swaps to sort the array.
	
	Function Description
	
	Complete the function minimumSwaps in the editor below. It must return an integer representing the minimum number of swaps to sort the array.
	
	minimumSwaps has the following parameter(s):
	
	arr: an unordered array of integers
	Input Format
	
	The first line contains an integer, , the size of .
	The second line contains  space-separated integers .
	
	Constraints
	
	Output Format
	
	Return the minimum number of swaps to sort the given array.
	
 * @author HackerRank
 * **/

public class MinimumSwap {
	
	public static void main(String[] args) {
		int[] testArr = {1,3,5,2,4,6,7};
		
		int length = testArr.length-1;
		int count = 0;
		
		for(int i=0; i<length; i++) {			
			if(i<testArr[i]-1) {
				swap(testArr, i, Math.min(length, testArr[i]-1));
				count++;
				i--;
			}			
		}
		System.out.println(count);
		
//		for(int i = 0; i<testArr.length; i++) {
//			System.out.print(testArr[i]+" ");
//		}
//		System.out.println();		
		
	}
	
	public static void swap(int[] a, int i, int j) {
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}

}
