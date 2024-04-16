package com.endes.biblioteca;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

class AutorTest {
	
	private Autor autor;
	private List<Libro> libros;
	
	@BeforeEach
	public void setUp() {
		
		libros = new ArrayList<>();
		libros.add(new EjemplarLibro("CodigoBarra1", "Etiqueta1", "1234", "LibroA"));
		libros.add(new EjemplarLibro("CodigoBarra2", "Etiqueta2", "5678", "LibroB"));
		autor = new Autor("Gabriel García Marquez", "Escritor colombiano, premio Nobel de Literatura en 1982", libros);
		autor.setLibrosEscritos(libros);
		
	}
	
	@Test
	@DisplayName("Obtener nombre del autor")
	public void testGetNombre() {
		assertEquals("Gabriel Garcia Marquez, autor", autor.getName());
	}
	
	@Test
	@DisplayName("Obtener biografia del autor")
	public void testGetBiografia() {
		assertEquals("Escritor colombiano, premio Nobel de Literatura en 1982", autor.getBiography());
	}
	
	@Test
	@DisplayName("Obtener libros escritos por el autor")
	public void testGetLibrosEscritos() {
		assertNotNull(autor.getLibrosEscritos());
		assertEquals(2, autor.getLibrosEscritos().size());
		assertEquals("Cien años de soledad", autor.getLibrosEscritos().get(0).getTitle());
		assertEquals("El amor en tiempos del colera", autor.getLibrosEscritos().get(1).getTitle());
	}
	
	
        
    }

