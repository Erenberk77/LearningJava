import java.util.*;	
public class uygulama2 {
	public static void main(String[] args) {
		Random rand = new Random();
		
	//	System.out.println(rand.nextInt(5)); Girilen say�  kadar �rne�in 5 girilmi�se 0 ile 4 say� aras�nda rastgele bir say� �retir
		int tries = 0 ;
		int sum = 0 ;
		while(sum != 6) {
			int sayi1 = rand.nextInt(6)+1;
			int sayi2 = rand.nextInt(6)+1;
			sum = sayi1 + sayi2;
						System.out.println(sayi1 + "+" + sayi2 + " = " +  sum );
						tries++;
		}
		System.out.println("TEBR�KLER " + tries + " denemede bulundu.");
	}

}
// 2 zar at�ld���nda toplamlar� 6 gelen zar�n ka��nc� denemede gelece�ini bulan bir algoritma