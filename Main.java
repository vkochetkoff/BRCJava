package com.brc;

public class Main {

    public static void main(String[] args) {
        System.out.println(min(5,1,10));

    }
    public static int min(int a, int b, int c) {
        if (a <= b && a <= c) {
            return a;
        } else if
        (b <= c) {
            return b;
        } else {
            return c;
        }
    }

}
