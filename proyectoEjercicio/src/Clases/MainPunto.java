package Clases;

public class MainPunto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Punto p1 = new Punto();//Creamos un objeto de la clase punto
		p1.setAbscisa(7);//Le asignamos un valor 20 al atributo abscisa
		p1.setOrdenada(7);
		p1.getAbscisa();// obtenemos el valor del atributo abscisa
		System.out.println("El valor de la x es "+p1.getAbscisa()+" y el valor de la y es "+p1.getOrdenada());//Mostramos por pantalla el valor
	}
}
