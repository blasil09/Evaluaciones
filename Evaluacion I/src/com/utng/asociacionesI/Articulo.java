//Autor Blanca Silvia Almendariz 
package com.utng.asociacionesI;


public class Articulo {
	//declaracion atributos 
	private String artid;
	private String artdesccripcion;
	private int artestado;
	private int arttipo;
	private int artcantidad;
	private double artcantidadcritica;
	private double artcantidadminima;
	private Rubro rubro;
	private Precios precio;
	
	//metodo artuculo pasando como parametro rubro
	public Articulo(Rubro rubro) {
		this.rubro=rubro;
		// TODO Auto-generated constructor stub
	}
}
