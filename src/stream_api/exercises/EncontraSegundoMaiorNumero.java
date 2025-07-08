package stream_api.exercises;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class EncontraSegundoMaiorNumero {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

//        Function<Integer, Integer> segundoMaiorNumero = n -> {
//            int primeiroNumero = Integer.MIN_VALUE;
//            int segundoNumero = Integer.MIN_VALUE;
//            if (n > primeiroNumero) return primeiroNumero = n;
//            else if (n > segundoNumero) return segundoNumero = n;
//            else return 0;
//        };
//
//        Predicate<Integer> segMaiorNumero = n -> {
//            int primeiroNumero = Integer.MIN_VALUE;
//            int segundoNumero = Integer.MIN_VALUE;
//            if (n > primeiroNumero) primeiroNumero = n;
//            else if (n > segundoNumero) segundoNumero = n;
//            else return false;
//            return false;
//        };
//
//        Comparator<Integer> ComparaMaiorNumero = new ComparaMaiorNumero();

        // Implementação feita por mim, funciona nesta lista, mas não no caso de haverem números repetidos. Nova implementação com conselhos do Copilot abaixo.

//        List<Integer> segundoMaiorNumeroLista = numeros.stream()
//                .sorted()
//                .skip(numeros.size() - 2)
//                .limit(1)
//                .toList();
//
//        System.out.println(segundoMaiorNumeroLista);
//
//
//    }

            numeros.stream()
                .distinct()
                .sorted(Comparator.reverseOrder())
                .skip(1).findFirst().ifPresent(System.out::println);
    }

//    static class ComparaMaiorNumero implements Comparator<Integer> {
//
//        @Override
//        public int compare(Integer n1, Integer n2) {
//            return Integer.compare(n1, n2);
//        }
//    }
}
