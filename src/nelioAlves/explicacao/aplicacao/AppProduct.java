package nelioAlves.explicacao.aplicacao;

import nelioAlves.explicacao.model.entities.Produtos;
import nelioAlves.explicacao.model.services.ProductService;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class AppProduct {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        List<Produtos> lista = new ArrayList<>();

        lista.add(new Produtos("Ferro de Passar", 64.20));
        lista.add(new Produtos("Lapis Colorido", 6.15));
        lista.add(new Produtos("TV", 11200.80));
        lista.add(new Produtos("Bateria Notebook", 19.90));
        lista.add(new Produtos("relogio Techinos", 690.90));
        lista.add(new Produtos("Tablet", 2798.10));

        ProductService ps = new ProductService();
        double sum = ps.FilterSum(lista, p -> p.getPreco() < 15.0);

        lista.forEach(System.out::println);
        System.out.println(sum);

    }


}
