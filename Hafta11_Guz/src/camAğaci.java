

public class camAðaci {
public static void main(String[] args) {
	camAgaciCiz(3,4);
	camAgaciCiz(2,5);
}
public static void camAgaciCiz(int parcaSayisi,int yukseklik) {
	int maxLine = parcaSayisi + yukseklik -1; //maxLine=6 
	for(int i=1; i<=parcaSayisi; i++) {
		for(int line=i; line<= i+yukseklik-1; line++) {     //4,5,6
			for(int j=1; j<=maxLine-line;j++) {             // 4->5,4,3,2 5->4,3,2,1 6->3,2,1,0   
				System.out.print(" ");
			}
			for(int j=1; j<=2*line-1;j++) {                // 4->7 5->9 6->11  
				System.out.print("*");
			}
			System.out.println();
		}
	}
	kokciz("*",maxLine-1);
	kokciz("*",maxLine-1);
	kokciz("*******",maxLine-4);
}
public static void kokciz(String text, int bosluk) {
	for(int i = 1; i<=bosluk; i++) {
		System.out.print(" ");
		
	}
	System.out.println(text);
}

}
