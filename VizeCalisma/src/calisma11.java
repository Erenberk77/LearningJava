import java.util.HashMap;

public class calisma11 {
public static void main(String[] args) {
	String sentence = "is2 sentence4 This1 a3";
	String sortedSentence = SortSentences.sortSentence(sentence);
	System.out.println(sortedSentence); 
}
	  public static String sortSentence(String sentence) {
	        String[] words = sentence.split(" "); // cümleyi kelimelere ayýrma
	        HashMap<Integer, String> map = new HashMap<>();
	        
	        // kelimeleri pozisyonlarýyla birlikte bir HashMap'e yerleþtirme
	        for (String word : words) {
	            int index = Character.getNumericValue(word.charAt(word.length() - 1)); // kelime pozisyonunu alýn
	            map.put(index, word.substring(0, word.length() - 1)); // kelimeyi ve pozisyonu HashMap'e yerleþtirin
	        }
	        
	        // HashMap'i pozisyonlarýna göre sýralama
	        StringBuilder result = new StringBuilder();
	        for (int i = 1; i <= map.size(); i++) {
	            result.append(map.get(i)).append(" ");
	        }
	        
	        return result.toString().trim(); // sonuç cümlesini döndürme
	    }
	}