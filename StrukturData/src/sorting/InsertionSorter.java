package sorting;

public class InsertionSorter {

    int[] L = new int[7];

    void insertionSort() {
        int k, temp, j;
        L[1] = 29;
        L[2] = 27;
        L[3] = 10;
        L[4] = 8;
        L[5] = 76;
        L[6] = 21;
        for (k = 2; k <= 6; k++) {
            temp = L[k];
            j = k - 1;
            System.out.println("\nLangkah" + (k - 1));
            while (temp <= L[j]) {
                //nilai j dipindah ke belakang
                L[j + 1] = L[j];
                //variabel j pindah ke depan
                j--;
            }
            //temp dipindah ke belakang j
            if ((temp >= L[j]) || (j == 1)) {
                L[j + 1] = temp;
            //temp dipindah ke depan j
            } else {
                //temp pindah ke depan
                L[j + 1] = L[j];
                L[j] = temp;
            }
            for (int i = 1; i <= 6; i++) {
                System.out.println(L[i] + " index:" + i);
            }
        }
        for (int i = 1; i <= 6; i++) {
            System.out.println(L[i] + " index:" + i);
        }
    }

    public static void main(String[] args) {
        InsertionSorter sorter = new InsertionSorter();
        sorter.insertionSort();
    }
}
