import java.util.Scanner;

public class RomaRakamlari {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Tam sayý giriniz: ");
		int number = sc.nextInt();
		

		number = printAll(number,"M",1000,"C", 100);
		number = printAll(number,"D",500,"C", 100);
		number = printAll(number,"C",100,"X", 10);
		number = printAll(number,"L",50,"X", 10);
		number = printAll(number,"X",10,"I", 1);
		number = printAll(number,"V",5,"I", 1);
		for (int i = 1; i <= number; i++) {
			System.out.print("I");
			
		}
		System.out.println();
	}
public static int printAll(int number, String harf,int value,String lower,int lowerValue) { //number 37  count =3     number9   9-
	int count = number / value;
	for (int i = 1; i <= count; i++) {
		System.out.print(harf);
	}
	number=number-count*value;	
	if(number+lowerValue>=value) {
		System.out.print(lower+harf);
		number=number-value+ lowerValue;
	}
	
	return number;
}
}
