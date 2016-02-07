package src.blanca.giti7083.figuras;
//Autor Blanca Almendariz


public class TestFiguras {
//imprime el resultado del area del circulo y perimetro 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circulo circulo=new Circulo();
		circulo.setRadio(4.5);
		System.out.println("El area del circulo es:"+circulo.calcularArea());
		
		System.out.println("El perimetro es:"+circulo.calcularPerimetro());
		
	}

}
