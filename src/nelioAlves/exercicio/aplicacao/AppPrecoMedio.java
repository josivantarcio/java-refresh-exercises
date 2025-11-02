package nelioAlves.exercicio.aplicacao;

import nelioAlves.exercicio.model.entities.Product;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class AppPrecoMedio {
    public static void main(String[] args) {

        List<Product> prod = new ArrayList<>();
        try (InputStream in = AppPrecoMedio.class.getResourceAsStream("/resources/prod.txt"); Scanner sc = new Scanner(in)) {

            while (sc.hasNextLine()) {
                String[] linhas = sc.nextLine().split(",");

                String nome = linhas[0];
                Double preco = Double.parseDouble(linhas[1]);
                prod.add(new Product(nome, preco));
            }

            //Media dos preços
            double media = prod.stream()
                    .mapToDouble(Product::getPrice)
                    .average()
                    .orElse(0);
            System.out.printf("Media: %.2f%n", media);

            //Lista de produtos
            System.out.println("Lista de Produtos abaixo da media:");
            prod.stream()
                    .filter(p -> p.getPrice() < media)
                    .map(Product::getName)
                    .sorted(Comparator.reverseOrder())
                    .forEach(System.out::println);


        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Programa finalizado!");
        }

    }
}
