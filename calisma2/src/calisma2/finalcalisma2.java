package calisma2;

import java.util.*;

public class finalcalisma2 {
	public static void main (String[] args) {
		// 2 tane 6 lý zar atýldýðýnda rastgele gelen sayýlarýn toplamý  7 geldiðinde durma 
		Random rand = new Random(); //RASTGELE SAYI ÜRETÝR
		//System.out.println(rand.nextInt(5)); ardýndan bunu yazarsak 5 e kadar rastgele sayý üretecek
		 int tries = 0 ; 
		 int sum=0;
		 while ( sum != 7) {
		  int sayi1= rand.nextInt(6)+1; // 0 ýn gelmesini istemediðimiz için parantez içine 7 yazmadýk
		  int sayi2= rand.nextInt(6)+1;
		  sum = sayi1 + sayi2;
		  System.out.println(sayi1 + "+" + sayi2 + "=" + sum);
          tries++;
		 }
		 System.out.println("Tebrikler" + tries + "deneme bulundu");
	}

}
