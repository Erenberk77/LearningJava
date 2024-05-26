import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<String> kullaniciListesi = new ArrayList<>();
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Kullanýcý adlarýný ve tarihleri girin (Çýkýþ için 'q' tuþuna basýn):");
        
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
        
        // Kullanýcý adlarýný yazdýrma
        for (String kullaniciAdi : kullaniciAdlari) {
            System.out.println(kullaniciAdi);
        }
    }
}

