package GITI7083.blanca.animal;

import java.util.Scanner;

import blanca.GITI7083.InterfaceFigura.Circulo;
import blanca.GITI7083.InterfaceFigura.Cuadrado;
import blanca.GITI7083.InterfaceFigura.TestInterface;
import blanca.GITI7083.InterfaceFigura.Triangulo;
//Autor Blanca Almendariz

public class Testanimal {
	
	//metodo para el test 
	public void test(){
	Animal animal;
	Gato gato;
	Perro perro;
	
	//muestra en pantalla el texto para que usuario seleccione la opcion deseada 
	Scanner scanner= new Scanner(System.in);
	System.out.println("Teclea  la opcion del animal que deseas:");
	String seleccion=scanner.next();
	
	switch (seleccion){
	
	case "1":
		animal=new  Gato();
		break;
	case "2":
		animal= new Perro();
		break;
	
	default:
		System.out.println("No existe el animal que capturaste");
	break;
	
					}
	
	}
	
	//metodo para que imprima el texto segun la opcion capturada 
	public static void main(String[] args) {
		new Testanimal().test();
		// TODO Auto-generated method stub

	}
}
