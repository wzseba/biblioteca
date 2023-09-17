package bibliotecaNoche;

import java.util.Objects;

public class Libro {
	
	private String titulo;
	private String autor;
	private Genero genero;
	private int paginas;
	
	
	public Libro(String titulo, String autor, Genero genero, int paginas) {
		this.titulo = titulo;
		this.autor = autor;
		this.genero = genero;
		this.paginas = paginas;
	}


	public String getTitulo() {
		return titulo;
	}


	public int getPaginas() {
		return paginas;
	}


	@Override
	public int hashCode() {
		return Objects.hash(autor, genero, paginas, titulo);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Libro other = (Libro) obj;
		return Objects.equals(autor, other.autor) && genero == other.genero && paginas == other.paginas
				&& Objects.equals(titulo, other.titulo);
	}

	
	
}
