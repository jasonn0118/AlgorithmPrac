package AlgorithmWithJava;

import java.util.ArrayList;
import java.util.List;

/**
 *  Diagonal Difference
 * @author HankerRank
 * URL: https://www.hackerrank.com/challenges/diagonal-difference/problem
 *
 *
 *
 * **/

public class DiagonalDifference {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> arr = new ArrayList<ArrayList<Integer>>(3);
        ArrayList<Integer> a1 = new ArrayList<>();
        a1.add(11);
        a1.add(2);
        a1.add(4);
        arr.add(a1);

        ArrayList<Integer> a2 = new ArrayList<>();
        a2.add(4);
        a2.add(5);
        a2.add(6);
        arr.add(a2);

        ArrayList<Integer> a3 = new ArrayList<>();
        a3.add(10);
        a3.add(8);
        a3.add(-12);
        arr.add(a3);

        int firstSum = 0;
        int secondSum = 0;
        int result;
        int length = arr.get(0).size()-1;

        for(int i = 0; i<arr.size(); i++){
            for(int j=0; j<arr.get(i).size(); j++){
                if(i==j){
//                if(i%j==0){
                    firstSum+=arr.get(i).get(j);
                }
                if((length-i)==j){
                    secondSum+=arr.get(i).get(j);
                }
            }
        }
        result = Math.abs(firstSum-secondSum);

        System.out.println(result);


    }
}
