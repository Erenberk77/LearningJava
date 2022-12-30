
public class calisma {
public static void main(String[] args) {
	System.out.println("#================#");
	int yuk = 8;
	int Maxbosluk = 6;
	for (int i = 1; i <= yuk/2; i++) {
		System.out.print("|");
		for (int x=1; x<=Maxbosluk - (i-1)*2; x++) {
			System.out.print(" ");
			
		}
		System.out.print("<>");
		for (int n = 1; n <=4 * (i-1);  n++) {
			System.out.print(".");
			
		}
		System.out.print("<>");
		for (int x=1; x<=Maxbosluk - (i-1)*2; x++) {
			System.out.print(" ");
			
		}
		
		
		System.out.print("|");
		System.out.println();
	}
	for (int i = yuk/2; i >= 1; i--) {
		System.out.print("|");
		for (int x=1; x<=Maxbosluk - (i-1)*2; x++) {
			System.out.print(" ");
			
		}
		System.out.print("<>");
		for (int n = 1; n <=4 * (i-1);  n++) {
			System.out.print(".");
			
		}
		System.out.print("<>");
		for (int x=1; x<=Maxbosluk - (i-1)*2; x++) {
			System.out.print(" ");
			
		}
		
		
		System.out.print("|");
		System.out.println();
	}
	System.out.println("#================#");
}
}
