package com.brainacad.lesson2_1;

/**
 * Created by Таня on 08.09.2016.
 * Write a program, that iterate through array of Computer objects and increases by 10 percent field price.
 */
public class Laboratory2_1_4 {

    public static void main(String[] args) {
        Computer[] myComps = new Computer[5] ;

        for (int i = 0; i < myComps.length; i++) {
            myComps[i] = new Computer();

        }

        for (int i = 0; i < myComps.length; i++) {
            myComps[i].setPrice(myComps[i].getPrice()*1.1F);

        }
    }
}
