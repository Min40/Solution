public class FirstLastDigitSum {
    
	public static void main(String[] args) {
		System.out.println(sumFirstAndLastDigit(123));
	}
    public static int sumFirstAndLastDigit(int number){
        
        if( number <0){
            return -1;
        }
        int sum = 0;
        int last = number%10;
        int first =0;
        for (int i = 10; i < number; i *= 10) {
            first = number / i;
        }
        
        sum = first + last;
        
        return sum;
    }
    
}