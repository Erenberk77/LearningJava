
public class Soru3 {
public static void main(String[] args) {
	int[] arr1= {1,2,3,4,5};
	int[] arr2= {5,6,7,8,9};
	boolean b1 = allLess(arr1, arr2);
	System.out.println(b1);
}
public static boolean allLess(int[] arr1, int[] arr2) {
    
    if (arr1.length != arr2.length) {
        return false;
    }

   
    for (int i = 0; i < arr1.length; i++) {
        if (arr1[i] >= arr2[i]) {
            return false;
        }
    }

    
    return true;
}
}
