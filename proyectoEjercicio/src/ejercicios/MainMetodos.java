package ejercicios;

import java.util.Scanner;

public class MainMetodos {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int op;
		Scanner sc = new Scanner (System.in);
		System.out.println("Escribe el numero del ejercicio");
		op = sc.nextInt();
		Metodos mtds = new Metodos();
		switch(op)
		{
		case 1:
			mtds.Ejercicio1(sc.nextInt(), sc.nextInt());//le he puesto aqui el "leer", pero tambien se podria hacer poniendolo adentro del onjeto
			break;
		case 2:
			mtds.Ejercicio2(sc, op, op);
			break;
		case 3:
			mtds.Ejercicio3(sc, op, op);
			break;
		case 4:
			mtds.Ejercicio4(sc);
			break;
		case 5:
			mtds.Ejercicio5(sc);
			break;
		case 6:
			mtds.Ejercicio6(sc);
			break;
		case 7:
			mtds.Ejercicio7(sc);
			break;
		case 8:
			mtds.Ejercicio8(sc);
			break;
		case 9:
			mtds.Ejercicio9(sc);
			break;
		case 10:
			mtds.Ejercicio10(sc);
			break;
		case 11:
			mtds.Ejercicio11(sc);
			break;
		case 12:
			mtds.Ejercicio12(sc);
			break;
		default:
			System.out.println("Bad option");
			break;
		}
		sc.close();
	}
	


}
