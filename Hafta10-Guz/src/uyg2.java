
public class uyg2 {
public static void main (String[] args) {
	writeChar('=',20);
	System.out.println();
	for (int i = 1; i<=10; i++) {
		writeChar('>',i);
		writeChar(' ',20-2*i);
		writeChar('<',i);
		System.out.println();
		
		
	}
	writeChar('=',20);
}
	public static void writeChar(char ch,int number) {
		for(int i=1; i<=number; i++) {
			System.out.print(ch);
		}
	}
}
