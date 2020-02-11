package AlgorithmWithJava;

public class newYearSol {

	public static void main(String[] args) {
		
		int[] inputArr = {2,1,5,3,4};
		minimumBribes(inputArr);
		
	}
	static void minimumBribes(int[] q) {
		
		int[] copiedAlignedArr = new int[q.length];
		for(int i = 0; i<copiedAlignedArr.length; i++) {
			copiedAlignedArr[i] = i+1;
		}
		
		for(int i=0; i<q.length; i++) {
			if((q[i]>i+3)||(q[i]<i-1)) {
				System.out.println("Too Chaotic");
			}else {
				System.out.println("hi");
			}
		}
	}
}
