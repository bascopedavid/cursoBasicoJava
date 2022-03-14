package org.pattern24.atleta;

public class TriAtleta implements Ciclista, Corredor, Nadador {

    @Override
    public void haceBici() {
        System.out.println("Bici en triatlon");
    }

    @Override
    public void correr() {
        System.out.println("corre");
    }

    @Override
    public void preparacion() {
        System.out.println("preparacion triatlon");
    }

    @Override
    public void nadar() {
        System.out.println("nada");
    }

    public static void main(String[]xxx) {
        TriAtleta triAtleta = new TriAtleta();
        triAtleta.preparacion();
        triAtleta.haceBici();
        triAtleta.correr();
        triAtleta.nadar();

        System.out.println("triAtleta es triAtleta: " + (triAtleta instanceof TriAtleta));
        System.out.println("triAtleta es ciclista: " + (triAtleta instanceof Ciclista));
        System.out.println("triAtleta es Corredor: " + (triAtleta instanceof Corredor));
        System.out.println("triAtleta es Nadador: " + (triAtleta instanceof Nadador));
        System.out.println("triAtleta es DeporteOlimpico: " + (triAtleta instanceof DeporteOlimpico));

        Ciclista soloCiclismo = new TriAtleta();
        soloCiclismo.haceBici();
        System.out.println("soloCiclismo es triatleta: " + (soloCiclismo instanceof TriAtleta));
        System.out.println("soloCiclismo es Ciclista: " + (soloCiclismo instanceof Ciclista));
        System.out.println("soloCiclismo es Corredor: " + (soloCiclismo instanceof Corredor));
        System.out.println("soloCiclismo es Nadador: " + (soloCiclismo instanceof Nadador));
        System.out.println("soloCiclismo es DeporteOlimpico: " + (soloCiclismo instanceof DeporteOlimpico));

        CiclistaPro ciclista = new CiclistaPro();
        System.out.println("ciclista es Ciclista: " + (ciclista instanceof Ciclista));
        System.out.println("ciclista es Corredor: " + (ciclista instanceof Corredor));
        System.out.println("ciclista es Nadador: " + (ciclista instanceof Nadador));
        System.out.println("ciclista es DeporteOlimpico: " + (ciclista instanceof DeporteOlimpico));
        if (ciclista instanceof DeporteOlimpico) {
            System.out.println("Olimpiadas");
        }
    }
}
