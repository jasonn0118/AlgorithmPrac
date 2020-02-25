package AlgorithmWithJava;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**

  @author HackerRank
* URL: https://www.hackerrank.com/challenges/minimum-absolute-difference-in-an-array/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=greedy-algorithms
*
*
* **/

public class MinimumAbsolute {
    public static void main(String[] args) {
        int[] testArr = {3, -7, 0};
        int minimumVal= Math.abs(testArr[0]-testArr[1]);
        int arrLength = testArr.length;
        int currentVal;

        Arrays.sort(testArr);



        for(int i = 0; i < arrLength-1; i++){
            currentVal = Math.abs(testArr[i]-testArr[i+1]);
            minimumVal = Math.min(minimumVal, currentVal);
        }


        System.out.println("This is minimum number: "+ minimumVal);
    }
}
