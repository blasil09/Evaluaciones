
//Autor Blanca Almendariz
package blanca.GITI7083.proyecto;

import java.util.List;




public class Cliente {
 //Declaracion de atributos 
	private String rfc;
	private String nombre;
	private String domicilio;
	private String telefono;
	private String email;
	private Proyecto proyecto;
	
	//relacion con presupuestos
	private List<Presupuesto> solicita;
	

}
