package org.pattern24.clase14;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

public class PruebaArrays {
    public static void main(String [] args) {
        //Array, arreglo

        int [][] multi = {{0, 1, 5, 4}, {5, 10}, {1, 2, 3, 4, 5, 6, 7, 8, 9}};
        System.out.println(multi);
        afuera: //label
        for (int i = 0; i < multi.length; i++) {
            System.out.println("longitud:" + multi[i].length);
            adentro:
            for (int j = 0; j < multi[i].length; j++) {
                if (multi[i][j] == 4) {
//                    continue afuera;
                    break afuera;
                }
                System.out.println(multi[i][j]);
            }
            System.out.println("fin loop");
        }
        System.out.println("FIN");

        System.out.println("argumentos:" + args.length);
        int c = 0;
        while (c < args.length) {
            System.out.println(args[c]);
            c++;
        }

        int d = 0;
        doWhile:
        do {
            if (args.length == 0) {
                break doWhile;
            }
            System.out.println(args[d]);
            d++;
        } while (d < args.length);

//        Producto[] pedido = new Producto[300];????
        System.out.println("Lista");
        List<Integer> numeros = Arrays.asList(14, 2, 24, 83, 21, 93, 21);
        System.out.println(numeros.size());
        System.out.println(numeros);
        System.out.println(numeros.get(0));
//        numeros.add(67);
//        numeros.remove(1);
        numeros.set(1, 21);
        System.out.println(numeros.size());
        System.out.println(numeros);
        System.out.println(numeros.contains(251));
        System.out.println(numeros.indexOf(21));
        System.out.println(numeros.lastIndexOf(2111));
//        numeros.clear();
        System.out.println(numeros.size());
        System.out.println(numeros);


    }
}
