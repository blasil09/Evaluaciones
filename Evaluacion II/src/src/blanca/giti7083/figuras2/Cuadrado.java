package src.blanca.giti7083.figuras2;
//Autor Blanca Almendariz

public class Cuadrado extends Figura{
	//declara el atributo lado
	private int lado;

	//metodo set para el lado 
	public void setLado(int lado){
		this.lado=lado;
	}
	
	
	//metodo area cuadradro que calcula el area del cuadrado 
	@Override 
	public int areaCuadrado(){
		int area=(lado*lado);
		return area;
	}
	
	//metodo area 
	public void area(){
		
	}
	
}
