package EjemplosMap;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EjemploMapDuplicarNumeros {
    public static void main(String[] args) {
        // Crear una lista de números
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);

        // Usar el método map para duplicar cada número
        List<Integer> numerosDuplicados = numeros.stream()
                .map(num -> num * 2)
                .collect(Collectors.toList());

        // Imprimir la lista de números duplicados
        System.out.println("Números duplicados: " + numerosDuplicados);
    }
}

