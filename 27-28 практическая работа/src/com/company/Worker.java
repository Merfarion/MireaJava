package com.company;

public class Worker {
    @MyAnnotation(someField = "sum")
    public void work1(Data data) {
        int sum = 0;
        for (int i = 0; i < data.getNumbers().size(); i++) {
            sum += data.getNumbers().get(i);
        }
        System.out.println(sum);
    }

    @MyAnnotation(someField = "print")
    public void work2(Data data) {
        for (int i = 0; i < data.getWords().size(); i++) {
            System.out.print(data.getWords().get(i));
            if (i != data.getWords().size() - 1)
                System.out.print(data.getDelimeter());
        }
    }
}
