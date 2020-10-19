package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Employee gleb  = new Employee();
        try {
            int b = Integer.parseInt(new Scanner(System.in).nextLine());
            gleb.addAge(b);

        }
       catch (ThrowException ex){
           System.out.println("error");
       }
        catch (NumberFormatException vv){
            System.out.println("Incorrect input format");
        }
        finally {
            System.out.println(gleb);
        }
        throw new ThrowRuntimeException();
	// write your code here
    }
}
