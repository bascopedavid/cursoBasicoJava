package org.pattern24.atleta;

public interface Nadador extends Deportista {
    public void nadar();

    public default void preparacion() {
        System.out.println("preparacion natacion");
    }
}
