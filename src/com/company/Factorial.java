package com.company;

public class Factorial {

    static int factorialUsingLoop(int n){

        int result = 1;

        for (int i=n; i>1; i--){

            result = result*i;
        }

        return result;
    }

    int result = 1;

    int factorialUsingRecursive(int n){

        if(n == 1){
            return 1;
        }else {
            return n*factorialUsingRecursive(n-1);
        }
    }

    public static void main(String[] args) {

//        System.out.println(factorialUsingLoop(5));

        Factorial factorial = new Factorial();
        System.out.println(factorial.factorialUsingRecursive(5));
    }
}
