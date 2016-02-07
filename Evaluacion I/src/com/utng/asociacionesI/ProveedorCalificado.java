//Autor Blanca Silvia Almendariz 
package com.utng.asociacionesI;
//importamos la libreria DATE para los atributos tipo DATE 
import java.util.Date;

public class ProveedorCalificado {
	//declaracion de atributos 
	private Date fechaCalificacion;
	private int calid;
	private int prid;
	private Calificacion calificacion;
	
	//costructor proveedor calificado pasamos como parametros la calificacion
	public ProveedorCalificado(Calificacion calificacion) {
		this.calificacion=calificacion;
		
		// TODO Auto-generated constructor stub
	}
}
