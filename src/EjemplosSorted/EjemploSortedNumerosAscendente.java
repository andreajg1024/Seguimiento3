package EjemplosSorted;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EjemploSortedNumerosAscendente {
    public static void main(String[] args) {
        // Crear una lista de números desordenados
        List<Integer> numeros = Arrays.asList(5, 2, 8, 1, 3);

        // Usar el método sorted para ordenar los números de forma ascendente
        List<Integer> numerosOrdenados = numeros.stream()
                .sorted()
                .collect(Collectors.toList());

        // Imprimir la lista de números ordenados
        System.out.println("Números ordenados de forma ascendente: " + numerosOrdenados);
    }
}

