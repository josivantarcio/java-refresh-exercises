package nelioAlves.explicacao.model.entities;

import java.time.LocalDateTime;
import java.util.Objects;

public class UsuarioLog {

	private String name;
	private LocalDateTime date;

	public UsuarioLog(String name, LocalDateTime date) {
		this.name = name;
		this.date = date;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDateTime getDate() {
		return date;
	}

	public void setDate(LocalDateTime date) {
		this.date = date;
	}

	@Override
	public int hashCode() {
		return Objects.hash(name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		UsuarioLog other = (UsuarioLog) obj;
		return Objects.equals(name, other.name);
	}

	@Override
	public String toString() {
		return name + " " + date;
	}

}
