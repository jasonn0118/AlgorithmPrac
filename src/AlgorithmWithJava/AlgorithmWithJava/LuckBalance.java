package AlgorithmWithJava;

import java.util.*;
/**
 * @author HackerRank
 *
 * url: https://www.hackerrank.com/challenges/luck-balance/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=greedy-algorithms
 *
 * **/

public class LuckBalance {

    public static void main(String[] args) {
        int[][] LT = {{13,1},{10,1},{9,1},{8,1},{13,1},{12,1},{18,1},{13,1}};
        List<Integer> tempVal = new ArrayList<>();
        int arrayLength = LT.length;
        int K = 5;
        int sumResult = 0;

        for(int i = 0; i<arrayLength; i++){
            //make one more important contest value array.
           if(LT[i][1]==1){
               tempVal.add(LT[i][0]);
           }
        }
        Collections.sort(tempVal);//sorting for val.
        int importContCount = tempVal.size();
        int restImpCont = importContCount-K;

        for(int j = 0; j<arrayLength; j++){
            if(LT[j][1]==0){
                sumResult += LT[j][0];//add every unImportant value.
            }
        }
        for(int x=0; x<importContCount; x++){
            if(x<restImpCont){
                sumResult -= tempVal.get(x);
            }else{
                sumResult += tempVal.get(x);
            }
        }

        System.out.println("Result: "+sumResult);


    }
}
