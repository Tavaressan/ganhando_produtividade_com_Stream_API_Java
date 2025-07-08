package stream_api.exercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.stream.Collectors;

public class SomaDigitos {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        Function<Integer, Integer> retornaDigitos = n -> {
//          List<Integer> listaDigitos = new ArrayList<>();
            int somaDigitos = 0;
          int digito = 0;
          while(n > 0) {
              digito = n % 10;
//              listaDigitos.add(digito);
              somaDigitos += digito;
              n = n / 10;
          }
          return somaDigitos;
        };

        BinaryOperator<Integer> somar = (n1, n2) -> n1 + n2;

        var somaDigitos = numeros.stream()
                .map(retornaDigitos)
                .reduce(somar);

        System.out.println(somaDigitos);
    }
}
