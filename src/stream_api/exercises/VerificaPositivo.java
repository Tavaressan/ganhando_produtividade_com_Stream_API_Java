package stream_api.exercises;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class VerificaPositivo {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        Predicate<Integer> contemNumeroNegativo = n -> Math.signum(n) < 0;

        String mensagem = numeros.stream()
                .anyMatch(contemNumeroNegativo) ? "Sua lista não é positiva" : "Sua lista é positiva";

        System.out.println(mensagem);
    }
}