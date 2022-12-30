
public class BinaryHesaplama {

	public static void main(String[] args) {
		String str = toBinary(10);
		System.out.println(str);
		System.out.println(toBinary(10));

	}
	public static  String toBinary(int number) {
		String binary = "";
		if(number==0) {
			binary="0";
		}
		else {
			while(number!=0) {
				binary= number%2 + binary;
						number/=2;
			}
		}
		return binary;
	}
}
