import java.util.Scanner;
public class notgecti {
	public static void main(String[] args) {
	Scanner input = new Scanner (System.in);
	System.out.print("Notunuzu giriniz:");
	int not= input.nextInt();
	
	if (not>=60) 
		System.out.println("Geçti");
	else
		System.out.println("Kaldý");
}
}
