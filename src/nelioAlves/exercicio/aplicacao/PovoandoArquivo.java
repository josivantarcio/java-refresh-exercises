package nelioAlves.exercicio.aplicacao;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import nelioAlves.exercicio.model.entities.Produto;

public class PovoandoArquivo {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        try (Scanner console = new Scanner(System.in)) {

            System.out.print("Digite o caminho da origem: ");
            String origemPath = console.nextLine();

            List<Produto> produtos = lerProdutos(origemPath);

            File outFile = criarArquivoSaida(origemPath, "summary.txt");
            escreverProdutos(produtos, outFile);

            System.out.println("Arquivo criado em: " + outFile.getAbsolutePath());

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static List<Produto> lerProdutos(String origemPath) throws Exception {
        List<Produto> produtos = new ArrayList<>();

        try (InputStream is = new FileInputStream(origemPath);
             Scanner sc = new Scanner(is)) {

            while (sc.hasNextLine()) {
                String[] campos = sc.nextLine().split(",");
                produtos.add(new Produto(
                        campos[0],
                        Double.parseDouble(campos[1]),
                        Double.parseDouble(campos[2])
                ));
            }
        }
        return produtos;
    }

    private static File criarArquivoSaida(String origemPath, String nomeArquivo) {
        File parentFolder = new File(origemPath).getParentFile();
        File outFolder = new File(parentFolder, "out");

        if (!outFolder.exists() && !outFolder.mkdir()) {
            throw new IllegalStateException("Não foi possível criar a pasta de saída");
        }

        return new File(outFolder, nomeArquivo);
    }

    private static void escreverProdutos(List<Produto> produtos, File outFile) throws Exception {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(outFile))) {
            for (Produto p : produtos) {
                bw.write(p.toString());
                bw.newLine();
            }
        }
    }
}
