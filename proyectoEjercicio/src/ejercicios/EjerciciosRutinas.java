package ejercicios;

import java.util.Scanner;

public class EjerciciosRutinas
{
	public double Ejercicio1(Scanner _sc, int _r)
	{
		System.out.println("Escribe el radio del circulo");
		_r = _sc.nextInt();
		Radio(_r);
		return (Math.PI*_r*_r);
	}
	public static void Radio(int _r)
	{
		System.out.println(Math.PI*_r*_r);
	}
	
	public double Ejercicio2(Scanner _sc,int _n, int _a)
	{
		System.out.println("Escribe el numero que quieres elevar");
		_n = _sc.nextInt();
		System.out.println("Y el exponente");
		_a = _sc.nextInt();
		Elevado(_n,_a);
		return (Math.pow(_n,_a));
	}
	
	public static void Elevado(int _n,int _a)
	{

		
		System.out.println(Math.pow(_n,_a));
	}
	
	public void Ejercicio3(Scanner _sc,int _a, int _b)
	{
		System.out.println("Escriba el numero del que hacer el factorial");
		_a = _sc.nextInt();
		_b=_a;
		Exponente(_a,_b);
		System.out.println(_a);
		
	}
	
	public static int Exponente(int _a, int _b)
	{
		while(_b>0)
		{
			_b--;
			_a=_a*_b;
		}
		return _a;
	}
/*	
	public void Ejercicio4(Scanner _sc, int _opcion, double _a)
	{
		System.out.println("Elige la opcion de conversion. 1:libras->euros. 2:dolar->euros. 3:yen->euros");
		_opcion = _sc.nextInt();
		switch(_opcion)
		{
		case 1:
			Libras(_sc,_a);
			System.out.println(_a);
			break;
		case 2:
			Dolar(_sc,_a);
			System.out.println(_a);
			break;
		case 3:
			Yen(_sc,_a);
			System.out.println(_a);
			break;
		}
	}
	
	public static double Libras(Scanner _sc,double _a)
	{
		System.out.println("Escribe la cantidad a convertir");
		_a = _sc.nextDouble();
		_a = _a*1.22;
		return (_a);
	}
	public static double Dolar(Scanner _sc,double _a)
	{
		System.out.println("Escribe la cantidad a convertir");
		_a = _sc.nextDouble();
		_a = _a*0.75;
		return (_a);
	}
	public static double Yen(Scanner _sc,double _a)
	{
		System.out.println("Escribe la cantidad a convertir");
		_a = _sc.nextDouble();
		_a = _a*0.009;
		return (_a);
	}
	*/
	public double Ejercicio4(Scanner _sc, int _opcion, double _a)
	{
		System.out.println("Elige la opcion de conversion. 1:libras->euros. 2:dolar->euros. 3:yen->euros");
		_opcion = _sc.nextInt();
		switch(_opcion)
		{
		case 1:
			Libras(_sc,_a);
			break;
		case 2:
			Dolar(_sc,_a);
			break;
		case 3:
			Yen(_sc,_a);
			break;
		}
		return _a;
	}
	
	public static void Libras(Scanner _sc,double _a)
	{
		System.out.println("Escribe la cantidad a convertir");
		_a = _sc.nextDouble();
		_a = _a*1.22;
		System.out.println(_a);
	}
	public static void Dolar(Scanner _sc,double _a)
	{
		System.out.println("Escribe la cantidad a convertir");
		_a = _sc.nextDouble();
		_a = _a*0.75;
		System.out.println(_a);
	}
	public static void Yen(Scanner _sc,double _a)
	{
		System.out.println("Escribe la cantidad a convertir");
		_a = _sc.nextDouble();
		_a = _a*0.009;
		System.out.println(_a);
	}
	
	
}
