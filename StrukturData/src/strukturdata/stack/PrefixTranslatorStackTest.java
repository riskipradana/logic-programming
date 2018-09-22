/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strukturdata.stack;

import java.util.Scanner;

/**
 *
 * @author riskipradana
 */
public class PrefixTranslatorStackTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the expression that you want to convert to prefix.");
        String expression = input.next();
        PrefixTranslatorStack translator = new PrefixTranslatorStack(expression);
        System.out.println(translator.translate());
    }
}
