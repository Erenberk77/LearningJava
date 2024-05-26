package guz_hafta_9;

public class uygulama2 {
	public static void main(String[] args) {
		drawBox(5,10);
	}
	public static void drawBox(int height, int width) {
		writeChar('*',width);
		System.out.println();
		for(int i=1; i<=height-2; i++) {
			writeChar('*',1);
			writeChar(' ',width-2);
			writeChar('*',1);
			System.out.println();
		}
		writeChar('*',width);
		System.out.println();
	}
	public static void writeChar(char ch, int number) {
	for(int i=1; i<=number; i++) {
		System.out.print(ch);
	}
}


}
