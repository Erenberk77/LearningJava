import java.util.*;
public class SortExample {
 public static void main (String[] args) {
	 ArrayList<String> words = new ArrayList<String>();
	  words.add("kalem");
	  words.add("bilgisayar");
	  words.add("bart�n");
	  words.add("kitap");
	  System.out.println("s�ralanamdan �nce: "+words);
	  System.out.println(words.get(0));
	  // a dan z ye s�ralama yapt�
	  Collections.sort(words);
	  System.out.println("s�ralanamdan sonra: "+words);
 }
 
	
}
