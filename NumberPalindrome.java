public class NumberPalindrome {
	public static void main(String[] args) {
		
		System.out.println(isPalindrome(121));
		System.out.println(isPalindrome(124));
	}
    
    public static boolean isPalindrome(int number){
//        String s = String.valueOf(number);
//        StringBuffer sb = new StringBuffer(s).reverse();
//        System.out.println(sb);
//        if(s.equals(sb)) {
//        	return true;
//        }
        //System.out.println(s);
    	int  n = number;
    	int reverse =0;
    	while(n!=0) {
    	int lastd = n%10;
    	reverse = reverse*10 + lastd;
    	n = n/10;
    	}
    	if(number==reverse) {
    		return true;
    	
    	}
        return false;
    }

}