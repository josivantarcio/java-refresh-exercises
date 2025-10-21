package nelioAlves.exercicio.model.entities;

import java.util.Objects;

public class Candidatos {

	private String nomeCandidato;
	private Integer votos;

	public Candidatos(String nomeCandidato, Integer votos) {
		super();
		this.nomeCandidato = nomeCandidato;
		this.votos = votos;
	}

	public String getNomeCandidato() {
		return nomeCandidato;
	}

	public void setNomeCandidato(String nomeCandidato) {
		this.nomeCandidato = nomeCandidato;
	}

	public Integer getVotos() {
		return votos;
	}

	public void setVotos(Integer votos) {
		this.votos = votos;
	}

	@Override
	public int hashCode() {
		return Objects.hash(nomeCandidato);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Candidatos other = (Candidatos) obj;
		return Objects.equals(nomeCandidato, other.nomeCandidato);
	}



}
