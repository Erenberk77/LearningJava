package calisma2;

import java.util.Scanner;

public class finalcalisma {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in) ;
		System.out.println("Lütfen bir sayı giriniz");
		int number = sc.nextInt() ;
		number = Math.abs(number); // sayının mutlak değerini alır
	//	System.out.println(Math.sqrt(number));  sayının kare kökünü alır
	/*	System.out.println(Math.pow(number,2));  sayının karesini alır
		System.out.println(Math.max((8,9)); girilen sayının maximumunu alır min yazarsak minimumu */
		int sum = 0 ; 
		while(number>0) {
			sum = sum + (number % 10) ;
			number = number/10 ;
		}
		System.out.println("Toplam= " + sum);
	}
		
	}