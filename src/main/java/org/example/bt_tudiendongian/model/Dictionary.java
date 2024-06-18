package org.example.bt_tudiendongian.model;

public class Dictionary {
    private String word ;
    private String mean;

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public String getMean() {
        return mean;
    }

    public void setMean(String mean) {
        this.mean = mean;
    }

    public Dictionary() {
    }

    public Dictionary(String word, String mean) {
        this.word = word;
        this.mean = mean;
    }
}
