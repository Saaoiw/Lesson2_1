package com.brainacad.lesson2_1;

/**
 * Created by Таня on 08.09.2016.
 * Write a program to create array of Computer objects (5 pcs.)
 Declare array of Computer objects (5 pcs.), create 5 Computer objects and place it to array (using loop).

 */


public class Laboratory2_1_3 {


    public static void main(String[] args) {
        Computer[] myComps = new Computer[5] ;

        for (int i = 0; i < myComps.length; i++) {
            myComps[i] = new Computer();

        }

    }
}
