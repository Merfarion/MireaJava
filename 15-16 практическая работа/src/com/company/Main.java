package com.company;

import java.util.LinkedList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Graph graph = new Graph();
        int k = 0;
      while (true) {

          if(k==-1){
              break;
          }
          k = sc.nextInt();
          graph.work(k);
      }
      graph.getInstruction();
    }
}
