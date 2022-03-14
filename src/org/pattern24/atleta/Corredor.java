package org.pattern24.atleta;

public interface Corredor extends Deportista {
    public static final int deporteId = 1100;
    public void correr();

    public default void preparacion() {
        calentar(deporteId);
    }

    private static void calentar(int deporteId) {
        System.out.println("privado: " + deporteId);
    }
}
