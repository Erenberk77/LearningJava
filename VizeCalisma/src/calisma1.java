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
		 System.out.println("Ortalaman�z: " + ortalama);
		 System.out.println("Tebrikler Ge�tiniz.");
	 }
	  else if (vize>100 || Final>100 ) {
		 System.out.println("Ge�ersiz not girdiniz. Vize veye fenal notu 100 den b�y�k olamaz. ");
	 }
	 else {
		 System.out.println("Ortalaman�z: " + ortalama);
		 System.out.println("Yarra yedin git tekrar al am�nakoydu�umun dersini.");
	 }
	
}
}