package com.company;

import java.math.BigInteger;
import java.util.Map;
import java.util.TreeMap;

public class RankWithMemorization {

    Map<Integer, BigInteger> memorize = new TreeMap<>();

    BigInteger memorizeRank(BigInteger bilangan, int pangkat){

        if(pangkat == 0){
            return BigInteger.ONE;
        }
        if(memorize.get(pangkat) == null){

            memorize.put(pangkat, bilangan.multiply(memorizeRank(bilangan, pangkat-1)));
        }

        return memorize.get(pangkat);
    }

    public static void main(String[] args) {
        RankWithMemorization rank =  new RankWithMemorization();
        System.out.println(rank.memorizeRank(BigInteger.valueOf(5),2));
    }
}
