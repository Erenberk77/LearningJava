import java.util.Arrays;

public class uygulama3 {
public static void main(String[] args) {
	int[] list1= {2,4,6};
	int[] list2 = {1,2,3,4,5};
	System.out.println(Arrays.toString(append(list1,list2)));
	System.out.println(Arrays.toString(append(list2,list1)));
}
public static int[] append(int[] list1, int[] list2) {
	int elemansayisi = list1.length + list2.length;
	int[] result =new int [elemansayisi];
	for (int i = 0; i < list1.length; i++) {
		result[i] =list1[i];
	}
	System.out.println(Arrays.toString(result));
	for (int i = 0; i < list2.length; i++) {
		result[i+list1.length] =list2[i];
		
	}
	System.out.println(Arrays.toString(result));
	return result;
}
}
