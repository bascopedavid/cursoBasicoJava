package org.pattern24;

//modifiers
//public - todos
//protected - paquete y subclases
//default - solo en el paquete (vacio)
//private - solo en la misma clase
public class Clase2 {

    public static void main(String[] args) {
	// write your code here
        char [] texto = {'H', 'O', 'L', 'A'};
        String hola = "Hola";
        System.out.println("char[]=" + texto);
        System.out.println("String(U)=" + hola.toUpperCase());
        System.out.println("String=" + hola);
        hola = hola + " Mundo";
        hola = "Adios1";
        hola = "Adios2";
        hola = "Adios3";
        System.out.println("String=" + hola);
        String a = 1 + 1 + "a";
        System.out.println("A=" + a);
        String b = "b" + 1 + 1;
        System.out.println("B=" + b);
        String c = "c" + (1 + 1);
        System.out.println("C=" + c);
        String adios = new String("Adios");
        adios = new String(hola);
        adios = hola;

        StringBuilder texto2 = new StringBuilder("Hola");
        texto2.append(" Mundo");
        texto2.append(", bienvenidos a Pattern24");
        System.out.println("SB=" + texto2.toString().toLowerCase());
        System.out.println("SB=" + texto2.toString().length());
        System.out.println("SB=" + texto2.toString().charAt(0));
        System.out.println("SB=" + texto2.toString().charAt(34));
        System.out.println("SB=" + texto2.toString().indexOf("Bien"));

        byte byteVar;
        Byte byteType = 0;
        byteVar = byteType.byteValue();
        short shortVar;
        Short shortType = 1000;
        shortVar = shortType.byteValue();
        int intVar = 2;
        Integer intType = 4;
        intType.compareTo(intVar);
        long longVar = 0;
        Long longType = 3L;
        longType.equals(longVar);
        float floatVar = 0;
        Float floatType = 0F;
        floatType.isInfinite();
        double doubleVar = 0;
        Double doubleType = 0D;
        doubleType.toString();
        boolean booleanVar = false;
        Boolean booleanType = false;
        booleanType.booleanValue();
        char charVar = 'a';
        Character charType = 'a';
        charType.toString();


    }
}
