public class SharedDigit {
    // write your code here
    
	public static void main(String[] args) {
		System.out.println(hasSharedDigit(12,23));
	}
	
	    public static boolean hasSharedDigit(int a, int b){
	         
	    	if((a<10 || a>99) ||(b<10 || b>99)){
	            return false;
	        }
	        
	        int lasta = a%10;   //a's last digit
	         a = a/10;
	        
	        int lastb = b%10;   //b;s last digit
	         b = b/10;
	    
	        if((lasta == b) || (a == lastb)){
	            return true;
	        }
	        return false;
	    }
	}