package org.pattern24.clase27;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.HashMap;

public class PruebaIO {
//    Java IO
    @MiAnotacion(valor = 1, nombre = "Hola")
    public static void main(String [] args) {
        InputStream is; //byte
        OutputStream os; //byte

        Reader r; //Character, Charset (UTF-8)
        Writer w; //Character, Charset (UTF-8)

//        System.in.read();
        System.out.println("Hola");
//        System.err.println("Error");

//        Files
//        Path
        Path tempDir = Path.of("./datos");
        System.out.println(tempDir.getFileName());
        try {
            System.out.println(Files.exists(tempDir));
            Path archivoTmp = Files.list(tempDir)
                    .filter(p -> p.getFileName().toString().endsWith(".tmp"))
                    .findFirst().orElseThrow();
            System.out.println(archivoTmp);
//            try (ObjectInputStream in = new ObjectInputStream(
//                    Files.newInputStream(archivoTmp, StandardOpenOption.READ))) {
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
            try (ObjectInputStream in = new ObjectInputStream(
                    Files.newInputStream(archivoTmp, StandardOpenOption.READ))) {
                System.out.println(in.readObject());
            }
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        Path salida = Path.of("./datos/out.log");
        try (PrintWriter out =
                     new PrintWriter(new OutputStreamWriter(
                Files.newOutputStream(salida, StandardOpenOption.CREATE), "UTF-8")
        )) {
            out.append("prueba out");
            out.append(System.lineSeparator());
            out.append("linea1");
            out.append(System.lineSeparator());
            out.append("linea2");
            out.append(System.lineSeparator());
            out.append("linea3");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
