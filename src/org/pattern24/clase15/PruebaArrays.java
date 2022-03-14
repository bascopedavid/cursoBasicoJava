package org.pattern24.clase15;

import org.pattern24.clase12.Producto;

import java.util.*;
import java.util.concurrent.ArrayBlockingQueue;

public class PruebaArrays {
    public static void main (String [] args) {
        int [] numeros = {14, 2, 24, 83, 21, 93, 21};
        System.out.println("numeros original:" + numeros.length);

        int [] numeros2 = Arrays.copyOf(numeros, 10);
        numeros2[7] = 31;
        numeros2[8] = 41;
        numeros2[9] = 5;
        System.out.println("numeros extendido:" + numeros2.length);
        System.out.println(numeros2[7]);
        System.out.println(numeros2[8]);
        System.out.println(numeros2[9]);
        numeros2 = Arrays.copyOf(numeros2, numeros2.length + 5);
        System.out.println("numeros extendido:" + numeros2.length);
        numeros2 = Arrays.copyOf(numeros2, numeros2.length + 5);
        System.out.println("numeros extendido:" + numeros2.length);
        numeros2 = Arrays.copyOf(numeros2, numeros2.length + 5);
        System.out.println("numeros extendido:" + numeros2.length);
        numeros2 = Arrays.copyOf(numeros2, numeros2.length + 5);
        System.out.println("numeros extendido:" + numeros2.length);
        numeros2[24] = 123;

        List<String> textos = Arrays.asList("hola", "bienvenido", "a", "pattern-24");
        System.out.println(textos.size());
//        textos = (List<String>) Arrays.asList(Arrays.copyOf(textos.toArray(), textos.size() + 5));
        String[] s1 = new String[2];
        System.out.println(s1.length);
        s1[0] = "A";
        s1[1] = "B";
        System.out.println(s1);
//        s1[2] = "C";

        System.out.println("-----------");
        //Collections
        List<String> strings = new ArrayList<String>();
        strings.add("A"); //xxxx
        strings.add("B");
        strings.add("C");
        strings.add("D"); //X xxx
        strings.add("f");
        strings.add("F");
        System.out.println(strings);
        strings.add(4, "X");
//        strings.set(4, "X");
        System.out.println(strings);
        strings.remove("A");
        System.out.println(strings);
        strings.remove(2);
        System.out.println(strings);
        System.out.println(strings.size());
        strings.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.toLowerCase().charAt(0) - o1.toLowerCase().charAt(0);
            }
        });
        System.out.println(strings);
        List<Producto> lp = new ArrayList<>();
        lp.sort(new Comparator<Producto>() {
            @Override
            public int compare(Producto o1, Producto o2) {
                return o1.getPrecio().intValue() - o2.getPrecio().intValue();
            }
        });

        System.out.println("Otros collections:");
        List<Long> l1 = new ArrayList<>();
        l1.add(1L);
        l1.add(2L);
        l1.add(1L);
        l1.add(3L);
        l1.add(1L);
        l1.add(1L);
        System.out.println(l1.size());
        System.out.println(l1);
        System.out.println(l1.get(3));
        Set<Long> set1 = new HashSet<>();
//        Set<Long> set1 = new HashSet<>(16);
//        Set<Long> set1 = new HashSet<>(16, 0.75);
        set1.add(1L);
        set1.add(2L);
        set1.add(1L);
        set1.add(3L);
        set1.add(1L);
        set1.add(1L);
        set1.add(1L);
        set1.add(1L);
        set1.add(-1L);
        set1.add(1L);
        set1.add(-11L);
        System.out.println(set1.size());
        System.out.println(set1);
//        System.out.println(a1.size());
        SortedSet<Long> b1 = new TreeSet<>();
        b1.add(2L);
        b1.add(1L);
        b1.add(1L);
        b1.add(1L);
        b1.add(3L);
        b1.add(1L);
        b1.add(-1L);
        System.out.println(b1.size());
        System.out.println(b1);
        Deque<Integer> i1 = new ArrayDeque<>(3);
        i1.addFirst(2);
        System.out.println(i1);
        i1.addFirst(1);
        System.out.println(i1);
        i1.addFirst(10);
        System.out.println(i1);
        i1.addLast(8);
        System.out.println(i1);
        i1.offerFirst(3);
        System.out.println(i1);
        System.out.println(i1.size());
        System.out.println(i1.getFirst());
        System.out.println(i1.size());
        System.out.println(i1.getLast());
        System.out.println(i1.size());
        System.out.println(i1.pollFirst());
        System.out.println(i1.size());
        System.out.println(i1.pollLast());
        System.out.println(i1.size());
        System.out.println(i1.pollFirst());
        System.out.println(i1.pollFirst());
        System.out.println(i1.pollFirst());
        System.out.println(i1.pollFirst());
        System.out.println(i1.pollFirst());
        System.out.println(i1.pollFirst());
        System.out.println(i1.peekFirst());
//        System.out.println(i1.getFirst()); exception
        i1.offerFirst(4);
        System.out.println(i1.size());

//        List<String> x1 = new ArrayList<>();
//        System.out.println(x1.get(0));

//        queue: FIFO First In, First Out
//        9, 8, 6, 1, 2, 3, 4, 5, 7
    }
}
