import java.util.Scanner;

public class calisma1 {
public static void main(String[] args) {
	int vize;
	Scanner sc= new Scanner(System.in);
	System.out.println("Vize Notunu giriniz: ");
	 vize =sc.nextInt();
	 
	 System.out.println("Final Notunu giriniz: ");
	int Final = sc.nextInt();
	 double ortalama;
	 ortalama = vize * 2/5 + Final * 3/5 ;
	 
	 if (ortalama >=50 && vize<=100 && Final<=100) {
		 System.out.println("Ortalamanýz: " + ortalama);
		 System.out.println("Tebrikler Geçtiniz.");
	 }
	  else if (vize>100 || Final>100 ) {
		 System.out.println("Geçersiz not girdiniz. Vize veye fenal notu 100 den büyük olamaz. ");
	 }
	 else {
		 System.out.println("Ortalamanýz: " + ortalama);
		 System.out.println("Yarra yedin git tekrar al amýnakoyduðumun dersini.");
	 }
	
}
}