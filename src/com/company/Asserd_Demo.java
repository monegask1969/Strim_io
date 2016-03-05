package com.company;

/**
 * Created by moneg on 05.03.2016.
 */
public class Asserd_Demo {
    static int val = 3;

    static int getnum(){return val--;}

    public static void main(String[] args) {
        int n;
        for (int i = 0; i < 10; i++) {
            n = getnum();

            assert n>0;

            System.out.println("n is " + n);
        }
    }
}
