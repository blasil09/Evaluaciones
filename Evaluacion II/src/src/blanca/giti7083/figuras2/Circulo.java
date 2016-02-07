package src.blanca.giti7083.figuras2;
//Autor Blanca Almendariz

public class Circulo  extends Figura{
	//declara el atributo radio 
	private double radio=0.0;
	
	//metodo  set para el radio 
	public void setRadio(double radio){
		this.radio=radio;
	}
	
	
	//metodo areacirculo que calcula el area del circulo
	@Override 
	public double areaCirculo(){
		double area=(3.1416*(this.radio*this.radio));
		
		return area;
	}
	
	//metodo area
	public void area(){
		
	}
	
}
