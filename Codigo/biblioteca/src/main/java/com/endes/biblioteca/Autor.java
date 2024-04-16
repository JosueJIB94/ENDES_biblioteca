package com.endes.biblioteca;
import java.util.List;

public class Autor {
    private String name;
    private String biography;
    private List<Libro> librosEscritos;
    
	public Autor(String name, String biography, List<Libro> librosEscritos) {
		super();
		this.name = name;
		this.biography = biography;
		this.librosEscritos = librosEscritos;
	}
	/**
	 * 
	 * @return este metodo nos devuelve el nombre del autor
	 */
	public String getName() {
		return name;
	}

	/**
	 * 
	 * @param como parametro el nombre del autor para modificarlo
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * 
	 * @return devuelve la biografia del autor
	 */
	public String getBiography() {
		return biography;
	}

	/**
	 * 
	 * @param como parametro la biografia del autor para modificarla
	 */
	public void setBiography(String biography) {
		this.biography = biography;
	}

	/**
	 * 
	 * @return nos muestra los libros escritos
	 */
	public List<Libro> getLibrosEscritos() {
		return librosEscritos;
	}

	/**
	 * 
	 * @param como parametro los libros escritos para modificarlos
	 */
	public void setLibrosEscritos(List<Libro> librosEscritos) {
		this.librosEscritos = librosEscritos;
	}
	
}

