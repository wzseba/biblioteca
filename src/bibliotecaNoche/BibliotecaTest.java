package bibliotecaNoche;

import static org.junit.Assert.*;

import org.junit.Test;

public class BibliotecaTest {

	@Test
	public void bibliotecaNuevaTest() {
		Biblioteca biblio = new Biblioteca(10);
		int esperado = 0;
		int obtenido = biblio.cuantosLibros();
		assertEquals(esperado, obtenido);
	}
	
	@Test
	public void agregarLibroTest() {
		Biblioteca biblio = new Biblioteca(10);
		biblio.agregarLibro("Moby Dick", "Melville", Genero.AVENTURA, 909);
		int esperado = 1;
		int obtenido = biblio.cuantosLibros();
		assertEquals(esperado, obtenido);
	}

	@Test
	public void libroEnLaPrimeraPosicionTest() {
		Biblioteca biblio = new Biblioteca(10);
		biblio.agregarLibro("Moby Dick", "Melville", Genero.AVENTURA, 909);
		biblio.agregarLibro("El Resplandor", "Pedro", Genero.NOVELA, 909);
		assertEquals("Moby Dick", biblio.libroEnLaPosicion(1));
	}

	

  @Test public void libroConMasPaginasTest() { 
	  Biblioteca biblio = new Biblioteca(10);
	  biblio.agregarLibro("Moby Dick", "Melville", Genero.AVENTURA, 800);
	  biblio.agregarLibro("Pepe", "Pedro", Genero.INFANTILES, 9099);
	  biblio.agregarLibro("La ultima cena", "Judas", Genero.HISTORIA, 10000);
	  
	  Libro esperado = new Libro("La ultima cena", "Judas", Genero.HISTORIA, 10000);
	  assertEquals(esperado, biblio.libroConMasPaginas());
  }
  
  @Test public void libroConMasPaginasBibliotecaVacia() {
	  Biblioteca biblio = new Biblioteca(10);
	  assertEquals(null, biblio.libroConMasPaginas());
  }
  
  @Test(expected = Error.class) 
  public void bibliotecaLlena() { 
	  Biblioteca biblio = new Biblioteca(3); 
	  biblio.agregarLibro("Moby Dick", "Melville",Genero.AVENTURA, 800); 
	  biblio.agregarLibro("Pepe", "Pedro",Genero.INFANTILES, 9099); 
	  biblio.agregarLibro("Moby Dick", "Melville",Genero.AVENTURA, 800); 
	  biblio.agregarLibro("Pepe", "Pedro",Genero.INFANTILES, 9099);
	  }
}
