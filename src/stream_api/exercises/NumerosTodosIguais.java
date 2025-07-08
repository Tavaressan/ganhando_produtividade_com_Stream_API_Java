package stream_api.exercises;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Predicate;

public class NumerosTodosIguais {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
        boolean todosIguais = numeros.stream().allMatch(n -> n.equals(numeros.get(0)));
        String mensagem = todosIguais ? "Números da lista são todos iguais" : "Números da lista não são todos iguais";
        System.out.println(mensagem);
    }

    // Solução implementada anteriormente, retornava true para o predicate na primeira igualdade encontrada.

//    AtomicInteger numeroAnterior = new AtomicInteger(Integer.MIN_VALUE);
//
//    Predicate<Integer> numerosTodosIguais = n -> {
//        if (n == numeroAnterior.get()) return true;
//        numeroAnterior.set(n);
//        return false;
//    };
//
//    var mensagem = numeros.stream()
//            .sorted()
//            .anyMatch(numerosTodosIguais) ? "Números da lista são todos iguais" : "Números da lista não são todos iguais";
//
//        System.out.println(mensagem);
}
