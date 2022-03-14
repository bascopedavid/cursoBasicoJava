package org.pattern24.clase26;

import java.io.IOException;
import java.util.logging.Logger;

public class PruebaExceptions {

    private static final Logger LOGGER = Logger.getLogger(PruebaExceptions.class.getName());

//    Throwable
//    Exception -> checked exception
//        SQLException
//        IOException
//        FileNotFoundException
//        .........
//        RuntimeException *
//            ArithmeticException
//            NullPointerException
//    Error -> unchecked exception (runtime)
//        AssertionError
//        OutOfMemoryError
//        ....
    private static int dividir(int a, int b) {
        try {
            return a / b;
        } catch (ArithmeticException e) {
//            LOGGER.severe(e.getLocalizedMessage());
            e.printStackTrace();
            return Integer.MAX_VALUE;
        }
    }

    private static int dividir1(int a, int b) {
        return a / b;
    }

    private static int dividir2(int a, int b) throws ArithmeticException {
        return a / b;
    }

    private static int dividir3(int a, int b) {
        try {
            return dividir2(a, b);
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    private static void test() throws IOException {
        System.out.println("test");
        throw new IOException("Este es mi Custom Error");
    }

    private static void runtime() {
        System.out.println("runtime");
        throw new RuntimeException("Error en runtime");
    }

    private static void customException() throws ProductoException {
        System.out.println("custom");
        throw new ProductoException("Error al definir un producto");
    }

    public static void main(String [] args) {
        int a = 10;
        int b = 10;
        System.out.println(dividir3(a, b));
        try {
            test();
            System.out.println("NO SE EJECUTA");
            System.out.println("NO SE EJECUTA");
            System.out.println("NO SE EJECUTA");
            System.out.println("NO SE EJECUTA");
            System.out.println("NO SE EJECUTA");
        } catch (IOException e) {
            System.out.println(e.getMessage());
            System.out.println("SI SE EJECUTA");
        }
//        runtime();
        try {
            customException();
        } catch (ProductoException e) {
            e.printStackTrace();
        }

        System.out.println("===============");

        try {
            dividir2(a, b);
            test();
            runtime();
            customException();
        } catch (IOException | RuntimeException | ProductoException e) {
            e.printStackTrace();
        } finally {
            System.out.println("finally");
        }

        //auto-closure -> no necesita finally para cerrar
        //java.io -> Input / Output Streams.
        // Reader / Writer,
        // Standard Input / Output
//        try (auto-closeable code) {
//           xxxx
//        } catch (Exception e) {
//            yyyy
//        }

        System.out.println("fin");
    }
}
