package java_examples;

import java.util.HashMap;
import java.util.Map;

import javax.swing.plaf.synth.SynthStyle;

public class study1 {
    public static void main(String[] args) {

                int x = 603452384;
                int y =    921789;
        
                int z = enBuyukSayiDondur(x, y);
        
                System.out.println("En b�y�k say�: " + z);
            }
        
            public static int enBuyukSayiDondur(int x, int y) {
                int z = 0;
                int basamak = 1;
        
                // Her basamak i�in x ve y'den b�y�k olan rakam� alarak z'yi olu�tur
                while (x > 0 && y > 0) {
                    int xDigit = x % 10; // x'in birler basama��
                    int yDigit = y % 10; // y'nin birler basama��
        
                    // x ve y'den b�y�k olan rakam� alarak z'ye ekler
                    int maxDigit = Math.max(xDigit, yDigit);
                    z = maxDigit * basamak + z;
        
                    // x ve y'nin birler basama��n� al�nd��� i�in 10'a b�l�n�r
                    x /= 10;
                    y /= 10;
        
                    // Basamak bir art�r�l�r (birler, onlar, y�zler, ...)
                    basamak *= 10;
                }
        
                return z;
            }
        }