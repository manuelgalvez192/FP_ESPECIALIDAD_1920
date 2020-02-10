package ejercicios;

import java.util.Scanner;

public class MainEstructuras {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int cod;
		
		EstructurasControl ejs = new EstructurasControl();
		System.out.println("Escribe el numero del ejercicio");
		cod = sc.nextInt();
		switch(cod)
		{
		case 1:
			ejs.Ejercicio1(sc);
		break;
		case 2:
			ejs.Ejercicio2(sc);
		break;
		case 3:
			ejs.Ejercicio3(sc);
		break;
		case 4:
			ejs.Ejercicio4(sc);
		break;
		case 5:
			ejs.Ejercicio5(sc);
		break;
		case 6:
			ejs.Ejercicio6(sc);
		break;
		case 7:
			ejs.Ejercicio7(sc);
		break;
		case 8:
			ejs.Ejercicio8(sc);
		break;
		case 9:
			ejs.Ejercicio9(sc);
		break;
		case 10:
			ejs.Ejercicio10(sc);
		break;
		case 11:
			ejs.Ejercicio11(sc);
		break;
		case 12:
			ejs.Ejercicio12(sc);
		break;
		case 13:
			ejs.Ejercicio13(sc);
		break;
		case 14:
			ejs.Ejercicio14(sc);
		break;
		case 15:
			ejs.Ejercicio15(sc);
		break;
		case 16:
			ejs.Ejercicio16(sc);
		break;
		
		}
		sc.close();		
		
	}

}
