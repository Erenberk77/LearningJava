import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<String> kullaniciListesi = new ArrayList<>();
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Kullan�c� adlar�n� ve tarihleri girin (��k�� i�in 'q' tu�una bas�n):");
        
        while (true) {
            String kullaniciBilgisi = scanner.nextLine();
            
            if (kullaniciBilgisi.equals("+")) {
                break;
            }
            
            kullaniciListesi.add(kullaniciBilgisi);
        }
        
        List<String> kullaniciAdlari = new ArrayList<>();
        
        for (String kullanici : kullaniciListesi) {
            String[] kullaniciBilgileri = kullanici.split(", ");
            String kullaniciAdi = kullaniciBilgileri[0];
            
            kullaniciAdlari.add(kullaniciAdi);
        }
        
        // Kullan�c� adlar�n� yazd�rma
        for (String kullaniciAdi : kullaniciAdlari) {
            System.out.println(kullaniciAdi);
        }
    }
}

