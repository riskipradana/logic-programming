package com.company;

public class Prima {

    public static void main(String[] args) {

        for (int i=2; i<=10; i++){
            boolean prima = true;

            for (int j=2; j<i; j++){
                if(i%j==0){
                    prima = false;
                    break;
                }
            }

            if(prima){
                System.out.println(i);
            }
        }
    }
}
