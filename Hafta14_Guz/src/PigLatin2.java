import java.util.Scanner;

public class PigLatin2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Pig Latin çevirisine hoþ geldiniz. Lütfen bir yazý giriniz: ");
		String metin = sc.nextLine();
		
		while(metin.length()>0) {
			convertMetin(metin);
			System.out.println("Çýkýþ için enter'a basýnýz. ");
			metin = sc.nextLine();
			
		} }
		public static void convertMetin(String metin) {
			String word = "";
			for (int i = 0; i < metin.length(); i++) {
				char ch= metin.charAt(i);
				if (ch == ' ') {
					if(word.length()>0) {
						convertWord(word);
						word = "";
					}
					System.out.print(" ");
				}
				else {
					word+= ch;
				}
							}
			if(word.length()>0) {
				convertWord(word);
			}
			System.out.println();
		}
	
	public static void convertWord(String word) {
		boolean seenVowel = false;
		String chars = "";
		for (int i = 0; i < word.length(); i++) {
			char ch =word.charAt(i);
			if(!seenVowel) { //ilkünlü harf bulundu mu ?
				if("AEIOUaeiou".indexOf(ch) != -1 ) {
					seenVowel = true;
					System.out.print(ch);
				}
				else {
					chars+=ch;
				}
			}
			else {
				System.out.print(ch);
			}
			
		}
		System.out.print("-" + chars + "ay ");
	}
	
	
	
}
