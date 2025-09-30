package nelioAlves.exercicio.aplicacao;

import java.util.Scanner;

import nelioAlves.exercicio.model.entities.Correntista;

public class ContaBancaria {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		try {

			System.out.print("Numero da Conta: ");
			Integer conta = sc.nextInt();

			System.out.print("Nome: ");
			sc.nextLine();
			String nome = sc.nextLine();

			System.out.println("Deseja deposito inicial? S/N ");
			char inicial = sc.next().toUpperCase().charAt(0);
			Correntista cc;
			if (inicial == 'S') {
				System.out.print("Digite o valor: ");
				double valor = sc.nextDouble();
				cc = new Correntista(nome, conta, valor);
			} else {
				cc = new Correntista(nome, conta);
			}

			System.out.println(cc);

			System.out.println("Entre com novo deposito: ");
			cc.depositarValor(sc.nextDouble());
			System.out.println(cc);

			System.out.println("Entre com novo Saque: ");
			cc.saque(sc.nextDouble());
			System.out.println(cc);

		} catch (Exception e) {
			System.err.println("ERRO:" + e.getMessage());
		} finally {
			if (sc != null) {
				sc.close();
			}
		}

	}

}
