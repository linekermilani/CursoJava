package modulo6;

import java.util.Objects;

public class UsuarioLista {

	String nome;

	public UsuarioLista(String nome) {
		this.nome = nome;
	}
	
	@Override
	public String toString() {
		return "Meu nome é " + this.nome + "";
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(nome);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		UsuarioLista other = (UsuarioLista) obj;
		return Objects.equals(nome, other.nome);
	}
}
