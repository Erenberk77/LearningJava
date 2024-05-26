import java.util.Arrays;
import java.util.Scanner;
public class calisma2 {
public static void main(String[] args) {
	
	Scanner input = new Scanner(System.in);
	System.out.println("Kaç öðrencinin notu girilecek: ");
	int ogrenciSayisi = input.nextInt();
	System.out.println(ogrenciSayisi + " tane öðrencinin notu girilecektir.");
	double ortalama[] = new double[ogrenciSayisi];

	for (int i = 1; i <= ogrenciSayisi; i++) {
		System.out.println(i + ". Öðrencinin Vize notunu giriniz: ");
		int vizeNotu = input.nextInt();
		System.out.println(i + ". Öðrencinin Final notunu giriniz: ");
		int finalNotu = input.nextInt();
	ortalama[i-1] = ortalama(vizeNotu,finalNotu);

	}
	System.out.println("Tüm öðrencilerin sýrasýyla geçme notlarý ---> " + Arrays.toString(ortalama));
	input.close();	
	
}

public static double ortalama(int vizeNotu, int finalNotu) {
	vizeNotHesaplama(vizeNotu);
	finalNotHesaplama(finalNotu);
	
	System.out.println("Öðrencinin Vize Notu: " + vizeNotu);
	System.out.println("Öðrencinin Final Notu: " + finalNotu);
	
	double ortalama = vizeNotu * 0.4 + finalNotu * 0.6;
	return ortalama;
}

public static double vizeNotHesaplama(int vizeNotu) {
	double not=0.0;
	if(vizeNotu>=80) {
		not = vizeNotu * 1.10;
		}
	else if(vizeNotu>=60) {
		not=vizeNotu * 1.05;
	}
	if(vizeNotu>=100) {
		not = 100;
	}
	return not;
}

public static double finalNotHesaplama(int finalNotu) {
	double not=0.0;
	if(finalNotu>=80) {
		not = finalNotu * 1.10;
		}
	else if(finalNotu>=60) {
		not=finalNotu * 1.05;
	}
	if(finalNotu>=100) {
		not = 100;
	}
	return not;
}
}
