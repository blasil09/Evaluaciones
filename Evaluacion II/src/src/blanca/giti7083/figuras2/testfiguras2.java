package src.blanca.giti7083.figuras2;
//Autor Blanca Almendariz
public class testfiguras2 {

	//imprime el resultado del area del circulo y cuadrado
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Circulo circulo=new Circulo();
		circulo.setRadio(3);
		System.out.println("El area del circulo es:"+circulo.areaCirculo());
		
		Cuadrado cuadrado=new Cuadrado();
		cuadrado.setLado(4);
		System.out.println("El area del cuadrado es:"+cuadrado.areaCuadrado());

	}

}
