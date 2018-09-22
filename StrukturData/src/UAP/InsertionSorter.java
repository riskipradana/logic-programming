/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UAP;

/**
 *
 * @author riskipradana
 */
public class InsertionSorter {

    int[] L = new int[7];

    void insertionSort() {
        int k, temp, j;
        L[0] = 29;
        L[1] = 27;
        L[2] = 10;
        L[3] = 8;
        L[4] = 76;
        L[5] = 21;
        for (k = 1; k < 6; k++) {
            temp = L[k];
            j = k - 1;
            System.out.println("Langkah " + (k - 1));
            while (j > +0 && L[j] > temp) {
                L[j + 1] = L[j];
                j = j - 1;
            }
            if (temp >= L[j]) {
                L[j + 1] = temp;
            } else {
                L[j + 1] = L[j];
                L[j] = temp;
            }
        }

        for (int i = 1; 1 <= 6; i++) {
            System.out.println(L[i] + "index" + i);

        }

    }

    public static void main(String[] args) {
        InsertionSorter sorter = new InsertionSorter();
        sorter.insertionSort();

    }
}
