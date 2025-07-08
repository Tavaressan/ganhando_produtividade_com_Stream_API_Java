package stream_api.exercises;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class ContemNegativo {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        Predicate<Integer> contemNegativo = n -> n < 0;

        var mensagem = numeros.stream()
                .anyMatch(contemNegativo) ? "Lista contém número negativo" : "Lista não contém número negativo";

        System.out.println(mensagem);
    }
}
