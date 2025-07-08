package stream_api.exercises;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class ProdutoNumeros {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        BinaryOperator<Integer> multiplica = (n1, n2) -> n1 * n2;

            numeros.stream()
                .reduce(multiplica).ifPresent(System.out::println);
    }
}
