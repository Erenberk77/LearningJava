
public class InsertionSort {

	public static void main(String[] args)  {
		
		int dizi[]= {3,7,1,9,34,23};
		insertion_sort(dizi);
		print(dizi);
	}		
		public static void insertion_sort(int dizi[]) {
			int key,j;
			for (int i = 1; i < dizi.length; i++) {
				key=dizi[i];
				j=i-1;
				while(j>=0 && dizi[j]>key) {
					dizi[j+1]=dizi[j];
					j--;
				}
				dizi[j+1]=key;
			}
		}
		public static void print(int dizi[]) {
			for (int i = 0; i < dizi.length; i++) {
				System.out.print(dizi[i]+" ");
			}
			
		}
	}

