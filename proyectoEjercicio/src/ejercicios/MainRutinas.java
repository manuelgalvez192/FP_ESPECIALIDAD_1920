package ejercicios;

import java.util.Scanner;

public class MainRutinas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Escribe el numero del ejercicio");
		EjerciciosRutinas ejs = new EjerciciosRutinas();
		int op;
		op = sc.nextInt();
		switch(op)
		{
		case 1:
			ejs.Ejercicio1(sc, op);
			break;
		case 2:
			ejs.Ejercicio2(sc, op, op);
		case 3:
			ejs.Ejercicio3(sc, op, op);
			break;
		case 4:
			ejs.Ejercicio4(sc, op, op);
			break;
		}
		
		sc.close();
		
	}

}
