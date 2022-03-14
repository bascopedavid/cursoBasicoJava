package org.pattern24.clase27;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

//SOURCE codigo fuente
//CLASS clase, compilador, no JVM
//RUNTIME compilador, JVM
@Retention(RetentionPolicy.RUNTIME)
//TYPE clase
//FIELD atributo
//METHOD metodo
//CONSTRUCTOR
//LOCAL_VARIABLE
//ANNOTATION_TYPE
//PARAMETER
@Target(ElementType.METHOD)
public @interface MiAnotacion {
    int valor();
    String nombre();
}
