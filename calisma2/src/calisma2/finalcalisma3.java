package calisma2;

import java.util.Scanner;

public class finalcalisma3 {
	public static void main(String[] args) {
		// �ift say�lar�n oran� 1 2 3 4 => %50 �ift
		// [1 2 3 4]
		//  0 1 2 3
		// array[0] = 3;
		// array[2] = 4;
		Scanner sc  = new Scanner (System.in) ; 
		 int [] array  = new int [4] ;
		 System.out.println(array.length);
		 for (int counter = 0; counter < array.length; counter++) {
			 System.out.print("L�tfen say� giriniz: ");
			array[counter] = sc.nextInt();
		}
		 for (int counter = 0; counter < array.length; counter++) {
			 System.out.println("Dizinin eleman�: " + array[counter]);
		 
	}
		 int evenNumber= 0 ;
	  for (int element : array) {
		//say� �ift mi
		  if(element % 2 ==0) {
			  evenNumber++;
		  }
	}
	  double ciftSayiOrani = evenNumber * 100 / array.length;
	  System.out.println("Sistemde ki �ift sayi oran� : " + ciftSayiOrani);

}
}
