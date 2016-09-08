package com.brainacad.lesson2_1;

/**
 * Created by Таня on 08.09.2016.
 * Add to class Computer method void view (){} that prints all fields of object in line.
 Print all info (fields) of all objects in console.

 */
public class Laboratory2_1_5 {
    public static void main(String[] args) {
        Computer[] myComps = new Computer[5] ;

        for (int i = 0; i < myComps.length; i++) {
            myComps[i] = new Computer();
            //myComps[i].viev();
            System.out.println(myComps[i]);
        }


    }
}
