package org.pattern24.clase13;

import java.time.LocalDateTime;

public class PruebaArrays {
    public static void main(String variableX []) {
        //Array, arreglo
        char [] texto = {'H', 'O', 'L', 'A'};
        System.out.println(texto);
        System.out.println(texto[2]);
        System.out.println(texto.length);

        String [] texto2 = new String[10];
        texto2[0] = "BIENVENIDO";
        texto2[1] = "A";
        texto2[2] = "PATTERN-24";
        texto2[5] = "PATTERN-24";
        System.out.println("String[]");
        System.out.println(texto2);
        System.out.println(texto2[6]);
        System.out.println(texto2[7]);
        System.out.println(texto2[9]);
        System.out.println(texto2.length);

        String [] texto3 = {"H", "O", "L", "A"};
        System.out.println("String3[]");
        int j = 10;
        for (int i = 0 ; i < texto3.length && j > 8; i++, j--) {
            System.out.println(texto3[i]);
            System.out.println("j:" + j);
        }
        System.out.println(texto3);
        System.out.println(texto3.length);

        String [] texto4 = new String[] {"H", "O", "L", "A", "S", " ", "->" + '\u2605'};
        System.out.println("String[]");
        for (int i = 0; i < texto4.length; i++) {
            System.out.println("pos:" + i + " valor:" + texto4[i]);
            if (i == 3) {
                break;
            }
            if (i == 5) {
                continue;
            }
            if (i % 2 == 0) {
                System.out.println("PAR");
            } else {
                System.out.println("IMPAR");
            }
        }
        System.out.println(texto4);
        System.out.println(texto4.length);

        int numeros [] = new int[10];
        System.out.println("numeros[]");
        System.out.println(numeros[0]);
        System.out.println(numeros[3]);
        System.out.println(numeros[9]);

        boolean booleanos [] = new boolean[10];
        System.out.println("booleanos[]");
        for (boolean valor : booleanos) {
            System.out.println(valor);
        }
        System.out.println(booleanos[0]);
        System.out.println(booleanos[3]);
        System.out.println(booleanos[9]);

        Object[] objetos = {"HOLA", 123, true, LocalDateTime.now(), 'x', 34.2};
        System.out.println("Objectos[]");
        for (Object elemento : objetos) {
            if (elemento.equals(true)) {
                break;
            }
            System.out.println(elemento);
        }
//        System.out.println(objetos[0]);
//        System.out.println(objetos[1]);
//        System.out.println(objetos[2]);
//        System.out.println(objetos[3]);
        System.out.println(objetos.length);

//        int [][] multi = new int[2][3];
        int [][] multi = {{0, 1, 5}, {5, 10}, {1, 2, 3, 4, 5, 6, 7, 8, 9}};
        multi[0][2] = 5;
        multi[1][1] = 15;
        System.out.println(multi[0][0]);
        System.out.println(multi[1][1]);
        System.out.println(multi[0][2]);
        System.out.println("--->" + multi[1][1]);
        System.out.println(multi.length);
        System.out.println(multi[0].length);
        System.out.println(multi[1].length);
        System.out.println(multi[2].length);


    }
}
