package calismasahasi;

import java.util.Scanner;

public class rakamlaritoplama {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Bir sayý giriniz: ");
		int kalan=0;
		int sayi= sc.nextInt();
		for (int i=0; i<=1000000000; i++) {
			kalan= kalan+ sayi%10;
			sayi/=10;
			i++;
		}
		System.out.println(kalan);
	}
}
