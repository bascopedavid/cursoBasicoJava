package org.pattern24.clase24;

import org.w3c.dom.ls.LSOutput;

import java.util.*;
import java.util.function.Consumer;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PruebaStreams {
    public static void main(String [] args) {
        List<Integer> numeros = Arrays.asList(2, 4, 1, 8, 9, 12, 8, 24, 7, 0);
        Stream<Integer> miStream = numeros.stream();
        //ACCIONES
//        miStream.forEach(new Consumer<Integer>() {
//            @Override
//            public void accept(Integer integer) {
//                System.out.println(integer);
//            }
//        });
        Consumer<Integer> consumer = integer -> System.out.println("C1:" + integer);
//        miStream.forEach(consumer);

//        miStream.forEach(System.out::println);
//        miStream.forEachOrdered(System.out::println);
//        numeros.stream().peek(i -> System.out.println("Leyendo: " + i))
//                .forEach(System.out::println);
//        System.out.println("------");
//            numeros.parallelStream().peek(i -> System.out.println("Leyendo: " + i))
//                .forEachOrdered(System.out::println);
//        System.out.println("------");
//
//        Consumer<Integer> consumer2 = integer -> System.out.println("C2:" + integer * 2);
//        numeros.stream().forEach(consumer.andThen(consumer2)
//                .andThen(consumer)
//                .andThen(i -> System.out.println("C3:" + i/2)));

        //FILTROS
//        numeros.stream().filter(new Predicate<Integer>() {
//            @Override
//            public boolean test(Integer integer) {
//                return integer % 2 != 0;
//            }
//        }).forEach(consumer);
//        Predicate<Integer> predicate = p -> p % 2 != 0;
//        Predicate<Integer> predicate1 = p -> p > 9;
//        numeros.stream().filter(Predicate.not(predicate.or(predicate1))).forEach(consumer);

        //MAPPING
//        Function<Integer, String> function = integer -> "Valor: " + integer;
//        Function<String, Character> function2 = string -> string.charAt(7);
//        numeros.stream().map(function.andThen(function2)).
//                forEach(System.out::println);
//        numeros.stream().mapToDouble(i -> (double) i / 3).forEach(d -> System.out.println(d));

        //JOIN STREAMS
        List<List<String>> strings = new ArrayList<>();
        strings.add(Arrays.asList("qwe", "1234", "ssdwweeasdas"));
        strings.add(Arrays.asList("2221", "NNNIONIQWW", "7687631627839126"));
        strings.add(Arrays.asList("797382917312312", "1234", "x"));
//        strings.stream().flatMapToInt(new Function<List<String>, IntStream>() {
//            @Override
//            public IntStream apply(List<String> lista) {
//                return lista.stream().filter(s -> s.length() > 10)
//                        .mapToInt(s -> s.length());
//            }
//        }).forEach(s -> System.out.println(s));

//        numeros.stream().distinct()
//                .sorted()
//                .skip(2)
//                .limit(5)
//                .takeWhile(p -> p != 9)
//                .dropWhile(p -> p != 9)
//                .forEach(i -> System.out.println(i));
        boolean x = numeros.stream().distinct()
//                .anyMatch(p -> p < 0);
//                .allMatch(p -> p >= 0);
                .noneMatch(p -> p < 0);
//        System.out.println(x);

//        List<Integer> numeros2 = new ArrayList<>();
//        System.out.println(numeros2.stream().findFirst().orElse(-1));

        //Reduce operations
        List<String> nombres = Arrays.asList("Juan", "Ana", "Jorge", "Bernard", "Lucia");
        List<String> nombres2 = new ArrayList<>();
        Optional<String> red1 = nombres.stream()
                .reduce((s1, s2) -> s1 + "-" + s2);
//        System.out.println(red1.orElse("NADA"));

        String red2 = nombres.stream()
                .reduce("NADA", (s1, s2) -> s1 + "-" + s2);
//        System.out.println(red2);

        String red3 = nombres.parallelStream()
                .reduce("NADA",
                        (s1, s2) -> s1 + "-PRUEBA" ,
                        (sa1, sa2) -> "X-" + sa2);
//        System.out.println(red3);

        //Collect operations
        System.out.println("PARES:");
        List<Integer> pares = new ArrayList<>();
//        numeros.stream()
//                .filter(p -> p % 2 == 0)
//                .sorted((n0, n1) -> n1 - n0)
////                .forEach(n -> System.out.println(n));
//                .forEach(n -> pares.add(n));
        pares = numeros.stream()
                .filter(p -> p % 2 == 0)
                .sorted((n0, n1) -> n1 - n0)
                .peek(c -> {
                    if (c > 10) {
                        System.out.println(c);
                    }
                })
                .collect(Collectors.toList());

        System.out.println(pares);

        System.out.println("IMPARES:");
        List<Integer> impares = numeros.stream()
                .filter(p -> p % 2 != 0)
                .collect(Collectors.toList());
        System.out.println(impares);

        DoubleSummaryStatistics stats = numeros.stream()
                .collect(Collectors.summarizingDouble(p -> p));
        System.out.println("Promedio: " + stats.getAverage());
        System.out.println("Sumatoria: " + stats.getSum());
        System.out.println("Cantidad: " + stats.getCount());
        System.out.println("Minimo: " + stats.getMin());
        System.out.println("Maximo: " + stats.getMax());
        System.out.println("");

        String downstream = nombres.stream()
                .sorted()
                .collect(Collectors.mapping(s -> s.substring(0, 1), Collectors.joining("-")));
        System.out.println("linea:142 " + downstream);

        Map<Boolean, List<String>> nombresLargos = nombres.stream()
                .collect(Collectors.partitioningBy(p -> p.length() > 4));
        System.out.println(nombresLargos);

        Map<Boolean, List<Integer>> paresImpares = numeros.stream()
//                .parallel()
                .sorted()
//                .parallel()
                .collect(Collectors.partitioningBy(n -> n % 2 == 0));
        System.out.println(paresImpares);
        pares = paresImpares.get(true);
        impares = paresImpares.get(false);

        Map<Integer, List<String>> agrupados = nombres.stream()
                .collect(Collectors.groupingBy(s -> s.length()));
        System.out.println(agrupados);

        Map<Character, List<String>> agrupados2 = nombres.stream()
                .parallel()
                .collect(Collectors.groupingBy(s -> s.charAt(0)));
        System.out.println(agrupados2);

        //floatMapping
        //filtering

    }
}
