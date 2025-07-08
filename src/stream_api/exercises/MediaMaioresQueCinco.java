package stream_api.exercises;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Predicate;

public class MediaMaioresQueCinco {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        Predicate<Integer> maiorQueCinco = n -> n > 5;

        List<Integer> numerosMaioresQueCinco = numeros.stream().filter(maiorQueCinco).toList();


        // Imprime a média aritmética dos números maiores do que cinco desta lista 'numeros'.
        var mediaNumerosMaioresQueCinco = numerosMaioresQueCinco.stream().reduce(Integer::sum).map(n -> n / numerosMaioresQueCinco.size());

        System.out.println(mediaNumerosMaioresQueCinco);

         //Solução mais enxuta proposta pelo Copilot.
//        double media = numeros.stream()
//                .filter(n -> n > 5)
//                .mapToInt(Integer::intValue)
//                .average()
//                .orElse(0.0);
//        System.out.println(media);
    }
}
