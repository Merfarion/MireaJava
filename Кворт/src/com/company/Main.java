package com.company;

import java.time.Instant;
import java.util.Scanner;
import java.time.Duration;
public class Main {

    public static void main(String[] args) {
        Instant start = Instant.now();

        Scanner in = new Scanner(System.in);
       int N = in.nextInt();
        int k=0, b=1,c=0;
        for (int i=1; i<N;i++){
            if (i<=13){
                if(k==12) {
                    k = 0;
                    c += 1;
                }
                k++;
                if (k==1 || k==3|| k==6){
                    b+=c;
                }
                else {
                    b+=c+1;
                }
            }
            else{
                if (k==15){
                    k = 0;
                    c += 1;
                }
                k++;
                if (k==1 || k==3||k==4|| k==6||k==9){
                    b+=c;
                }
                else {
                    b+=c+1;
                }
            }


        }
        System.out.println(b);
        Instant finish = Instant.now();
        long elapsed = Duration.between(start,finish).toMillis();
        System.out.println(elapsed);


    }
}
