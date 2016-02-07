//Autor Blanca Silvia Almendariz 
package com.utng.asociacionesI;

public class Proveedor {
	//declaracion atributos 
	private double prid;
	private String prrazonSocial;
	private String prcontacto;
	private String prtelefono2;
	private String prtelefono1;
	private String prfax;
	private String premail1;
	private String premail2;
	private String prweb;
	private int prcuit;
	private Rubro rubro;
	private Direccion direccion;
	private Articulo articulo;
	private Precios precios;
	private Calificacion calificacion;
	
	//constructos proveedor pasamos como parametros  el rubro y direccion 
	public Proveedor(Rubro rubro, Direccion direccion) {
		this.rubro=rubro;
		this.direccion=direccion;
		
		
		// TODO Auto-generated constructor stub
	}
	

}
