package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        String[] names = {"Kolly","Molly","Jack"};
        int[]ages = {2,5,7};
        Dog dog1 = new Dog(names[0],ages[0]);
        Dog dog2 = new Dog(names[1],ages[1]);
        Dog dog3 = new Dog(names[2],ages[3]);
	// write your code here
        Dog[] pitomnik = new Dog [] {dog1,dog2,dog3};

    }
}
