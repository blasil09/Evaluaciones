package GITI7083.blanca.animal;
//Autor Blanca Almendariz
//implements para la relacion de realizacion
public class Animal implements IAnimal  {
	//declaracion de objetos
	private String nombre;
	
	//constructor
	 public Animal() {
				
		// TODO Auto-generated constructor stub
	}

	 //metodo get obtiene nombre
	 public  String getNombre ()
	 {
		 return nombre;
	 }
	 
	 //metodo set envia nombre
	 public void setnombre(String nombre)
	 {
		 this.nombre=nombre;
	 }

	//metodo tipo animal
	 public static void tipoAnimal(){
		 
	 }
	 
}
