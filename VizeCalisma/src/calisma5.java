
public class calisma5 {
	public static void main(String[] args) {
		int yukseklik = 6;
		int segment=2;
		for(int a=1; a<=segment; a++) {
		for(int dizi=1; dizi<=yukseklik; dizi++) {
			for(int bosluk=1; bosluk<=yukseklik-dizi; bosluk++) {
				System.out.print(" ");
			}
			for(int yildiz=1; yildiz<=(2*dizi)-1;yildiz++) {
				System.out.print("*");
			}
			System.out.println();
		}
				
	}
}
}