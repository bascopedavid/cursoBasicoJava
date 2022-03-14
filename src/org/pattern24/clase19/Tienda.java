package org.pattern24.clase19;

import java.math.BigDecimal;
import java.util.*;

public class Tienda {
    String nombre;
    private String direccion;
    static int telefono;

    public static class Sucursal { //static nested class
        static String nombreSucursal;
        String direccionSucursal;
        int telefonoSucursal;

        String getDatos() {
            return telefono + "-";
        }
    }

    public class Deposito { //Member inner class
        String getDatos() {
            return nombre + telefono + direccion;
        }
    }

    public void prueba() {
        Tienda a = new Tienda();
        Deposito d = new Deposito();
        Deposito e = new Tienda.Deposito();
//        Deposito f = a.Deposito();
        String contenido = "contenido de prueba";
        class Prueba { // local inner class
            long numeracion;
            private String nombre;

            public long getNumeracion() {
                return numeracion;
            }

            public void setNumeracion(long numeracion) {
                this.numeracion = numeracion;
            }

            public String getNombre() {
                return nombre + a.nombre + contenido;
            }

            public void setNombre(String nombre) {
                this.nombre = nombre;
            }
        }
//        contenido += "mas contenido";
        Prueba p = new Prueba();
    }

    public static void main(String[] args) throws CloneNotSupportedException {

        Producto producto = new Producto() {
            @Override
            public Producto aplicarCalificacion(Calificacion calificacion) {
                return null;
            }

            @Override
            protected BigDecimal getDescuento() {
                return null;
            }

            @Override
            public Producto cambiarPrecio(BigDecimal precio) {
                return null;
            }

            @Override
            public BigDecimal getPrecio() {
                return BigDecimal.ZERO;
            }
        };

        List<String> lista = Arrays.asList("Pedro", "Luisa", "Ana", "David Eduardo", "Maria", " Xavier");
        lista.set(1, "pedro");
        System.out.println(lista);
        Collections.sort(lista);
        Comparator<String> comparator = new Comparator<String>() { // anonymous inner class
            @Override
            public int compare(String o1, String o2) {
                return o2.toLowerCase().trim().compareTo(o1.toLowerCase().trim());
            }
        };
        Collections.sort(lista, comparator);
        ComparatorString comparator2 = new ComparatorString();
        Collections.sort(lista, comparator2);
        System.out.println(lista);

        Tienda a = new Tienda();
        Sucursal x = new Sucursal();
        Sucursal y = new Tienda.Sucursal();
//        Sucursal z = new a.Sucursal();X
        int telefono = x.telefonoSucursal;
        String nombre = Sucursal.nombreSucursal;

//        Deposito d = new Deposito(); X
//        Deposito d = new Tienda.Deposito(); X
//        Deposito d = new a.Deposito();
        List<Producto> productos = new ListaProducto();

        Collections.sort(lista, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.toLowerCase().trim().compareTo(o1.toLowerCase().trim());
            }
        });
        Collections.sort(lista, (o1, o2) -> o2.toLowerCase().trim().compareTo(o1.toLowerCase().trim()));
        Collections.sort(lista, (String o1, String o2) -> {
            String obj1 = o1.toLowerCase().trim();
            String obj2 = o2.toLowerCase().trim();
            return obj2.compareTo(obj1);
        });
        System.out.println(lista);
        Comparator<String> comparator3 = (o1, o2) -> o2.toLowerCase().trim().compareTo(o1.toLowerCase().trim());
        Collections.sort(lista, comparator3);
    }
}
