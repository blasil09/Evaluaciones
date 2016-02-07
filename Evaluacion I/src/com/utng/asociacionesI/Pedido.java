//Autor Blanca Silvia Almendariz 
package com.utng.asociacionesI;

//importamos la libreria date para los atributos tipo DATE 
import java.util.Date;

public class Pedido {
 //declaracion atributos 
 private double peid;
 private Date pefechapedido;
 private Date pefechanecesidad;
 private Date pefechaprogramada;
 private Date pefechaentrega;
 private int peestado;
 private  Articulo articulo;
 
 
 //constructor articulo pasamos como parametro el articulo
 public Pedido(Articulo articulo ) {
	 this.articulo=articulo;
	 
	// TODO Auto-generated constructor stub
}
 
}
