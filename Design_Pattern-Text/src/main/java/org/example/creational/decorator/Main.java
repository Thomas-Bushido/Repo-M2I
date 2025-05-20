package org.example.creational.decorator;

public class Main {
    public static void main(String[] args) {
        Text text1 = new UpperCase("Ceci est un test");
        text1.text();
        System.out.println(text1.text());

        Text text2 = new EndOfSentence();
    }



}
