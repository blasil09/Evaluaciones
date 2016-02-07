//Autor Blanca Almendariz 
package blanca.GITI7083.proyecto;

import java.util.Date;
import java.util.List;

public class Presupuesto implements IConsultarEstado{
	//declaramos atributos 
	private Date fecha;
	private String  descripcion;
	private double importe;
	private String estado;
	private  List<Proyecto> presupuesto;
	private List<Viaje> realizaenfecha;
	
	//constructo presupuesto pasando como parametros consultar estado cliente viaje y proyecto
	public Presupuesto(IConsultarEstado consutarEstado, Cliente cliente,
			Viaje viaje, Proyecto proyecto) {
		// TODO Auto-generated constructor stub
	}
	
}
