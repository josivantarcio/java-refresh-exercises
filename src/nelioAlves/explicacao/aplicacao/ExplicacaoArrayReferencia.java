package nelioAlves.explicacao.aplicacao;

import java.util.Scanner;

import nelioAlves.explicacao.entities.Produtos;

public class ExplicacaoArrayReferencia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		try {
			
			System.out.println("Quantidade de Produtos?");
			int n = sc.nextInt();
			
			Produtos[] produtos = new Produtos[n];
			
			for(int i = 0; i < produtos.length; i++) {
				System.out.print("Nome do Produto: ");
				sc.nextLine();
				String nome = sc.nextLine();
				
				System.out.print("Preço: ");
				Double valor = sc.nextDouble();
				
				produtos[i] = new Produtos(nome, valor);
			}
			
			double somar = 0;
			for (Produtos produtos2 : produtos) {
				somar += produtos2.getPreco();
			}
			
			System.out.println("Media de preco: " + somar/n);
			
			
			
		} finally {
			if(sc != null) {
				sc.close();
			}
		}

	}

}
