package java_examples;

import java.util.HashMap;
import java.util.Map;

import javax.swing.plaf.synth.SynthStyle;

public class study1 {
    public static void main(String[] args) {

                int x = 603452384;
                int y =    921789;
        
                int z = enBuyukSayiDondur(x, y);
        
                System.out.println("En büyük sayý: " + z);
            }
        
            public static int enBuyukSayiDondur(int x, int y) {
                int z = 0;
                int basamak = 1;
        
                // Her basamak için x ve y'den büyük olan rakamý alarak z'yi oluþtur
                while (x > 0 && y > 0) {
                    int xDigit = x % 10; // x'in birler basamaðý
                    int yDigit = y % 10; // y'nin birler basamaðý
        
                    // x ve y'den büyük olan rakamý alarak z'ye ekler
                    int maxDigit = Math.max(xDigit, yDigit);
                    z = maxDigit * basamak + z;
        
                    // x ve y'nin birler basamaðýný alýndýðý için 10'a bölünür
                    x /= 10;
                    y /= 10;
        
                    // Basamak bir artýrýlýr (birler, onlar, yüzler, ...)
                    basamak *= 10;
                }
        
                return z;
            }
        }