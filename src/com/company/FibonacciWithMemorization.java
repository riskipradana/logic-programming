package com.company;

import java.math.BigInteger;
import java.util.Map;
import java.util.TreeMap;

public class FibonacciWithMemorization {

    Map<Integer, BigInteger> memorize = new TreeMap<>();

    //Remember that n start from 0
    int fibonacci(int n){

        if(n <= 1){
           return 1;
           //the base case if k <= 2 fib(k) = 1
        }
        return fibonacci(n-1) + fibonacci(n-2);
        //if n > 2 the fibonacci(n) = fibonacci(n-1) + fibonacci(n-2)
    }

    //Remember that n start from 0
    BigInteger memorizedFibbonacci(int n){
        if(n <= 1){
            if(n == 0){
                return BigInteger.ZERO;
            }
            return BigInteger.ONE;
        }
        if(memorize.get(n) == null){

            memorize.put(n, memorizedFibbonacci(n-1).add(memorizedFibbonacci(n-2)));
            //if the element is not in the TreeMap(), we wen calculate it and add it
            //bigInteger.add(BigInteger valueSecond) => value now + valueSecond
        }

        return memorize.get(n);
    }

    public static void main(String[] args) {
        FibonacciWithMemorization fibonacci = new FibonacciWithMemorization();
        int n = 4;
        System.out.println(fibonacci.memorizedFibbonacci(n));
    }
}
