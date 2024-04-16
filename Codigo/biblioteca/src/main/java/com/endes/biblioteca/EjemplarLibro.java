package com.endes.biblioteca;

import java.util.List;

public class EjemplarLibro extends Libro{

	private String codigo_barra;
	private String etiqueta;
	
	public EjemplarLibro(String codigo_barra, String etiqueta, String isbn, String title) {
		super(isbn, title);
		this.codigo_barra = codigo_barra;
		this.etiqueta = etiqueta;
	}

	public String getCodigo_barra() {
		return codigo_barra;
	}

	public void setCodigo_barra(String codigo_barra) {
		this.codigo_barra = codigo_barra;
	}

	public String getEtiqueta() {
		return etiqueta;
	}

	public void setEtiqueta(String etiqueta) {
		this.etiqueta = etiqueta;
	}
	
	
	
}
