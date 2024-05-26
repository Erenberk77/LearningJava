
public class calisma4 {
  public static void main(String[] args) {
	int N = 5;
	for(int line =1; line<=N; line++) {
		for(int sutun=1; sutun<=(N-line); sutun++) {
			System.out.print("+");
		}
		System.out.println(line);
	  }
	
	for (int satir=N; satir>=1;satir--)		 {
		
		for(int x=1;x<=(N-satir); x++) {
			System.out.print("*");
		}
		System.out.println(satir);
	}
	  
  }
}
