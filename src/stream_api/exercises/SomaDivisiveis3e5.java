package stream_api.exercises;

import java.util.Arrays;
import java.util.List;

public class SomaDivisiveis3e5 {
    public static void main(String[] args) {
        // Como a lista original não continha múltiplos de 3 e 5, adicionei-os ao final do array
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3, 15, 30);

        var somaDiviseis3e5 = numeros.stream().filter(n -> n % 3 == 0).filter(n -> n % 5 == 0).reduce((n1, n2) -> n1 + n2);

        System.out.println(somaDiviseis3e5);
    }
}
