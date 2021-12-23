package odev;

import java.util.Arrays;
import java.util.Scanner;

public class ErenBerk_Sensoz_uygulama2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Ogrenci Sayisini Giriniz : ");
		int ogrenciSayisi = input.nextInt();
		
		System.out.println(ogrenciSayisi + "  tane ��rencinin notu giriliecek ...");
		double ortalama[] = new double [ogrenciSayisi];
		for(int i= 1;  i<=ogrenciSayisi;  i++ ) {
			System.out.println(i + ". ��rencinin vize notunu giriniz :  ");
			int vizeNotu = input.nextInt();
			System.out.println(i + ".  ��rencinin final notunu giriniz :  ");
			int finalNotu = input.nextInt();	
			
			ortalama [i-1]  =  ortalama (vizeNotu , finalNotu );
		}
		System.out.println("T�m  ��rencilerin Ge�me Puan� ");
		System.out.println(Arrays.toString(ortalama));	
		
	}
		
	public static double ortalama(int vizeNotu,int finalNotu) {
		vizeNotu = (int) vizeNotuHesaplama(vizeNotu);
		finalNotu = (int) finalNotuHesaplama(finalNotu);
		double ortalama = vizeNotu * 0.4 + finalNotu * 0.6;
		return ortalama;
	}
	
	public static double vizeNotuHesaplama(int vizeNotu) {
		double not =0.0;
		if(vizeNotu >= 80) {
			not = vizeNotu * 1.10;
		}
		else if (vizeNotu >= 60 ) {
			not = vizeNotu * 1.05;		
		}
		else if (vizeNotu <= 59) {
			not = vizeNotu * 1;
		}
		if (not > 100)
			not = 100;
		return not;
	}
	public static double finalNotuHesaplama(int finalNotu) {
		double not =0.0;
		if ( finalNotu >= 70) {
			not = finalNotu * 1.10;
		}
		else if (finalNotu >= 40) {
			not = finalNotu * 1.05;
		}
		else if (finalNotu <= 39) {
			not = finalNotu * 1;
		}
		if (not >100)
			not = 100;
		return not;
	}

}
