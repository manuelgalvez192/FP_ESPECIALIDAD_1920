package ejercicios;

import java.util.Scanner;

import java.util.Random;

import java.lang.Math;

public class EjerciciosUtils {

	Random rd = new Random();
	
	public void Ejercicio1(Scanner _sc)
	{
		String s;
		char a;
		System.out.println("Introduce una cadena");
		_sc.nextLine();
		s=_sc.nextLine();
		System.out.println("Introduce un caracter");
		a=_sc.next().charAt(0);
		int cantidad=0;
		for(int i=0;i<s.length();i++)
		{
			char car=s.charAt(i);
			if(car == a)
			{
				cantidad++;
			}
		}
		System.out.println(cantidad);
	}

	public void Ejercicio2(Scanner _sc)
	{
		String cadena;
		int dig=0;
		int espacio=0;
	    int letra=0;
	    boolean letrilla = true;
		System.out.println("Introduce una cadena y escribire cuantas letras, digitos y espacioes tiene");
		_sc.nextLine();
		cadena=_sc.nextLine();
		for(int i=0;i<=cadena.length()-1;i++)
		{
			letrilla=true;
			
			if(cadena.charAt(i)=='0' || cadena.charAt(i)=='1'  
			|| cadena.charAt(i)=='2' || cadena.charAt(i)=='3' || cadena.charAt(i)=='4' 
			|| cadena.charAt(i)=='5' || cadena.charAt(i)=='6' || cadena.charAt(i)=='7'
			|| cadena.charAt(i)=='8' || cadena.charAt(i)=='9')
			{
				dig++;
				letrilla=false;
			}
			if(Character.isWhitespace(cadena.charAt(i)))
			{
				espacio++;
				letrilla=false;
			}
				
			if(letrilla==true)
			{
				letra++;
			}
		}
		System.out.println(dig);
		System.out.println(espacio);
		System.out.println(letra);
	}
	
	public void Ejercicio3(Scanner _sc)
	{
		String cadena;
		int posicion;
		System.out.println("Escribe una cadena y te la mostrare al reves");
		_sc.nextLine();
		cadena=_sc.nextLine();
		posicion=cadena.length()-1;
		while(posicion>=0)
		{
			System.out.print(cadena.charAt(posicion));
			posicion--;
		}
	}
	
	public void Ejercicio4(Scanner _sc)

	{
		double a;
		double b;
		System.out.println("Escribe el area de la base y la altura y calculare el area de una base");
		b=_sc.nextDouble();
		a=_sc.nextDouble();
		
		System.out.println("El area de la piramide "+((b*b)*a)/3);
	}
	
	public void Ejercicio5(Scanner _sc)
	{
		int a;
		int b;
		int c=0;
		System.out.println("Tienes 3 intentos para adivinar un numero del 1 al 100");
		a= rd.nextInt(101);
		b=_sc.nextInt();
		while(c<7)
		{
			
			if(c==6)
			{
				System.out.println("Has fallado");
				c=7;
			}
		
			if(a==b)
			{
				System.out.println("Correcto");
			}
			if(a<b)
			{
				System.out.println("Prueba con un nuemro menor");
			}
			if(a>b)
			{
				System.out.println("Prueba con un nuemro mayor");
			}
			b=_sc.nextInt();
			c++;
		}
		
	}

	public void Ejercicio6(Scanner _sc)

	{
		String a="";
		String b="";
		int lim=0;
		int i=0;
		
		_sc.nextLine();
		System.out.println("Primera cadena");
		a=_sc.nextLine();
		System.out.println("Segunda cadena");
		b=_sc.nextLine();
		
		lim=a.length()-1;
				
		while(i<=lim)
		{
			if(a.charAt(i)==b.charAt(i))
			{
				a = a.replace(a.charAt(i), a.toUpperCase().charAt(i));
			}
			i++;
		}
		System.out.println(a);
	}
	
	public void Ejercicio7(Scanner _sc)
	{
		String a="";
		char b;
		int i;
		System.out.println("Escribe una cadena y la pondre modo espejo");
		_sc.nextLine();
		a=_sc.nextLine();

		for(i=a.length()-2;i>=0;i--)
		{
			b=a.charAt(i);
			a=a+b;
		}
		System.out.println(a);
	}
	
	public void Ejercicio8(Scanner _sc)
	{
		double angulo;
		double conversion;
		System.out.println("Los cosenos de los angulos de 0 a 90 de 5 en 5");
		for(angulo=0;angulo<=90;angulo=angulo+5)
		{
			conversion=angulo/(Math.PI/4);
			System.out.println(Math.cos(conversion));
		}
	}
	
	public void Ejercicio9(Scanner _sc)
	{
		int x;
		int y;
		double a;
		System.out.println("Da un valor a x");
		x=_sc.nextInt();
		System.out.println("Da un valor a y");
		y=_sc.nextInt();
		a=(x+4*Math.pow(y,3));
		System.out.println(y^3);
		System.out.println("La raiz cuadrada de x + 4*y^3 es "+Math.sqrt(a));
	}
	
	public void Ejercicio10(Scanner _sc)
	{
		int x;
		int y;
		int a;
		System.out.println("Escribe un valor para x");
		x=_sc.nextInt();
		System.out.println("Escribe un valor para y");
		y=_sc.nextInt();
		a=x*y;
		System.out.println(a);
		System.out.println("La raiz cubica de su producto es "+Math.pow(a, 1/3));
	}
	
	public void Ejercicio11(Scanner _sc)
	{
		String a="";
		System.out.println("Escribe una cadena y eliminare los espacion en blanco");
		_sc.nextLine();
		a=_sc.nextLine();
		System.out.println(a.replace(" ", ""));
	}
	
	public void Ejercicio12(Scanner _sc)
	{
		int a;
		int b;
		System.out.println("Escribe la medida del primer cateto");
		a=_sc.nextInt();
		System.out.println("Escribe la medida del segundo cateto");
		b=_sc.nextInt();
		System.out.println("La medida de la hipotenusa es: "+Math.sqrt((a*a)+(b*b)));
	}
	
	/*public void Ejercicio13(Scanner _sc)
	{
		String cadena; 
		String primera="";
		String segunda="";
		int i;
		int espacios=0;
		System.out.println("Escribe una cadena y cambiare la primera y ultima palabra");
		_sc.nextLine();
		cadena=_sc.nextLine();
		for(i=0;i<cadena.length()-1;i++)
		{
			while(i<cadena.length())
			{
				if(Character.isWhitespace(i))
					espacios++;
			}
		}
		while(Character.isWhitespace(cadena.charAt(i)))
		{
			primera=primera+cadena.charAt(i);
			i++;
		}
		System.out.println(segunda+cadena+primera);
	}
	*/
	
	public void Ejercicio14(Scanner _sc)
	{
		int radio;
		System.out.println("Dame el radio de la esfera");
		radio=_sc.nextInt();
		System.out.println("La superficie es: "+4*Math.PI*radio*radio);
		System.out.println("Ahora el volumen: "+4/3*Math.PI*Math.pow(radio, 3));
	}
	
	public void Ejercicio15(Scanner _sc)
	{
		int numero;
		int letra;
		System.out.println("Escribe un numero de DNI");
		numero=_sc.nextInt();
		letra=numero%23;
		switch(letra)
		{
		case 0:
			System.out.println(numero+"T");
			break;
		case 1:
			System.out.println(numero+"R");
			break;
		case 2:
			System.out.println(numero+"W");
			break;
		case 3:
			System.out.println(numero+"A");
			break;
		case 4:
			System.out.println(numero+"G");
			break;
		case 5:
			System.out.println(numero+"M");
			break;
		case 6:
			System.out.println(numero+"Y");
			break;
		case 7:
			System.out.println(numero+"F");
			break;
		case 8:
			System.out.println(numero+"P");
			break;
		case 9:
			System.out.println(numero+"D");
			break;
		case 10:
			System.out.println(numero+"X");
			break;
		case 11:
			System.out.println(numero+"B");
			break;
		case 12:
			System.out.println(numero+"N");
			break;
		case 13:
			System.out.println(numero+"J");
			break;
		case 14:
			System.out.println(numero+"Z");
			break;
		case 15:
			System.out.println(numero+"S");
			break;
		case 16:
			System.out.println(numero+"Q");
			break;
		case 17:
			System.out.println(numero+"V");
			break;
		case 18:
			System.out.println(numero+"H");
			break;
		case 19:
			System.out.println(numero+"L");
			break;
		case 20:
			System.out.println(numero+"C");
			break;
		case 21:
			System.out.println(numero+"K");
			break;
		case 22:
			System.out.println(numero+"E");
			break;
			
		}
	}
	
	public void Ejercicio16(Scanner _sc)
	{
		int a;
		System.out.println("Un número al azar de un dado: ");
		a=rd.nextInt(6);
		if(a==0)
		{
			a++;
			System.out.println(a);
		}
		else
		{
			System.out.println(a);
		}
	}
	
	public void Ejercicio17(Scanner _sc)
	{
		int radio;
		int angulo;
		System.out.println("Escribe un angulo y un radio");
		angulo=_sc.nextInt();
		radio=_sc.nextInt();
		System.out.println("El sector es: "+(Math.PI*Math.pow(radio, 2)*angulo)/360);
	}
}










