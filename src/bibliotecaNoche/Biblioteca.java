package bibliotecaNoche;

import java.util.Iterator;

public class Biblioteca {
	
	private Libro[] libros;
	private int cantidadDeLibros = 0;
	
	//constructor array
	public Biblioteca (int maxCantidadDeLibros) {
		libros = new Libro[maxCantidadDeLibros];
	}
	
	public void agregarLibro(String titulo, String autor, Genero genero, int paginas){
		if(cantidadDeLibros >= libros.length) {
			throw new Error("biblioteca completa");
		}
		
	//si hay espacio agrego el nuevo libro
		Libro libroNuevo = new Libro(titulo, autor, genero, paginas);
		libros[cantidadDeLibros] = libroNuevo;
		cantidadDeLibros++;
	}
	//sobre carga de metodos
	public void agregarLibro(Libro libro){
		if(cantidadDeLibros >= libros.length) {
			throw new Error("Biblioteca completa");
		}
		
		libros[cantidadDeLibros] = libro;
		cantidadDeLibros++;
	}
	
	public int cuantosLibros(){
		return cantidadDeLibros;
	}
	
	public String libroEnLaPosicion(int posicion){
		return libros[posicion - 1].getTitulo();
	}
	
	public Libro libroConMasPaginas(){
		int posicionDelLibroConMasPaginas = 0;

		for (int i = 1; i < cantidadDeLibros; i++) {
			if (libros[i].getPaginas() > libros[posicionDelLibroConMasPaginas].getPaginas()) {
				posicionDelLibroConMasPaginas = i;
			}
		}
		return libros[posicionDelLibroConMasPaginas];
	}
}
