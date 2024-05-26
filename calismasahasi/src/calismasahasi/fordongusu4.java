package calismasahasi;

public class fordongusu4 {
   public static void main(String[] args) {
	   
	  for (int i=0; i<=5; i++ ) {
		   for (int j=0; j<5; j++ ) {
			System.out.println("i= " + i + "   j= " + j);   
		   }
	   } 
	   //ayný iþlemi while döngüsüyle yapmak zahmetli uðraþtýrýcý olur. 
	   int a =0;
	   int b = 0;
	   while(a<5) {
		   b=0;
		   
		   while (b<5) {
			   
			   System.out.println("a= " + a + " b= " + b);
			   b++;
			   
		   }
		   a++;
		   
	   }
	   
	   
   }
}
