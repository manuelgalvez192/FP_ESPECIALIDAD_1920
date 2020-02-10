package ejercicios;

import java.util.Scanner;

public class MainBateriaJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BateriaJava ejs = new BateriaJava();
		Scanner ds = new Scanner(System.in);
		System.out.println("Escribe el numero del ejercicio");
		int op=ds.nextInt();
		switch(op)
		{
		case 1:
			ejs.Ejercicio1();
			break;
		case 2:
			ejs.Ejercicio2();
			break;
		case 3:
			ejs.Ejercicio3();
			break;
		case 4:
			ejs.Ejercicio4();
			break;
		case 5:
			ejs.Ejercicio5();
			break;
		case 6:
			ejs.Ejercicio6();
			break;
		case 8:
			ejs.Ejercicio8();
			break;
		case 9:
			ejs.Ejercicio9();
			break;
		case 10:
			ejs.Ejercicio10();
			break;
		case 12:
			ejs.Ejercicio12();
			break;
		case 13:
			ejs.Ejercicio13();
			break;
		case 17:
			ejs.Ejercicio17();
			break;
		case 19:
			ejs.Ejercicio19();
			break;
		case 22:
			ejs.Ejercicio22();
			break;
		case 25:
			ejs.Ejercicio25();
			break;
		case 26:
			ejs.Ejercicio26();
			break;
		case 27:
			ejs.Ejercicio27();
			break;
		case 28:
			ejs.Ejercicio28();
			break;
		case 29:
			ejs.Ejercicio29();
			break;
		case 32:
			ejs.Ejercicio32();
			break;
		case 33:
			ejs.Ejercicio33();
			break;
		case 35:
			ejs.Ejercicio35();
			break;
			
			
			
		
		default:
				System.out.println("No ay + karajo");
				break;
		}
				
	
		ds.close();
	}

}
