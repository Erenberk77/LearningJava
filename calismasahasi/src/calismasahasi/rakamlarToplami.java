package calismasahasi;
import java.util.Scanner;
public class rakamlarToplami {
  public static void main(String[] args) {
      int kalan=0;
	  Scanner scan = new Scanner(System.in);
	  System.out.println("Lütfen bir sayý giriniz");
	  int sayi = scan.nextInt();
	  while(sayi!=0) {
	  kalan = sayi%10 + kalan;
			  sayi/=10;
  }
	  System.out.println(kalan);
}
}