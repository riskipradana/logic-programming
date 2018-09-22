package com.company;

public class Rank {

    /**
     * Menggunakan algoritma di bawah kompleksitasnya masih O(n)
     */
    int rank(int bilangan, int pangkat){

        if(pangkat == 0){
            return 1;
        }
        return bilangan * rank(bilangan, pangkat-1);
    }

    public static void main(String[] args) {
        Rank rank =  new Rank();
        System.out.println(rank.rank(5,3));
    }
}
