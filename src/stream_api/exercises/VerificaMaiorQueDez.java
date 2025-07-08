package stream_api.exercises;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class VerificaMaiorQueDez {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        Predicate<Integer> contemMaiorQueDez = n -> n > 10;

        String mensagem = numeros.stream()
                .anyMatch(contemMaiorQueDez) ? "A lista contém um número maior do que 10" : "A lista não contém um número maior do que 10";

        System.out.println(mensagem);
    }
}
