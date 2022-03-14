package org.pattern24.clase17;

import java.util.*;

public class PruebaCollection {
    public static void main(String [] args) {
        Integer[][] a = new Integer[10][10];
        List<List<String>> a1 = new ArrayList<>();
        a1.add(new ArrayList<>());
        a1.add(Arrays.asList("a", "b", "c"));
        a1.add(Arrays.asList("X", "Y"));
        for (List<String> l1 : a1) {
            System.out.println("Longitud:" + l1.size());
            for (String s1 : l1) {
                System.out.println(s1);
            }
            System.out.println("-");
        }

//        List<List<List<List<List<String>>>>> x1 = new ArrayList<>();

        Map<String, String> mapa = new HashMap<>(); //16
        mapa.put("a", "valor1");
        System.out.println(mapa);
        mapa.put("b", "valor1");
        System.out.println(mapa);
        mapa.put("c", "valor2");
        System.out.println(mapa);
        mapa.put("a", "valor2");
        System.out.println(mapa);
        mapa.put("c", "valor3");
        System.out.println(mapa);
        System.out.println("Keys:");
        for (String k : mapa.keySet()) {
            System.out.println(k);
            System.out.println(mapa.get(k));
        }
        System.out.println("Values:");
        for (String v : mapa.values()) {
            System.out.println(v);
        }
        System.out.println(mapa.containsKey("x"));
        System.out.println(mapa.containsValue("valor2"));
        System.out.println(mapa.replace("a", "nuevoValor"));
        System.out.println(mapa.remove("b"));
        for (Map.Entry<String, String> e : mapa.entrySet()) {
            System.out.println(e.getKey() + " = " + e.getValue());
        }
        System.out.println(mapa.get("x"));
        System.out.println(mapa.getOrDefault("x", "NO EXISTE"));
        Map<String, Integer> mapa2 = new HashMap<>();
        System.out.println(mapa2.get("x"));
        System.out.println(mapa2.getOrDefault("x", -1));
        Map<String, Object> mapa3 = Collections.EMPTY_MAP;
        List<Object> lista = Collections.EMPTY_LIST;
//        new ArrayList<>();
        Collections.sort(lista, new Comparator<Object>() {
            @Override
            public int compare(Object o1, Object o2) {
                return 0;
            }
        });
    }
}
