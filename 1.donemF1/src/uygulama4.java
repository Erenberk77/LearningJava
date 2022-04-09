import java.util.*;
public class uygulama4 {
          public static void main(String[] args) {
        	  Scanner sc = new Scanner(System.in);
        	  System.out.print("Birinci dizinin boyutunu giriniz: ");
        	  int size = sc.nextInt();
        	  int[] list1= new int[size];
        	  System.out.print("Ýkinci dizinin boyutunu giriniz: ");
        	   size = sc.nextInt();
        	  int[] list2= new int[size];
        	for (int counter = 0; counter < list1.length; counter++) {
				System.out.print("list1 " +(counter+1) + ". sayiyi giriniz: " );
				list1[counter] = sc.nextInt();
							}  
        	for (int counter = 0; counter < list2.length; counter++) {
				System.out.print("list2 " + (counter+1) + ". sayiyi giriniz: " );
				list2[counter] = sc.nextInt();
							}  
        	int[] result = new int[list1.length + list2.length] ;
        	for (int counter= 0; counter < list1.length; counter++) {
				result[counter] = list1[counter];
							}
        	for (int counter = 0; counter < list2.length; counter++) {
				result[counter + list1.length] = list2[counter];
				
			}
        	for ( int element : result) {
		System.out.print(element + " ");		
		
			}
          }
}
