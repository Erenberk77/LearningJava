package calisma2;

import java.util.*;

public class finalcalisma2 {
	public static void main (String[] args) {
		// 2 tane 6 l� zar at�ld���nda rastgele gelen say�lar�n toplam�  7 geldi�inde durma 
		Random rand = new Random(); //RASTGELE SAYI �RET�R
		//System.out.println(rand.nextInt(5)); ard�ndan bunu yazarsak 5 e kadar rastgele say� �retecek
		 int tries = 0 ; 
		 int sum=0;
		 while ( sum != 7) {
		  int sayi1= rand.nextInt(6)+1; // 0 �n gelmesini istemedi�imiz i�in parantez i�ine 7 yazmad�k
		  int sayi2= rand.nextInt(6)+1;
		  sum = sayi1 + sayi2;
		  System.out.println(sayi1 + "+" + sayi2 + "=" + sum);
          tries++;
		 }
		 System.out.println("Tebrikler" + tries + "deneme bulundu");
	}

}
