package nelioAlves.exercicio.aplicacao;

import java.util.Scanner;

import nelioAlves.exercicio.model.entities.Estudante;

public class Pensionato {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			
			Estudante[] estudantes = new Estudante[10];

			System.out.print("Quantos Alunos desejam quartos? ");
			int quantEstudantes = sc.nextInt();
			if (quantEstudantes < 1 && quantEstudantes > 10)
				quantEstudantes = 10;

			for (int j = 1; j <= quantEstudantes; j++) {
				System.out.println("Registrar o aluno Nº" + j);
				System.out.print("Nome: ");
				sc.nextLine();
				String nome = sc.nextLine();
				System.out.print("Email: ");
				String email = sc.next();
				System.out.print("Numero do Quarto: ");
				int numeroQuarto = sc.nextInt();
				estudantes[numeroQuarto] = new Estudante(nome, email);

			}

			System.out.println("Busy rooms:");
			for (int i = 0; i < estudantes.length; i++) {
				if (estudantes[i] != null) {
					System.out.println(i + ": " + estudantes[i].getNome() + ", " + estudantes[i].getEmail());
				}
			}

		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			if (sc != null) {
				sc.close();
			}
		}
	}

}
