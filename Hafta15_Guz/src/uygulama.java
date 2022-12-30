
public class uygulama {
public static void main(String[] args) {
	int[] list = {2,3,5,6,7,8,9,-50,6};
	boolean bl=isUnique(list);
	System.out.println(bl);
	
}
    public static boolean isUnique(int[] list) {
    	for (int i = 0; i < list.length; i++) {
			for (int j = i+1; j < list.length; j++) {
				if(list[i]==list[j]) {
					System.out.println(list[j] + " sayýsý tekrar ediyor");
					return false;
				}
			}
		}
    	return true;
    }
}
