import java.util.Scanner;

public class swapDigitpairs {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
				System.out.println("Bir sayý giriniz: ");
		int num = sc.nextInt();
		int range = swapDigitPairs(num);
		System.out.println(range);
			}
	public static int swapDigitPairs(int n) {
		int result = 0;
		int power = 1;
		while(n!=0) {
			int right = n%10;
			int left = n/10 % 10;
			n = n/100;
		//	System.out.println(right + " " + left + " " + n);
		result += left * power + right * 10 * power;
		power *= 100;
		}
		 result+= n * power;
		
		
		return result;
	}

}
