import java.util.ArrayList;
public class StarAdd {
 public static void main (String[] args) {
	 ArrayList<String> words = new ArrayList<String>();
	  words.add("kalem");
	  words.add("bilgisayar");
	  words.add("bart�n");
	  words.add("kitap");
	  System.out.println("d�ng� �ncesi: "+words);
	  System.out.println("Liste uzunlu�u: "+ words.size());
	  
	 for(int index=0;index<words.size();index+=2) {
		 words.add(index,"*");
		 
	 }
	 System.out.println("d�ng� sonras�: "+words);
	 System.out.println("Liste uzunlu�u: "+ words.size());
	 for(int index=0;index<words.size();index++) {
		 words.remove(index);
		 
 }
	 System.out.println("silme sonras�: "+words);
	 System.out.println("silme Liste uzunlu�u: "+ words.size());
 
 }
}
