package AlgorithmWithJava;
public class Solution{
	
	public static void main(String[] args) {
		String s = "epsxyyflvrrrxzvnoenvpegvuonodjoxfwdmcvwctmekpsnamchznsoxaklzjgrqruyzavshfbmuhdwwmpbkwcuomqhiyvuztwvq";
		long n = 549382313570L;
				
		char[] stringArr = s.toCharArray();
        int stringArrLeng = stringArr.length;
        long restOfArrNum = 0;
        long countA = 0;
        long result = 0;
        
        for(int i=0; i<stringArr.length; i++){
            if(stringArr[i]=='a'){
                countA = countA+1;
            }
        }
        
        long totalStringCount = n / stringArrLeng;
        
        result = countA * totalStringCount;
        restOfArrNum = n % stringArrLeng;
        System.out.println(restOfArrNum);
        
        for(int i = 0; i<restOfArrNum; i++){
            if(stringArr[i]=='a'){
                result = result+1;
            }
        }


        System.out.println(result);
		
		
	}
}