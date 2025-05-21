package org.example.creational.decorator;

public class UpperCase implements Text{
    private String words;

    public UpperCase(String words) {
        this.words = words;
    }

    public String getWords() {
        return words;
    }

    public void setWords(String words) {
        this.words = words;
    }


    @Override
    public String text() {
        return this.words.toUpperCase();
    }
}
