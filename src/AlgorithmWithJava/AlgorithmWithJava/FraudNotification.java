package AlgorithmWithJava;

import java.util.Arrays;

public class FraudNotification {
	public static void main(String[] args) {
		int[] testArr = {2,3,4,2,3,6,8,4,5};
		int day = 5;
		int fraudNotification = 0;
		int[] tempArr = new int[day];
		int n = testArr.length;
		int median = 0;
		
		for(int j = 0; j<n; j++) {
			for(int i = 0; i<tempArr.length-1; i++) {
				tempArr[i] = testArr[i+j];
			}
			if(tempArr[j]!=-1) {//if tempArr exists,
				//first of all, do Sorting.
				Arrays.sort(tempArr);
				if(tempArr.length%2==0) { //even array.
					int mid = tempArr.length/2;
					median = (tempArr[mid]+tempArr[mid+1])/2;
					if((j<n-1)&&(median*2)<testArr[(tempArr.length+j)]) {
						fraudNotification++;
					}
				}else { //odd array.
					int mid = (tempArr.length/2)+1;
					median = tempArr[mid];
					if((j<n-1)&&(median*2)<testArr[(tempArr.length+j)]) {
						fraudNotification++;
					}
				}
			}
		}
		System.out.println("Counting fraud notification: "+fraudNotification);
	}
	
	public static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	
}
