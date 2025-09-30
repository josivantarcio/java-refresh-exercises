package nelioAlves.explicacao.aplicacao;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import nelioAlves.explicacao.model.entities.Funcionario;

public class RhFuncionario {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Funcionario> funcionarios = new ArrayList<>();

		try {
			System.out.print("Quantos são os funcionários? ");
			int N = sc.nextInt();

			for (int i = 0; i < N; i++) {

				String id = null;
				boolean idExiste;

				// Validação de ID único
				do {
					System.out.print("ID: ");
					String ID = sc.next();

					idExiste = funcionarios.stream().anyMatch(x -> x.getId().equals(ID));

					if (idExiste) {
						System.out.println("ID já cadastrado, tente novamente.");
					} else {
						id = ID;
					}

				} while (idExiste);

				// Leitura do nome
				System.out.print("Nome: ");
				sc.nextLine(); // Consome quebra de linha pendente do next()
				String nome = sc.nextLine();

				// Leitura do salário
				System.out.print("Salário: ");
				double salario = sc.nextDouble();

				// Adiciona funcionário à lista
				funcionarios.add(new Funcionario(id, nome, salario));

			}

			System.out.print("Id do Funcionario para ajuste de Salario: ");
			String idFuncionario = sc.next();

			boolean funcionarioExiste = funcionarios.stream().anyMatch(x -> x.getId().equals(idFuncionario));
			if (!funcionarioExiste) {
				System.out.println("ID Funcionario nao Existe");

			} else {
				for (Funcionario funcionario : funcionarios) {
					if (idFuncionario.equals(funcionario.getId())) {
						System.out.print("Quantos % de Ajustes? ");
						double ajuste = sc.nextDouble();
						funcionario.setSalario(funcionario.getSalario() + funcionario.getSalario() * (ajuste / 100));
					}
				}

			}

			for (Funcionario funcionario : funcionarios) {
				System.out.println(funcionario);
			}

		} catch (Exception e) {
			System.out.println("Erro: " + e.getMessage());
		} finally {
			sc.close();
		}
	}
}
