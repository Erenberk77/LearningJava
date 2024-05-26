import java.util.HashMap;

public class sinav {
    public static String sortSentence(String sentence) {
        String[] words = sentence.split(" "); // c�mleyi kelimelere ay�rma
        HashMap<Integer, String> map = new HashMap<>();
        
        // kelimeleri pozisyonlar�yla birlikte bir HashMap'e yerle�tirme
        for (String word : words) {
            int index = Character.getNumericValue(word.charAt(word.length() - 1)); // kelime pozisyonunu al�n
            map.put(index, word.substring(0, word.length() - 1)); // kelimeyi ve pozisyonu HashMap'e yerle�tirin
        }
        
        // HashMap'i pozisyonlar�na g�re s�ralama
        StringBuilder result = new StringBuilder();
        for (int i = 1; i <= map.size(); i++) {
            result.append(map.get(i)).append(" ");
        }
        
        return result.toString().trim(); // sonu� c�mlesini d�nd�rme
    }
}
