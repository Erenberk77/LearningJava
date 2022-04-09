import java.util.Scanner;
public class notgeçti2 {
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		System.out.print("Notunuzu giriniz:");
		int not = input.nextInt();
		if (not>=90)
			System.out.println("Notunuz: " + "A");
		else if (not>=80)
		System.out.println("Notunuz: " + "B");
		else if (not>=70)
		System.out.println("Notunuz: " + "C");
		else if (not>=60)
		System.out.println("Notunuz: " + "D");
		else
			System.out.println("Notunuz: " + "F");
	}
 
}
