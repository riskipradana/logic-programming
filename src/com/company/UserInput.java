package com.company;

public class UserInput {

    public static class TextInput {

        String result = "";

        public void add(char input){
            result += input;
        }

        public String getValue(){
            return result;
        }

    }

    public static class NumericInput extends TextInput{

        @Override
        public void add(char input) {
            if(Character.isDigit(input)){
                super.add(input);
            }
        }

        @Override
        public String getValue() {
            return super.getValue();
        }
    }

    public static void main(String[] args) {
        TextInput input = new NumericInput();
        input.add('1');
        input.add('a');
        input.add('0');
        System.out.println(input.getValue());
    }

}
