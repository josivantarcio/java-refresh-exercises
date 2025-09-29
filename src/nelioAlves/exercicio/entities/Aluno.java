package nelioAlves.exercicio.entities;

public class Aluno extends NotasAluno {
	private String nome;
	private String email;

	public Aluno(Double nota1, Double nota2, String nome) {
		super(nota1, nota2);
		this.nome = nome;
	}

	

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
