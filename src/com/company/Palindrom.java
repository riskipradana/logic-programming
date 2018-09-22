package com.company;

public class Palindrom {

    public static String reverse (String word){
        StringBuilder result = new StringBuilder();

        for (int i = word.length()-1; i>=0; i--){
            result.append(word.charAt(i));
        }

        return result.toString();
    }

    public static boolean isPalindrom(String word){

        StringBuilder result = new StringBuilder();

        for (int i = word.length()-1; i>=0; i--){
            result.append(word.charAt(i));
        }

        if(word.equalsIgnoreCase(result.toString())) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {

        System.out.println(Palindrom.isPalindrom("kataki"));

    }
}
