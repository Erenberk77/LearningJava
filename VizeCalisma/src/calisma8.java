import java.util.Scanner;

public class calisma8 {

	public static void main(String[] args) {
		int sayi;
		Scanner scan= new Scanner(System.in);
		System.out.print("Lütfen bir sayý giriniz: ");
		sayi = scan.nextInt();
		int toplam=0;
	for(int x = sayi; x>0; x/=10)		{
		
		toplam = toplam + x%10;
		
	}
		System.out.print(sayi + " Sayýsýnýn rakamlarý toplamý: " + toplam);

	}

}
