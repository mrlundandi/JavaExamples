package com.ejerciciosfinales;

import java.util.Scanner;

public class ArrayUnidim {

        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            int StudentNumber, i;
            double add = 0, mean;

            do {
                System.out.print("Number of students in class: ");
                StudentNumber = sc.nextInt();
            } while (StudentNumber <= 0);

            double[] grades = new double[StudentNumber]; //se crea el array

            // Entrada de datos. Se asigna a cada elemento del array
            // la nota introducida por teclado

            for (i = 0; i < grades.length; i++) {
                System.out.print("Student " + (i + 1) + " Final Grade: ");
                grades[i] = sc.nextDouble();
            }

            // Sumar todas las notas
            for (i = 0; i < grades.length; i++) {
                add = add + grades[i];
            }

            // Calcular la media
            mean = add / grades.length;

            // Mostrar la media
            System.out.printf("Average course grades : %.2f %n", mean);

            // Mostrar los valores superiores a la media
            System.out.println("List of above average grades: ");
            for (i = 0; i < grades.length; i++) {
                if (grades[i] > mean) {
                    System.out.println("Student Number " + (i + 1)+ " Final Grade: " + grades[i]);
                }
            }
        }
    }

