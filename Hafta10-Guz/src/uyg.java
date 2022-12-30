
public class uyg {
    public static final int TOTAL_STAIRS = 5 ;
	public static void main(String[] args) {
		for (int stairs = 1; stairs<=TOTAL_STAIRS; stairs++) {
			for (int i=1; i<= 5* TOTAL_STAIRS - 5*stairs; i++){
				System.out.print(" ");
			}
				System.out.print("  o  ******");
				for (int i = 1; i<=5*stairs-5; i++) {
		System.out.print(" ");
		}
				System.out.print("*");
				System.out.println();
				for (int i = 1; i<=5*TOTAL_STAIRS-5*stairs; i++) {
					System.out.print(" ");
					}
				System.out.print(" /|\\ *     ");
				for (int i = 1; i<=5*stairs-5; i++) {
					System.out.print(" ");
					}
							System.out.print("*");
							System.out.println();
							for (int i = 1; i<=5*TOTAL_STAIRS-5*stairs; i++) {
								System.out.print(" ");
								}
							System.out.print(" / \\ *     ");
							for (int i = 1; i<=5*stairs-5; i++) {
								System.out.print(" ");
								}
										System.out.print("*");
										System.out.println();

	}
		System.out.println(" *******************************");

}
}