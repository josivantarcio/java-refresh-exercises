package nelioAlves.explicacao;

import nelioAlves.exercicio.model.entities.Product;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static java.util.Collections.*;

public class AppTes1 {
    static void main(String[] args) {

        List<Product> prod = new ArrayList<>();

        prod.add(new Product("Mouse", 100.00));
        prod.add(new Product("Teclado", 200.00));
        prod.add(new Product("Monitor", 300.00));

        sort(prod);
        for(Product p : prod){
            System.out.println(p);
        }
    }
}
