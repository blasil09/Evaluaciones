//Autor Blanca Silvia Almendariz 
package com.utng.asociaciones2;

public class Platillo {
	//declaracion de atributos 
	private int cantidad;
	private String tipo;
	private Orden orden;
	
	//constructo platillo pasamos como parametro la orden
	public Platillo(Orden orden) {
		this.orden=orden;
		// TODO Auto-generated constructor stub
	}
	
}
