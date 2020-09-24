package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int k = 0;
        int sum=0;
        Scanner in = new Scanner(System.in);
        k = in.nextInt();
        int mas[][] = new int[k][k];
        for (int i=0;i<k;i++){
            for (int j=0; j<k; j++){
               // mas [i][j] = in.nextInt();
                mas [i][j] = (int) (Math.random()*40-20);
            }
        }
        for (int i=0;i<k;i++){
            for (int j=0; j<k; j++){
                System.out.print(mas[i][j] +"\t");
            }
            System.out.println();
        }
        for (int i=0;i<k;i++){
            for (int j=0; j<k;j++){
                if(i>0&&j>0){
                    mas[i][j]+=Math.max(mas[i-1][j],mas[i][j-1]);
                }
                else {
                    if (i>0){
                        mas[i][j]+=mas[i-1][j];
                    }
                    else if(j>0){
                        mas [i][j]+=mas[i][j-1];
                    }
                }

            }
        }
       System.out.print(mas[k-1][k-1]);

	// write your code here
    }
}
