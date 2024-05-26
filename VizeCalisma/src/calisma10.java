
public class calisma10 {
	public static void main(String[] args) {
		int yukseklik=6;
		int segment =2;
		for(int a=1; a<=segment; a++) {
		for(int satir=0; satir<yukseklik; satir++) {
			for(int bosluk=0; bosluk<= satir; bosluk++) {
				System.out.print(" ");
			}
			for(int yildiz=yukseklik*2-1;yildiz>=(satir*2+1);yildiz--) {
				System.out.print("*");
			}
			System.out.println();
		}
			}
}
	
}		
		
		
		
		
		
		
		
	
/*   *
    ***
   *****
  *******
 *********
*********** */


