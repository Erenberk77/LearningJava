import java.util.Scanner;

public class digitRange2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Lütfen bir sayý giriniz: ");
		int num = sc.nextInt();
		int range = digitRange(num);
		System.out.println("Deðer aralýðý = " + range);
	
	}
	public static int digitRange(int sayi) {
		int max = 0;
		int min =9;
		sayi =Math.abs(sayi);
		while (sayi!=0) {
			int basamak =sayi%10;
			if (min>basamak) {
				min =basamak;
			}
			if(max<basamak) {
				max = basamak;
			}
			sayi = sayi /10;
		}		
		return  max-min+1 	;
		
	}

}
