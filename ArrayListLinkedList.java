package com.ejerciciosfinales;

import java.util.ArrayList;
import java.util.LinkedList;

public class ArrayListLinkedList {

    public static void main(String[] args) {



        ArrayList<String> nombreArrayList = new ArrayList<String>();

        // Añadimos 4 Elementos en el ArrayList
        for (int i = 1; i <= 4; i++) {
            nombreArrayList.add("Element " + i);
            System.out.println(nombreArrayList);
        }

                LinkedList<String> nombreArrayList2 = new LinkedList<String>();
                nombreArrayList2.add("Element 1");
                nombreArrayList2.add("Element 2");
                nombreArrayList2.add("Element 3");
                nombreArrayList2.add("Element 4");
                System.out.println(nombreArrayList2);


    }
}