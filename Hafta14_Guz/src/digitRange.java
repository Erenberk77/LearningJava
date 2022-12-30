
public class digitRange {
	public static void main(String[] args) {
		System.out.println(digitRange(12345)); // prints 5
		System.out.println(digitRange(987654321)); // prints 9
		System.out.println(digitRange(0)); // prints 1:
	}
	public static int digitRange(int number) {
	    int min = 9;
	    int max = 0;
	    
	    while (number > 0) {
	        int digit = number % 10;
	        min = Math.min(min, digit);
	        max = Math.max(max, digit);
	        number /= 10;
	    }
	    return max-min+1;  
	    		
	}
	
}
