import java.util.*;	
public class uygulama2 {
	public static void main(String[] args) {
		Random rand = new Random();
		
	//	System.out.println(rand.nextInt(5)); Girilen sayý  kadar örneðin 5 girilmiþse 0 ile 4 sayý arasýnda rastgele bir sayý üretir
		int tries = 0 ;
		int sum = 0 ;
		while(sum != 6) {
			int sayi1 = rand.nextInt(6)+1;
			int sayi2 = rand.nextInt(6)+1;
			sum = sayi1 + sayi2;
						System.out.println(sayi1 + "+" + sayi2 + " = " +  sum );
						tries++;
		}
		System.out.println("TEBRÝKLER " + tries + " denemede bulundu.");
	}

}
// 2 zar atýldýðýnda toplamlarý 6 gelen zarýn kaçýncý denemede geleceðini bulan bir algoritma