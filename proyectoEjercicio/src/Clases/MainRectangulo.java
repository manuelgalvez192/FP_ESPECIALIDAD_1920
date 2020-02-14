package Clases;

import java.util.Scanner;

class MainRectangulo {


	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		double desplazarX,desplazarY;
		Rectangulo r1 = new Rectangulo();//Creamos un objeto de la clase punto
		Rectangulo r2 = new Rectangulo();
		r1.setAbscisa1(0);//Le asignamos un valor 20 al atributo abscisa
		r1.setOrdenada1(0);
		r1.getAbscisa1();// obtenemos el valor del atributo abscisa
		r1.setAbscisa2(3);
		r1.setOrdenada2(4);
		r1.setNombre("elManu");
		r2.setNombre("ElManuel");
		r1.establecerNombre("guapisimos");
		
		System.out.println("El valor de la x1 es "+r1.getAbscisa1()+" y el valor de la y1 es "+r1.getOrdenada1());//Mostramos por pantalla el valor
		System.out.println("El valor de la x2 es "+r1.getAbscisa2()+" y el valor de la y2 es "+r1.getOrdenada2());
		System.out.println("El numero de objetos creados es "+r1.getNumRectangulo());//se pone r1 porque es con quien has creado ese atributo
		System.out.println("El nombre del primer rectangulo es "+r1.getNombre());
		System.out.println("El nombre del segundo rectangulo es "+r2.getNombre());
		System.out.println("El nombre de las figuras es "+r1.getNombreFigura());
		System.out.println("El valor de Pi es "+r1.getPI());
		System.out.println("El nombre del rectangulo es "+r1.obtenerNombre());
		System.out.println("El valor de la superficie es "+r1.calcularSuperficie());
		System.out.println("El valor del perimetro es "+r1.calcularPerimetro());
		System.out.println("Cuanto quieres que se desplace la X");
		desplazarX=sc.nextDouble();
		System.out.println("Cuantos quieres que se desplace la Y");
		desplazarY=sc.nextDouble();
		r1.desplazar(desplazarX, desplazarY);
		System.out.println("Se han creado "+r1.obtenerNumRectangulo()+" rectangulos");
		sc.close();
	}
	
}
