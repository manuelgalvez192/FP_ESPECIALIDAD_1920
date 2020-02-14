package ejercicios;

import java.util.Scanner;

public class MainEjerciciosPseInt {
	
	public static void main (String[] args) //el static solo se usa en una clase sobre la que llamamos a sus metodos
	{
		Scanner sc = new Scanner(System.in);
	//aqui  abres el scanner
	System.out.println("Escribe el numero del ejercicio");
	EjerciciosPseInt ejs = new EjerciciosPseInt();//aqui lo pones en el objeto para que el objeto sepa que va a haber scanners ahi
	int op = sc.nextInt();
	switch(op)
	{
		case 1:
			ejs.Ejercicio1(sc);//aqui se lo vuelves a poner porque aunque el mostrarInfo va dentro del objeto, luego es un void distinto
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
			ejs.Ejercicios11(sc);
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
		case 17:
			ejs.Ejercicio17(sc);
		break;
		case 18:
			ejs.Ejercicio18(sc);
		break;
		case 19:
			ejs.Ejercicio19(sc);
		break;
		case 20:
			ejs.Ejercicio20(sc);
		break;
		case 21:
			ejs.Ejercicio21(sc);
		break;
		case 22:
			ejs.Ejercicio22(sc);
		break;
		case 23:
			ejs.Ejercicio23(sc);
		break;
		case 24:
			ejs.Ejercicio24(sc);
		break;
		case 25:
			ejs.Ejercicio25(sc);
		break;
		case 26:
			ejs.Ejercicio26(sc);
		break;
		case 27:
			ejs.Ejercicio27(sc);
		break;
		case 28:
			ejs.Ejercicio28(sc);
		break;
		case 29:
			ejs.Ejercicio29(sc);
		break;
		case 30:
			ejs.Ejercicio30(sc);
		break;
		case 31:
			ejs.Ejercicio31(sc);
		break;
		case 32:
			ejs.Ejercicio32(sc);
		break;
		default: System.out.println("Bad option"); break;
}
	sc.close();
	}
}
