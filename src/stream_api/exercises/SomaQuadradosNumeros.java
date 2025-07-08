package stream_api.exercises;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Function;

public class SomaQuadradosNumeros {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        Function<Integer, Double> quadradoNumeros = n -> Math.pow(n, 2);

        var somaQuadrados = numeros.stream()
                .map(quadradoNumeros)
                .reduce(Double::sum);

        System.out.println(somaQuadrados);
    }
}
