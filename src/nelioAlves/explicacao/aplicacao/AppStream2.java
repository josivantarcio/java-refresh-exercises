package nelioAlves.explicacao.aplicacao;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class AppStream2 {

    public static void main(String[] args) {

        var lista = Arrays.asList(1, 112, 3, 5, 25, 16, 7, 98, 9, 10);

        Stream<Integer> st1 = lista.stream()
                .map(x -> x * 10);
        st1.forEach(System.out::println);

        System.out.println("----");
        int sum = lista.stream()
                .reduce(0, (a, b) -> a + b);
        System.out.print(sum);

        System.out.println("---");
        List<Integer> list = lista.parallelStream()
                .filter(x -> x % 2 != 1)
                .map(x -> x * 10)
                .collect(Collectors.toList());
        System.out.println(Arrays.toString(list.toArray()));
    }
}
