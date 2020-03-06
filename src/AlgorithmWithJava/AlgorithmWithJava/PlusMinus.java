package AlgorithmWithJava;

import java.text.DecimalFormat;

/**
 * @author HankerRank
 *
 *
 *
 * **/

public class PlusMinus {
    public static void main(String[] args) {
        int[] arr = {-4,3,-9,0,4,1};
        DecimalFormat df = new DecimalFormat("0.000000");
        int arrLength = arr.length;
        int positive = 0;
        int negative = 0;
        int zero = 0;

        for(int i = 0; i<arrLength; i++){
            if(arr[i]<0){
               negative++;
            } else if(arr[i]>0){
                positive++;
            }else{
                zero++;
            }
        }

        double postResult = (double)positive/arrLength;
        double negResult = (double)negative/arrLength;
        double zeroResult = (double)zero/arrLength;

        System.out.println(df.format(postResult));
        System.out.println(df.format(negResult));
        System.out.println(df.format(zeroResult));

    }
}
