
public class uygulama2 {

	public static void main(String[] args) {
              double[] Array1 = {16.1,18.3,22.4,14.4};
              boolean bl1=isSorted(Array1);
              System.out.println(bl1);
              double[] Array2 = {1.5,4.3,7.0,19.5,25.1,46.2};
              boolean bl2=isSorted(Array2);
              System.out.println(bl2);
              
              
	}
	public static boolean isSorted(double[] list) {
		for (int i = 0; i < list.length-1; i++) {
			if(list[i]>list[i+1]) {
				System.out.println(list[i+1]);
				return false;
			}
		}
		return true;
	}

}
