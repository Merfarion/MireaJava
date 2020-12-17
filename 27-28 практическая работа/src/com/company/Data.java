package com.company;

import java.util.List;

public class Data {
    private List<Integer> numbers;
    private List<String> words;
    private String delimeter;

    public Data(List<Integer> numbers, List<String> words, String delimeter) {
        this.numbers = numbers;
        this.words = words;
        this.delimeter = delimeter;
    }

    public List<Integer> getNumbers() {
        return numbers;
    }

    public void setNumbers(List<Integer> numbers) {
        this.numbers = numbers;
    }

    public List<String> getWords() {
        return words;
    }

    public void setWords(List<String> words) {
        this.words = words;
    }

    public String getDelimeter() {
        return delimeter;
    }

    public void setDelimeter(String delimeter) {
        this.delimeter = delimeter;
    }

    @Override
    public String toString() {
        return "Data{" +
                "numbers=" + numbers +
                ", words=" + words +
                ", delimeter='" + delimeter + '\'' +
                '}';
    }
}
