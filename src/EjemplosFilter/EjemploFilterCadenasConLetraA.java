package EjemplosFilter;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EjemploFilterCadenasConLetraA {
    public static void main(String[] args) {
        // Crear una lista de cadenas
        List<String> cadenas = Arrays.asList("Java", "Python", "C++", "JavaScript", "Ruby");

        // Usar el método filter para obtener las cadenas que contienen la letra "a"
        List<String> cadenasConLetraA = cadenas.stream()
                .filter(s -> s.contains("a"))
                .collect(Collectors.toList());

        // Imprimir las cadenas que contienen la letra "a"
        System.out.println("Cadenas con la letra 'a': " + cadenasConLetraA);
    }
}
