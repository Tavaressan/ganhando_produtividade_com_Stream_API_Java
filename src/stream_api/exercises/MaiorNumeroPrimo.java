package stream_api.exercises;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;

public class MaiorNumeroPrimo {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        Predicate<Integer> numeroPrimo = n -> n != 0 && n != 1 && (n % 2 != 0 && n % 3 != 0 && n % 5 != 0) || n == 2 || n == 3 || n == 5;

        numeros.stream().filter(numeroPrimo)
                .sorted(Collections.reverseOrder())
                .limit(1)
                .forEach(System.out::println);
    }
}

//        numeros.stream()
//                .filter(MaiorNumeroPrimo::isPrime)
//                .sorted(Collections.reverseOrder())
//                .findFirst()
//                .ifPresent(System.out::println);
//    }
//
//    private static boolean isPrime(int n) {
//        if (n <= 1) return false;
//        if (n == 2) return true;
//        if (n % 2 == 0) return false;
//        for (int i = 3; i <= Math.sqrt(n); i += 2) {
//            if (n % i == 0) return false;
//        }
//        return true;
//    }
//}
