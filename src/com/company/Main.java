package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter your name:");
        String name = scanner.nextLine();
        if(name.equalsIgnoreCase("riski")){
            System.out.println("benar");
        }else {
            System.out.println("salah");
        }
    }
}
