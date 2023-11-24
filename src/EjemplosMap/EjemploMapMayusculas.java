package EjemplosMap;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EjemploMapMayusculas {
    public static void main(String[] args) {
        // Crear una lista de cadenas
        List<String> cadenas = Arrays.asList("java", "python", "c++", "javascript");

        // Usar el método map para convertir cada cadena a mayúsculas
        List<String> cadenasMayusculas = cadenas.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());

        // Imprimir la lista de cadenas en mayúsculas
        System.out.println("Cadenas en mayúsculas: " + cadenasMayusculas);
    }
}
