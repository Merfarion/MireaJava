package com.company;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> mas  = new ArrayList<>(10);

        for (int i = 0;i<10;i++){
int p = in.nextInt();
mas.add(i,p);
        }
        int i =0;
        int sum1=0;
        int sum2=0;
        int sum3=0;

        while (i<10){
            int t = mas.get(i);
           sum1+= t;
            i++;
        }
        System.out.println("sum1= "+ sum1);
        i=0;
        do{
            int t = mas.get(i);
            sum2+= t;
            i++;
        }while(i<9);
        System.out.println("sum2= "+ sum2);
            for (int k =0; k<10;k++){
                int t = mas.get(k);
                sum3+= t;
            }
        System.out.println("sum3= "+ sum3);

        for (String str:args){
            System.out.println("аргумент = "+ str);
        }
        for (int k =1; k<=10;k++){
            double a =0;
            a= 1/k;
           System.out.printf("%f ",a);
        }
        System.out.println();
        int a =2;
        int b =20;
        int kol = a+ (int) (Math.random()*b);
        int mas2 []= new int [kol];
        for (int g= 0;g<kol;g++){
            int h = a+ (int) (Math.random()*b);
            mas2[g]= h;
        }
        for (int g= 0;g<kol;g++){
            int h =mas2[g];
            System.out.print(h + " ");
        }
        System.out.println();
        for (int w =0;w<kol;w++){
            for (int y = 0;y< kol-1;y++){
                int f = mas2[y];
                int u = mas2[y+1];
                int temp =0;
                if(f>u){
                temp = mas2[y];
                mas2[y]= mas2[y+1];
                mas2[y+1]=temp;
                }
            }
        }
        for (int g= 0;g<kol;g++){
            int h =mas2[g];
            System.out.print(h + " ");
        }
        System.out.println();
        Random r = new Random();
        int dif= b-a;
        kol = r.nextInt(dif);
        int mas3 [] = new int[kol];
        for (int g= 0;g<kol;g++){
            int h = r.nextInt(dif);
            mas3[g]=h;
        }
        for (int g= 0;g<kol;g++){
            int h =mas3[g];
            System.out.print(h+ " ");
        }
        System.out.println();
        for (int w =0;w<kol;w++){
            for (int y = 0;y< kol-1;y++){
                int f = mas3 [y];
                int u = mas3[y+1];
                int temp =0;
                if(f>u){
                temp=mas3[y];
                mas3[y]=mas3[y+1];
                mas3[y+1] = temp;

                }
            }
        }
        for (int g= 0;g<kol;g++){
            int h =mas3[g];
            System.out.print(h+" ");
        }
        System.out.println();
        System.out.println("Введите число для факториала");
        int fac = in.nextInt();
        int fact =1;
        for(int w=1;w <=fac;w++){
            fact*=w;
        }
        System.out.println(fact);
        System.out.println(factorial(fac));
        if (fact == factorial(fac)){
            System.out.print("Все верно");
        }
	// write your code here
    }
    static int factorial( int fac) {
        int fact =1;
        for(int w=1;w <=fac;w++){
            fact*=w;
        }
        return fact;
    }
}
