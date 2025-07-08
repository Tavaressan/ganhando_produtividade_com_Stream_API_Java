package stream_api.exercises;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class AgrupaImparesMultiplos3e5 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        Predicate<Integer> numeroImpar = n -> n % 2 != 0;

        Predicate<Integer> multiplo3e5 = n -> n % 3 == 0 || n % 5 == 0;

        numeros.stream()
                .filter(numeroImpar)
                .filter(multiplo3e5)
                .forEach(System.out::println);
    }
}
