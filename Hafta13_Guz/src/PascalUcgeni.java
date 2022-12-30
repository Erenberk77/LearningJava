import java.util.Scanner;

public class PascalUcgeni {
	
	public static final int  FIELD_WIDTH =4;
	
	
	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in) ;
		System.out.print("Yükseklik deðeri giriniz: ");
				int yuk = sc.nextInt();
				
				writeTable(yuk-1);
	}
	
	public static  void writeTable(int maxRow) {
		for (int Row = 0; Row <= maxRow; Row++) {
			//boþluklarý yazdýr
			writeChars(' ',(maxRow-Row) * FIELD_WIDTH/2);
			writeRow(Row);
			
			
		}
	}
	public static void writeChars(char ch,int number) {
		for (int i = 1; i <= number; i++) {
			System.out.print(ch);
		}
	}
	public static void writeRow(int number) {
		int value =1 ;
		System.out.print("1");
		for (int i = 1; i <= number; i++) {
			value = value*(number-i+1) /i;
			System.out.printf("%4d" ,value);
			
		}
		
		System.out.println();
		
	}
}
