package org.pattern24.clase18;

import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;

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
        List<String> lista = Arrays.asList("Pedro", "Luisa", "Ana", "David Eduardo", "Maria", " Xavier");
        lista.set(1, "pedro");
        System.out.println(lista);
        Collections.sort(lista);
        Collections.sort(lista, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.toLowerCase().trim().compareTo(o1.toLowerCase().trim());
            }
        });
        System.out.println(lista);
        Collections.sort(lista, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.length() - o2.length();
            }
        });
        System.out.println(lista);


        Persona juan = new Persona(1234, "Juan Perez");
        Persona ana = new Persona(4321234, "Ana Gonzales");
        Persona luis = new Persona(772992, "Luis Jimenez");
        Persona carlos = new Persona(72003, "Carlos Gomez");

        List<Persona> personas = Arrays.asList(juan, ana, luis, carlos);
        System.out.println("personas:");
        System.out.println(personas);
        Collections.sort(personas);
        System.out.println(personas);
//        new Casa() {
//
//        }
        Collections.sort(personas, new Comparator<Persona>() {
            @Override
            public int compare(Persona o1, Persona o2) {
                return o2.getCarnetIdentidad() - o1.getCarnetIdentidad();
            }
        });
        System.out.println("shuffle0");
        Collections.shuffle(personas);
        System.out.println(personas);
        System.out.println("shuffle1");
        Collections.shuffle(personas);
        System.out.println(personas);
        System.out.println("shuffle2");
        Collections.shuffle(personas);
        System.out.println(personas);

        System.out.println("mapa personas:");
        Map<Integer, Persona> mapaPersona = new HashMap<>();
        mapaPersona.put(2, ana);
        mapaPersona.put(5, juan);
        mapaPersona.put(87, luis);
        mapaPersona.put(21, carlos);
        System.out.println(mapaPersona);

//        Unmodifiable
        Map<Integer, Persona> mapaPersonaReadOnly = Collections.unmodifiableMap(mapaPersona);
//        mapaPersonaReadOnly.remove(2);

//        Synchronized
        Map<Integer, Persona> mapaPersonaSync = Collections.synchronizedMap(mapaPersona);
        mapaPersonaSync.remove(2);

//        Copy-on-write
        List<Persona> mapaPersonaCopy = new CopyOnWriteArrayList<Persona>(personas);
        mapaPersonaCopy.add(ana);
        mapaPersonaCopy.get(2);
    }
}
