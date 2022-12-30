import java.util.Scanner;

public class CheckSum {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Lütfen öğrenci numaranızı giriniz: ");
		int number = sc.nextInt();
		
		checkSum(number);
	}
	public static void checkSum(int number) {
		int sum= 0;
	
		for (int i = 6; i >=1 ; i--) {
			sum+=(number%10)*i;
		
			number = number /10;
			
		}
int check = sum%10;
System.out.println("butun toplam: " + sum);
System.out.println("check sum: " + check);
	}

}
