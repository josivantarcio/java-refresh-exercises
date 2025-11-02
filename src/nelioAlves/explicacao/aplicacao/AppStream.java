package nelioAlves.explicacao.aplicacao;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class AppStream {
    public static void main(String[] args) {

        List<Integer> lista = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        Stream<Integer> stream = lista.stream()
                .filter(x -> x % 2 == 0 && x <= 6)
                .map(x -> x * 10);
        stream.forEach(System.out::println);

        System.out.println("=======================");
        Stream<String> nome = Stream.of("Nelio", "Alves", "Josevan", "Oliveira", "Bob");
        nome.forEach(System.out::println);

        System.out.println("=======================");
        Stream<Long> fibonacci = Stream.iterate(new Long[]{0L,1L}, p -> new Long[]{p[1], p[0]+p[1]})
                .limit(10)
                .map(p -> p[0]);
        System.out.println(Arrays.toString(fibonacci.toArray()));
    }
}
