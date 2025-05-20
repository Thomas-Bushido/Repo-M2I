package org.example.creational.decorator;

public class EndOfSentence extends UpperCase{


    public EndOfSentence(Text text) {
        super(text);
    }
    @Override
    public String text() {
        return super.text()+ "End of this sentence";
    }
}
