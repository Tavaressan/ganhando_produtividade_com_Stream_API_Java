package stream_api.exercises;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;

public class IntervaloNumeros {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual é o primeiro número do intervalo?");
        int numero1 = scanner.nextInt();
        System.out.println("Qual é o último número do intervalo?");
        int numero2 = scanner.nextInt();

        Predicate<Integer> numeroMaiorIgualMinimo = n -> n >= numero1;

        Predicate<Integer> numeroMenorIgualMaximo = n -> n <= numero2;

        numeros.stream()
                .filter(numeroMaiorIgualMinimo)
                .filter(numeroMenorIgualMaximo)
                .forEach(System.out::println);




    }
}
