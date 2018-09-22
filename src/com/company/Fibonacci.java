package com.company;

public class Fibonacci {

    int fibo(int n){

        if(n < 3){
            if(n == 0){
                return 0;
            }
            return 1;
        }
        return fibo(n-1) + fibo(n-2);
    }

    public static void main(String[] args) {
        Fibonacci fibonacci = new Fibonacci();
        int n = 3;
        System.out.println("Bilangan fibonacci ke "+ n + " adalah "+ fibonacci.fibo(2));
    }
}
