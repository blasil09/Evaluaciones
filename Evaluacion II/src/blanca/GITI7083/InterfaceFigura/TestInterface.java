//Autor Blanca Almendariz
package blanca.GITI7083.InterfaceFigura;

import java.util.Scanner;

public class TestInterface  {
	
	//metodo de test
	public void test(){
		Figura figura;
		Cuadrado cuadrado;
		Circulo circulo;
		Triangulo triangulo;
		
		//solicita la figura al usuario
	Scanner scanner = new Scanner(System.in);
	System.out.println("Teclea la figura que deseas:");
	String seleccion=scanner.next();
	
	//verifica la opcion que el usuario teclea
	switch (seleccion){
	
	case "1":
		figura=new Cuadrado();
		break;
	case "2":
		figura= new Circulo();
		break;
	case "3":
		figura= new Triangulo();
		break;
		//si el usuario teclea un opcion que no existe
	default:
		System.out.println("la figura no existe");
	break;
	
	
	}
			
		
		
	}

}
