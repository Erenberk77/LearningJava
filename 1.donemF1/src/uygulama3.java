import java.util.*;
public class uygulama3 {

	public static void main(String[] args) {
	//girilen sayýnýn yüzde kaçýnýn çift rakamlardan oluþtuðunu veren algoritma	
    // [ 1 2 3 4 ]
    //   0 1 2 3	
    // attay[0] = 3     arrayin 0. elemanýný bir sayý ekledik 
		Scanner sc = new Scanner(System.in);
    int[] array = new int[4];
    System.out.println(array.length);
    for  (int counter = 0; counter<array.length; counter++) {
    System.out.print("Lütfen bir sayý giriniz: ");
    array[counter] = sc.nextInt();
		
	}
    for  (int counter = 0; counter<array.length; counter++) {
        System.out.println("Dizinin elemaný: " + array[counter]);
           	}
    
    int evenNumber =0; 
    for (int element : array) {
	//sayý çift mi ?
    	if(element%2 ==0) {
    		evenNumber++;
    	}
	}
    double ciftSayiOrani = evenNumber * 100.0 / array.length;
    System.out.println("Dizideki çift sayý oraný: %"+ciftSayiOrani);
	}	
    
}