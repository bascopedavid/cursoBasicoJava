package org.pattern24.clase6;

import java.time.LocalDate;

public class ManejoPersona {
    public static void main(String... args) {
        //[] -> array
//        [2, 34, 4, 8, 9]
        //... -> vararg variable arguments
        Persona david = new Persona(1234567, "David Bascope Collao", LocalDate.of(1983, 11, 24));
        david.mostrarInformacion("en-US");
        david.mostrarInformacion("es");
        david.mostrarInformacion("fr-FR");
        david.mostrarInformacion("jp");
        if (david.esMayorDeEdad()) {
            System.out.println("Puede vacunarse.");
        } else {
            System.out.println("Vacunacion no disponible.");
        }
        System.out.println("===============");
        Persona bernard = new Persona(9876543, "Bernard", LocalDate.of(2010, 3, 12));
        bernard.mostrarInformacion("en-US");
        if (bernard.esMayorDeEdad()) {
            System.out.println("Puede vacunarse.");
        } else {
            System.out.println("Vacunacion no disponible.");
        }
        System.out.println("===============");
        Persona persona = new Persona(Integer.valueOf(args[0]), args[1], LocalDate.of(Integer.valueOf(args[2]), Integer.valueOf(args[3]), Integer.valueOf(args[4])));
        persona.mostrarInformacion("es");
        if (persona.esMayorDeEdad()) {
            System.out.println("Puede vacunarse.");
        } else {
            System.out.println("Vacunacion no disponible.");
        }
        System.out.println("===============");
        Persona.pruebaVarArgs("a", "b", "c", "d", "e");
        System.out.println("===============");
        Persona.pruebaVarArgs(david, bernard, persona);
    }
}
