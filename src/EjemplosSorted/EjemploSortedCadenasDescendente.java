package EjemplosSorted;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EjemploSortedCadenasDescendente {
    public static void main(String[] args) {
        // Crear una lista de cadenas desordenadas
        List<String> cadenas = Arrays.asList("Java", "Python", "C++", "JavaScript");

        // Usar el método sorted para ordenar las cadenas de forma descendente
        List<String> cadenasOrdenadasDescendente = cadenas.stream()
                .sorted((s1, s2) -> s2.compareTo(s1))
                .collect(Collectors.toList());

        // Imprimir la lista de cadenas ordenadas de forma descendente
        System.out.println("Cadenas ordenadas de forma descendente: " + cadenasOrdenadasDescendente);
    }
}
