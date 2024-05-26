public class MergeSort {

    public static void main(String[] args) {
        int dizi[] = {5, 2, 89, 23, 13};
        for (int i = 0; i < dizi.length; i++) System.out.printf("%4d", dizi[i]);
        System.out.println();
        merge_sort(dizi, 0, dizi.length - 1);
        for (int i = 0; i < dizi.length; i++) System.out.printf("%4d", dizi[i]);
        System.out.println();
    }

    static void merge_sort(int A[], int p, int r) {
        if (p < r) {
            int q = (p + r) / 2;
            merge_sort(A, p, q);
            merge_sort(A, q + 1, r);
            merge(A, p, q, r);
        }
    }

    static void merge(int A[], int p, int q, int r) {
        int n1 = q - p + 1;
        int n2 = r - q;
        int L[] = new int[n1];
        int R[] = new int[n2];

        for (int i = 0; i < n1; i++) {
            L[i] = A[p + i];
        }
        for (int j = 0; j < n2; j++) {
            R[j] = A[q + j + 1];
        }
        int i = 0, j = 0, k = p;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                A[k] = L[i];
                i++;
            } else {
                A[k] = R[j];
                j++;
            }
            k++;
        }
        while (i < n1) {
            A[k] = L[i];
            i++;
            k++;
        }
        while (j < n2) {
            A[k] = R[j];
            j++;
            k++;
        }
    }
}

