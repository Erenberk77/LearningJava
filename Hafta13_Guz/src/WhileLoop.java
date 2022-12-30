
public class WhileLoop {

	public static void main(String[] args) {
		 int sonuc = mystery(3,3);
System.out.println(sonuc);
System.out.println(mystery(5,3));
System.out.println(mystery(2,6));     
System.out.println(mystery(30,75));                    
	}
	public static int mystery(int x,int y) {
		while (x!=0 && y!=0) {
			if(y>x) {
				y-=x;
			}
				else {
					x-=y;
				}
			
			}
		
		
	return x+y;
	}
}

