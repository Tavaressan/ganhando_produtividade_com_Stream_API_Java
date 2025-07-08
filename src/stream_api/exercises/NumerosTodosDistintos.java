package stream_api.exercises;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Predicate;

public class NumerosTodosDistintos {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
        AtomicInteger numeroAnterior = new AtomicInteger(0);

        Predicate<Integer> numerosIguais = n -> {
        if (n == numeroAnterior.get()) return true;
        numeroAnterior.set(n);
        return false;
        };

        var mensagem = numeros.stream()
                .sorted()
                .anyMatch(numerosIguais) ? "A lista contém números iguais" : "A lista não contém números iguais.";

        System.out.println(mensagem);
    }
}
