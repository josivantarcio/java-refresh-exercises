package nelioAlves.exercicio.aplicacao;

import nelioAlves.exercicio.model.entities.Funcionario;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class AppRH {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        try (InputStream in = AppRH.class.getResourceAsStream("/resources/funcionario.txt"); Scanner sc = new Scanner(in)) {
            if (in == null) {
                throw new IllegalArgumentException();
            }

            List<Funcionario> funcionarios = new ArrayList<>();
            while (sc.hasNextLine()) {
                String[] linhas = sc.nextLine().split(",");
                String name = linhas[0];
                String email = linhas[1];
                double salario = Double.parseDouble(linhas[2]);

                funcionarios.add(new Funcionario(name, email, salario));
            }

            System.out.println("Digite o valor para o filtro");
            Scanner teclado = new Scanner(System.in);
            double valor = teclado.nextDouble();

            //lista de email dos funcionarios igual ou superior o valor informado
            System.out.println("Funcionarios com salario acima de $" + String.format("%.2f", valor));
            funcionarios.stream()
                    .filter(f -> f.getSalario() >= valor)
                    .map(Funcionario::getEmail)
                    .sorted()
                    .forEach(System.out::println);
            System.out.println();

            //A Soma dos salarios dos funcionários com a letra M
            Double soma = funcionarios.stream()
                    .filter(f -> f.getNome().toLowerCase().charAt(0) == 'm')
                    .mapToDouble(Funcionario::getSalario)
                    .sum();
            System.out.printf("Salario total das M: $%.2f%n", soma);


        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            System.out.println("Programa finalizado!");
        }
    }
}
