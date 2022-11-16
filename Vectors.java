package com.ejerciciosfinales;

import java.util.Vector;

public class Vectors {

    public static void main (String[] args){
        Vector vector = new Vector(20, 5);


        Vector<String> v = new Vector<>();
        v.addElement("one");
        v.addElement("two");
        v.addElement("three");
        v.addElement("four");
        v.addElement("five");

        v.removeElement("two");
        v.removeElement("three");


        System.out.println("number of elements "+v.size());
        System.out.println("dimension "+v.capacity());

    }
}
// Creating a vector, and eliminating some elements from it