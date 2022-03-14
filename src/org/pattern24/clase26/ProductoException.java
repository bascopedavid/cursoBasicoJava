package org.pattern24.clase26;

public class ProductoException extends Exception {
    public ProductoException() {
        super();
    }

    public ProductoException(String message) {
        //guardar el error en DB
        //enviar email a devops
        //enviar SMS
        //llamada a API
        super(message);
    }

    public ProductoException(String message, Throwable cause) {
        super(message, cause);
    }
}
