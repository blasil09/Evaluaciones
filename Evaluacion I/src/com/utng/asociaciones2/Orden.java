//Autor Blanca Silvia Almendariz 
package com.utng.asociaciones2;

import java.util.List;

public class Orden {
	//declaracion atributos 
	private int hora;
	private String mesero;
	private List<Platillo> platillos;
	private List<Bebida> bebidas;
	private Pago pago;
	
	//constructor ORden pasamos como parametros el platillo, bebida y pago
	public Orden(List<Platillo> platillo, List<Bebida> bebidas,Pago pago) {
		this.platillos=platillo;
		this.bebidas=bebidas;
		this.pago=pago;
		
		// TODO Auto-generated constructor stub
	}
	
}
