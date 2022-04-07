package com.company.estructurascontrol;

public class Bucles {

        public static void main(String[] args) {

                for (int num = 0; num <= 10; num++) {

                        System.out.println("Éste valor es : " + num);//ejemplo de bucle nª1
                }

                String[] tortugasninja = {"Leonardo", "Raphael", "Donnatello", "Michelangelo"};
                for (int num = 0; num < tortugasninja.length; num++) {
                        System.out.println(tortugasninja[num]); //ejemplo de bucle nº2
                }
                String[] tortugasninja2 = {"Leonardo " + "Raphael " + "Donnatello " + "Michelangelo"};
                for (int num = 0; num < tortugasninja2.length; num++) {
                        System.out.println(tortugasninja2[num]); //ejemplo de bucle concatenado
                }
        }
}