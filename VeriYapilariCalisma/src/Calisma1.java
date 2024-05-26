
public class Calisma1 {

	public static void main(String[] args) {
		int dizi[] = {2,7,4,11,8,9,34};
		InsertionSort(dizi);
		 Print(dizi);
			}
	public static void InsertionSort(int dizi[]) {
		for (int i = 1; i < dizi.length; i++) {
			int key = dizi[i];
			int j = i-1;
			while (dizi[j]>dizi[i] && j>=0) {
				dizi[j+1] = dizi[j];
				j--;
			}
			dizi[j+1]=key;
					}
	}
	public static void Print(int dizi[]) {
		for (int i = 0; i < dizi.length; i++) {
			System.out.print(dizi[i] + " ");
			
		}
	}
	

}
