//Autor Blanca Silvia Almendariz 
package com.utng.asociaciones2;

import java.util.List;

public class Cliente {
	//declaracion atributos 
 private int mesa;
 private int comensales;
 private List<Orden> orden;
 
 	//constructos Cliente pasamos como parametro una lista de orden 
  public Cliente(List<Orden>orden) {
	  this.orden=orden;
	// TODO Auto-generated constructor stub
}
	
}
