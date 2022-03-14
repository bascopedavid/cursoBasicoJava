package org.pattern24.clase5;

import java.time.LocalDate;

public class ManejoPersona {
    public static void main(String [] args) {
        Persona david = new Persona(1234567, "David Bascope Collao", LocalDate.of(1983, 11, 24));
        david.mostrarInformacion("en-US");
        david.mostrarInformacion("es");
        david.mostrarInformacion("fr-FR");
        david.mostrarInformacion("jp");
    }
}
