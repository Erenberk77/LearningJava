import java.util.Scanner;
public class uygulama1 {
	public static void main(String[] args) {
		// klavyeden girilen say�n�n basamak de�erleri toplam�n� bulan java kodu
		System.out.println("L�tfen bir say� giriniz: ");
		Scanner sc = new Scanner(System.in);
				int number  =  sc.nextInt();
		number= Math.abs(number);
		 int sum = 0;
		 while (number>0) {
			 sum = sum + (number%10);
			 number = number / 10 ;
			 
		 }
		 System.out.println("Girdi�iniz say�n�n basamaklar� toplam�= " + sum );
		
	}

}
// System.out.println(Math.sqrt(number)); say�n�n kare k�k�n� al�r
// System.out.println(Math.pow(number, 2)); say�n�n karesini al�r
// System.out.println(Math.min(9,15)); girilen 2 say�dan minimumunu bulur max yazarsakta maximumunu al�r
