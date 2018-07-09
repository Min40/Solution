public class GreatestCommonDivisor {
    // write your code here
	public static void main(String[] args) {
		System.out.println(getGreatestCommonDivisor(12,30));
		System.out.println(getGreatestCommonDivisor(1010,10));
	}
    
    public static int getGreatestCommonDivisor(int first, int second){
        
    	 if(first < 10 || second <10){
             return -1;
         }
     
         int gcd =1;
         int  min = first < second ? first : second;
         for(int i = 1; i<=min; i++){
             if(first%i ==0 && second%i ==0){
             
                 gcd = i;
             }
     
         }
         
         
         return gcd;
     }
 }