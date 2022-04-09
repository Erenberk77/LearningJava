import java.util.Scanner;
public class uygulama1 {
	public static void main(String[] args) {
		// klavyeden girilen sayının basamak değerleri toplamını bulan java kodu
		System.out.println("Lütfen bir sayı giriniz: ");
		Scanner sc = new Scanner(System.in);
				int number  =  sc.nextInt();
		number= Math.abs(number);
		 int sum = 0;
		 while (number>0) {
			 sum = sum + (number%10);
			 number = number / 10 ;
			 
		 }
		 System.out.println("Girdiğiniz sayının basamakları toplamı= " + sum );
		
	}

}
// System.out.println(Math.sqrt(number)); sayının kare kökünü alır
// System.out.println(Math.pow(number, 2)); sayının karesini alır
// System.out.println(Math.min(9,15)); girilen 2 sayıdan minimumunu bulur max yazarsakta maximumunu alır
