package src.blanca.giti7083.figuras;
//Autor Blanca Almendariz

//extends para relacion de herencia 
public class Circulo extends Figura {
	//inicializa las variables para el calculo
	private double radio=0.0;
	private String centro=null;
	
	//metodo set 
	public void setRadio(double radio){
		this.radio=radio;
	}
	
	//metodo para calcular el area 
	@Override 
	public double calcularArea(){
		double area=(3.1416*(this.radio*this.radio));
		
		return area;
	}
	//metodo para calcular el perimetro 
	@Override
	public double calcularPerimetro(){
		double perimetro=(3.1416*(radio+radio));
		return perimetro;
	}
	
	
	
}
