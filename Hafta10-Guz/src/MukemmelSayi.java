import java.util.Scanner;

public class MukemmelSayi {
public static void main(String[] args) {
	int toplam =0;
	Scanner sc = new Scanner(System.in);
	System.out.println("L�tfen bir say� giriniz: ");
	int sayi=sc.nextInt();
	for(int i=1; i<sayi;i++) {
		
		if(sayi%i==0) {
			toplam = toplam + i;
		}
	}
	if (toplam==sayi) {
		System.out.println("Toplam= " + toplam);
		System.out.println(sayi + " say�s� bir M�kemmel Say�`d�r.");
	}
	else {
		System.out.println("Toplam= " + toplam);
		System.out.println(sayi + " say�s� bir M�kemmel Say� de�ildir.");
	}
}
}
