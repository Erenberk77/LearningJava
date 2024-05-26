import java.util.Scanner;
public class calisma1 {
public static void main(String[] args) {
	
	Scanner input = new Scanner(System.in);
	System.out.println("Kaç öðrencinin notu girilecek: ");
	int ogrenciSayisi = input.nextInt();
	System.out.println(ogrenciSayisi + " tane öðrencinin notu girilecektir.");
	for (int i = 1; i <= ogrenciSayisi; i++) {
		System.out.println(i + ". Öðrencinin Vize notunu giriniz: ");
		int vizeNotu = input.nextInt();
		System.out.println(i + ". Öðrencinin Final notunu giriniz: ");
		int finalNotu = input.nextInt();
		System.out.println("Öðrencinin vize notu: " + vizeNotHesaplama(vizeNotu));
		System.out.println("Öðrencinin Fize notu: " + finalNotHesaplama(finalNotu));
		double ortalama = finalNotHesaplama(finalNotu)*0.6 + vizeNotHesaplama(vizeNotu)*0.4;
		System.out.println("Öðrencinin gano ortalamasý: " + ortalama);
	}
	input.close();	
	
}

public static double vizeNotHesaplama(int vizeNotu) {
	double not=0.0;
	if(vizeNotu>=80) {
		not = vizeNotu * 1.10;
		}
	else if(vizeNotu>=60) {
		not=vizeNotu * 1.05;
	}
	else if(vizeNotu<60) {
		not=vizeNotu;
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
	else if(finalNotu<60) {
		not=finalNotu;
	}
	if(finalNotu>=100) {
		not = 100;
	}
	return not;
}
}
