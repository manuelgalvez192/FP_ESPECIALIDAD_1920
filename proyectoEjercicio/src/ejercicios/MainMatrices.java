package ejercicios;
import java.util.Scanner;
public class MainMatrices {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Matrices ejs = new Matrices();
		System.out.println("Selecciona el ejercicio");
		int op = sc.nextInt();
		
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
			ejs.Ejercicio4(sc);
			break;
		case 5:
			ejs.Ejercicio5(sc);
			break;
		case 6:
			ejs.Ejercicio6(sc);
			break;
		case 7:
			ejs.Ejercicio7();
			break;
		case 8:
			ejs.Ejercicio8();
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
			ejs.Ejercicio12();
			break;
		case 13:
			ejs.Ejercicio13();
			break;
		}
	}

}
