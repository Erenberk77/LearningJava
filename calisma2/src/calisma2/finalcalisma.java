package calisma2;

import java.util.Scanner;

public class finalcalisma {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in) ;
		System.out.println("L�tfen bir say� giriniz");
		int number = sc.nextInt() ;
		number = Math.abs(number); // say�n�n mutlak de�erini al�r
	//	System.out.println(Math.sqrt(number));  say�n�n kare k�k�n� al�r
	/*	System.out.println(Math.pow(number,2));  say�n�n karesini al�r
		System.out.println(Math.max((8,9)); girilen say�n�n maximumunu al�r min yazarsak minimumu */
		int sum = 0 ; 
		while(number>0) {
			sum = sum + (number % 10) ;
			number = number/10 ;
		}
		System.out.println("Toplam= " + sum);
	}
		
	}