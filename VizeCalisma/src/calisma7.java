
public class calisma7 {
 public static void main(String[] args) {
	 int yukseklik = 5;
	 for(int satir=1; satir<=yukseklik; satir++ ) {
		 for (int bosluk = 1; bosluk<= yukseklik-satir; bosluk++) {
			 System.out.print(" ");
		 }
			 for(int ters= satir; ters>=2; ters--) {
				 System.out.print(ters);
				 			 }
			 for(int duz=1; duz<=satir; duz++) {
				 System.out.print(duz);
			 }
			 System.out.println();
		 }
	 }
 }

