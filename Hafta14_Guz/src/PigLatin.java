import java.util.Scanner;
public class PigLatin {



		  public static void main(String[] args) {
		    Scanner scanner = new Scanner(System.in);
		    System.out.println("Pig Latin çeviricisine hoþ geldiniz! Bir cümle girin: ");

		    String input = scanner.nextLine();

		    String[] words = input.split(" ");
		    String pigLatin = "";

		    for (String word : words) {
		      String firstLetter = word.substring(0, 1);
		      String restOfWord = word.substring(1);
		      pigLatin += restOfWord + firstLetter + "ay ";
		    }

		    System.out.println("Girdiðiniz cümlenin Pig Latin çevirisi: " + pigLatin);
		  }
	}

