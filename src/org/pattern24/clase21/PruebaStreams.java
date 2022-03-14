package org.pattern24.clase21;

import org.pattern24.clase19.Producto;

import java.util.Arrays;
import java.util.List;
import java.util.function.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PruebaStreams {
    public static void main(String [] args) {
        List<Integer> numeros = Arrays.asList(2, 4, 1, 8, 9, 12, 8, 24, 7, 0);
        Stream<Integer> miStream = numeros.stream();
        //Pipeline
        //Itermedias
//        miStream.filter();
//        miStream.map();
//        miStream.flatMap();
//        miStream.peek();
//        miStream.sorted();
//        miStream.skip();
//        miStream.limit(); //short circuit
//        miStream.takeWhile(); //short circuit
//        miStream.filter().map().flatMap().peek().sorted().skip().limit();
//        //Terminales
//        miStream.count();
//        miStream.max();
//        miStream.min();
//        miStream.sum();
//        miStream.average();
//        miStream.collect();
//        miStream.reduce();
//        miStream.anyMatch();
//        miStream.findAny();
//        miStream.findFirst();
//        miStream.forEach();
//        miStream.forEachOrdered();
        System.out.println(miStream);
        //Functional interfaces
        //Basic Functions
//        Predicate => tests (true/false) condiciones
        Predicate<Integer> predicado = new Predicate<Integer>() {
            @Override
            public boolean test(Integer integer) {
                return false;
            }
        };
//        Function => convertir tipos
        Function<Integer, Producto> funcion = new Function<Integer, Producto>() {
            @Override
            public Producto apply(Integer s) {
                return null;
            }
        };
//        UnaryOperator => convertir valores
        UnaryOperator<String> operadorUnario = new UnaryOperator<String>() {
            @Override
            public String apply(String s) {
                return null;
            }
        };
//        Consumer => procesar
        Consumer<Integer> consumer = new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) {
                System.out.println(integer);
            }
        };
//        Supplier => producir
        Supplier<Integer> supplier = new Supplier<Integer>() {
            @Override
            public Integer get() {
                return null;
            }
        };

        //BiConsumer Functions
        BiPredicate<String, Integer> biPredicate = new BiPredicate<String, Integer>() {
            @Override
            public boolean test(String s, Integer integer) {
                return false;
            }
        };
        BiFunction<String, Integer, Producto> biFunction = new BiFunction<String, Integer, Producto>() {
            @Override
            public Producto apply(String s, Integer integer) {
                return null;
            }
        };
        BinaryOperator<Integer> binaryOperator = new BinaryOperator<Integer>() {
            @Override
            public Integer apply(Integer integer, Integer integer2) {
                return null;
            }
        };
        BiConsumer<String, Integer> biConsumer = new BiConsumer<String, Integer>() {
            @Override
            public void accept(String s, Integer integer) {

            }
        };
    }
}
