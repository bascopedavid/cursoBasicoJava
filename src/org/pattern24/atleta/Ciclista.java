package org.pattern24.atleta;

public interface Ciclista extends Deportista {
    default void haceBici(){
        System.out.println("Bici");
    }

}
