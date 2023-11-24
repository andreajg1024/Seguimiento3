package EjemplosFilter;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EjemploFilterNumerosPares {
    public static void main(String[] args) {
        // Crear una lista de números
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // Usar el método filter para obtener los números pares
        List<Integer> numerosPares = numeros.stream()
                .filter(num -> num % 2 == 0)
                .collect(Collectors.toList());

        // Imprimir los números pares
        System.out.println("Números pares: " + numerosPares);
    }
}

