public class LastDigitChecker {
    // write your code here
	
	public static void main(String[] args) {
		System.out.println(hasSameLastDigit(12,23,45));
		System.out.println(hasSameLastDigit(121,321,11));
	}
    
    public static boolean hasSameLastDigit(int a, int b, int c){
        if((a<10 || a>1000) || (b<10 || b>1000) || (c<10 || c>1000)){
            return false;
        }
        
        int lasta = a%10;
        int lastb = b%10;
        int lastc = c%10;
        
        if(lasta == lastb || lastb == lastc || lasta==lastc){
            return true;
        }
        return false;
        
    }
}