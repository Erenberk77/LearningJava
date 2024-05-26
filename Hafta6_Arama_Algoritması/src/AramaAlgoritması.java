import java.util.Scanner;

public class AramaAlgoritmasý {
   public static void main(String[] args) {
	   Scanner sc = new Scanner(System.in);
		  System.out.print("Lütfen aranacak sayýyý giriniz: ");
		  int sayi = sc.nextInt();
	  int[]  numbers =  {5,6,11,25,32,65,72,89};
	  int [] numbers2 = {3,7,12,16,20,24,32,41};
	  
	  int index = indexOf(numbers,sayi);
	  if(index!=-1) {
		  System.out.println("Aranan eleman bulundu.");
		  System.out.println("Aranan elemanýn dizi sayýsý: " + index);
		  }
	  else {
		  System.out.println("Aranan eleman bulunamadý.");
	  }
	  index = indexOf2(numbers2,sayi);
   }
	  public static int indexOf(int[] numbers, int target) {
		  for (int index = 0; index < numbers.length; index++) {
			if(numbers[index]==target) {
				return index;
			}
			
		}
		  return -1;
	  }

		  public static int indexOf2(int[] numbers2,int sayi) {
			  int index = 0;
			  while(index < numbers2.length && numbers2[index] <= sayi) {
				  if(numbers2[index]==target) {
					  
				  }
				  
			  }
		  
		  
	  }
	  
}		  

   
