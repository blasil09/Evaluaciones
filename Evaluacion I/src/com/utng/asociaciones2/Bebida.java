//Autor Blanca Silvia Almendariz 
package com.utng.asociaciones2;

public class Bebida {
	//declaracion de los objetos cantidad, tipo
	private int cantidad;
	private String tipo;
	private Orden orden;
	
	//constructor bebida pasamos como parametro la orden 
	public Bebida(Orden orden) {
		this.orden=orden;
		// TODO Auto-generated constructor stub
	}
	

}
