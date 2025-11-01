package nelioAlves.explicacao.aplicacao;

import nelioAlves.explicacao.model.entities.Produtos;

import java.util.ArrayList;
import java.util.List;

public class AppLambda1 {
    static void main(String[] args) {

        List<Produtos> lista = new List<Produtos>();

        lista.add(new Produtos("TV", 900.00));
        lista.add(new Produtos("Mouse", 50.00));
        lista.add(new Produtos("Tablet", 350.50));
        lista.add(new Produtos("HD Case", 80.90));


        for (List p : lista){
            System.out.println(p);
        }

    }
}
