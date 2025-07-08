package stream_api.exercises;

import java.util.Arrays;
import java.util.List;

public class AgrupaParImpar {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        List<Integer> paresLista = numeros.stream().filter(n -> n % 2 ==0).toList();

        List<Integer> imparesLista = numeros.stream().filter(n -> n % 2 !=0).toList();

        System.out.println("Lista de pares");
        for (Integer n : paresLista){
            System.out.println(n);
        }

        System.out.println("Lista de ímpares");
        for (Integer n : imparesLista){
            System.out.println(n);
        }
    }
}
