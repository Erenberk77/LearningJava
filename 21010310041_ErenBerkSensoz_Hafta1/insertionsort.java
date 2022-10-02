import java.util.*;
public class insertionsort {
public static void main(String[] args) {
	create_array(1000000);
}
public static void create_array(int size) {
	int []arr=new int[size];
	Random r=new Random();
	for (int i =0; i < arr.length; i++ ) {
		arr[i]=r.nextInt(1000);
	}
	time_sorting(arr, "Random");
	for(int i = 0; i<arr.length; i++) {
	arr[i]=i;
	
}
	time_sorting(arr,"Sirali");
	for(int i = arr.length-1; i>=0; i--) {
	arr[i]= arr.length-1 ;	
	}
	time_sorting(arr,"Ters Sirali");
}
	
	
public static void  time_sorting(int []arr,String s ) {
	long start=System.nanoTime();
	insertion_sort(arr);
	long end = System.nanoTime();
	System.out.println(s+ " Dizinin çalýþma zamaný:" + (end-start)/(int)Math.pow(10, 6) + "ms");
		
}
public static void insertion_sort(int []arr) {
  	int n =arr.length;
  	int j;
  	for (int i=1; i < arr.length; i++ ) {
  		int key=arr[i];
  		 j = i-1;
  		while(j>=0 && arr[j]>key) {
  			
  			arr[j+1]=arr[j];
  			j=j-1;
  			
  		}
  		arr[j+1]=key;
  	}
}
}




