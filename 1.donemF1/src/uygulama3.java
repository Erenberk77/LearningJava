import java.util.*;
public class uygulama3 {

	public static void main(String[] args) {
	//girilen say�n�n y�zde ka��n�n �ift rakamlardan olu�tu�unu veren algoritma	
    // [ 1 2 3 4 ]
    //   0 1 2 3	
    // attay[0] = 3     arrayin 0. eleman�n� bir say� ekledik 
		Scanner sc = new Scanner(System.in);
    int[] array = new int[4];
    System.out.println(array.length);
    for  (int counter = 0; counter<array.length; counter++) {
    System.out.print("L�tfen bir say� giriniz: ");
    array[counter] = sc.nextInt();
		
	}
    for  (int counter = 0; counter<array.length; counter++) {
        System.out.println("Dizinin eleman�: " + array[counter]);
           	}
    
    int evenNumber =0; 
    for (int element : array) {
	//say� �ift mi ?
    	if(element%2 ==0) {
    		evenNumber++;
    	}
	}
    double ciftSayiOrani = evenNumber * 100.0 / array.length;
    System.out.println("Dizideki �ift say� oran�: %"+ciftSayiOrani);
	}	
    
}