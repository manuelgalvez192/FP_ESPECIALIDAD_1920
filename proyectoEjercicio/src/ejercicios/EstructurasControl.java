package ejercicios;

import java.util.Scanner;

public class EstructurasControl {
	
	public void Ejercicio1(Scanner _sc)
	{
		int num;
		System.out.println("Escribe un numero de un digito y pondre su equivalente en letra");
		num = _sc.nextInt();
		switch(num)
		{
		case 1:
			System.out.println("A");
		break;
		case 2:
			System.out.println("B");
		break;
		case 3:
			System.out.println("C");
		break;
		case 4:
			System.out.println("D");
		break;
		case 5:
			System.out.println("E");
		break;
		case 6:
			System.out.println("F");
		break;
		case 7:
			System.out.println("G");
		break;
		case 8:
			System.out.println("H");
		break;
		case 9:
			System.out.println("I");
		break;
		}
	}
	
	public void Ejercicio2(Scanner _sc)
	{
		int edad;
		int op;
		System.out.println("Introduzca su edad");
		System.out.println("Si es menor de 14 años: opcion 1. Si entre 14 y 26: opcion 2.");
		System.out.println("Si entre 27 y 59: opcion 3. Si mayor de 60: opcion 4");
		edad = _sc.nextInt();
		op=0;
		if(edad<14)
		{
			op=1;
		}
		if(edad>=14 && edad<=26)
		{
			op=2;
		}
		if(edad>=27 && edad<=59)
		{
			op=3;
		}
		if(edad>=60)
		{
			op=4;
		}
		switch(op)
		{
		case 1:
			System.out.println("Infancia");
		break;
		case 2:
			System.out.println("Juventud");
		break;
		case 3:
			System.out.println("Adultez");
		break;
		case 4:
			System.out.println("Mayor");
		break;
		}
	}

	public void Ejercicio3(Scanner _sc)
	{
		String letra;
		int op;
		System.out.println("Escribe un numero romano y escribire su equivalente en decimal");
		_sc.nextLine();
		letra = _sc.nextLine();
		op=0;
		if(letra.contentEquals("I"))
		{
			op=1;
		}
		if(letra.contentEquals("V"))
		{
			op=2;
		}
		if(letra.contentEquals("X"))
		{
			op=3;
		}
		if(letra.contentEquals("L"))
		{
			op=4;
		}
		if(letra.contentEquals("C"))
		{
			op=5;
		}
		if(letra.contentEquals("D"))
		{
			op=6;
		}
		if(letra.contentEquals("M"))
		{
			op=7;
		}
		switch(op)
		{
		case 1:
			System.out.println("1");
		break;
		case 2:
			System.out.println("5");
		break;
		case 3:
			System.out.println("10");
		break;
		case 4:
			System.out.println("50");
		break;
		case 5:
			System.out.println("100");
		break;
		case 6:
			System.out.println("500");
		break;
		case 7:
			System.out.println("1000");
		break;
	}
		
	}

	public void Ejercicio4(Scanner _sc)
	{
		String operacion;
		int op;
		int n;
		int m;
		System.out.println("Escribe la operacion que desea realizar");
		op=1;
		_sc.nextLine();
		operacion = _sc.nextLine();
		if(operacion.contentEquals("suma"))
		{
			op=1;
		}
		if(operacion.contentEquals("resta"))
		{
			op=2;
		}
		if(operacion.contentEquals("multiplicacion"))
		{
			op=3;
		}
		if(operacion.contentEquals("division"))
		{
			op=4;
		}
		switch(op)
		{
		case 1:
			System.out.println("Escribe los dos numeros con los que operar");
			n = _sc.nextInt();
			m = _sc.nextInt();
			System.out.println(n+m);
		break;
		case 2:
			System.out.println("Escribe los dos numeros con los que operar");
			n = _sc.nextInt();
			m = _sc.nextInt();
			System.out.println(n-m);
		break;
		case 3:
			System.out.println("Escribe los dos numeros con los que operar");
			n = _sc.nextInt();
			m = _sc.nextInt();
			System.out.println(n*m);
		break;
		case 4:
			System.out.println("Escribe los dos numeros con los que operar");
			n = _sc.nextInt();
			m = _sc.nextInt();
			System.out.println(n/m);
		break;
		}
	}

	public void Ejercicio5(Scanner _sc)
	{
		int op;
		String area;
		int n;
		int m;
		int h;
		System.out.println("Escribe el area que quiere calcular");
		_sc.nextLine();
		area = _sc.nextLine();
		op=0;
		if(area.contentEquals("triangulo"))
		{
			op=1;
		}
		if(area.contentEquals("trapecio"))
		{
			op=2;
		}
		if(area.contentEquals("cuadrado"))
		{
			op=3;
		}
		if(area.contentEquals("rectangulo"))
		{
			op=4;
		}
		if(area.contentEquals("circulo"))
		{
			op=5;
		}
		switch (op)
		{
		case 1:
			System.out.println("Escribe los lados de tu traingulo");
			n = _sc.nextInt();
			m = _sc.nextInt();
			System.out.println("El area del triangulo es "+n*m/2);
		break;
		case 2:
			System.out.println("Escribe el lado mayor, el menor y la altura del trapecio");
			n = _sc.nextInt();
			m = _sc.nextInt();
			h = _sc.nextInt();
			System.out.println("El area del trapecio es "+h*((n+m)/2));
		break;
		case 3:
			System.out.println("Escribe el lado de tu cuadrado");
			n = _sc.nextInt();
			System.out.println("El area del cuadrado es "+n*n);
		break;
		case 4:
			System.out.println("Escribe los lados de tu rectangulo");
			n = _sc.nextInt();
			m = _sc.nextInt();
			System.out.println("El area del cuadrado es "+n*m);
		break;
		case 5:
			System.out.println("Escribe el radio de tu circulo");
			n = _sc.nextInt();
			System.out.println("El area del circulo es "+Math.PI*(n^2));
		break;
		}
	}
		
	public void Ejercicio6(Scanner _sc) //ta mal
	{
		int n;
		int m;
		System.out.println("Escribe dos numero y escribire los numeros primos comprendido entre esos dos");
		n = _sc.nextInt();
		m = _sc.nextInt();
		do
		{
			if(n/2==1)
			{
				System.out.println(n);
			}
			n++;
		}
		while(n<m);
	}

	public void Ejercicio7(Scanner _sc)
	{
		int n;
		int m;
		System.out.println("Escribe un numero del que calculare la tabla de multiplicar");
		n = _sc.nextInt();
		m = 0;
		do 
		{
			System.out.println(n*m);
			m++;
		}
		while(m<11);
	}
	
	public void Ejercicio8(Scanner _sc)
	{
		int n;
		int menor;
		int mayor;
		System.out.println("Escribe una seria de numeros y dire cual es el menor y cual el mayor");
		n = _sc.nextInt();
		menor = n;
		mayor = n;
		do
		{
			if(n>mayor)
			{
				mayor = n;
			}
			if (n<menor && n!=0)
			{
				menor = n;
			}
			n = _sc.nextInt();
		}
		while(n>0);
		System.out.println("El menor es "+menor);
		System.out.println("El mayor es "+mayor);
	}

	public void Ejercicio9(Scanner _sc)

	{
		int n;
		int a;
		int para;
		int m;
		System.out.println("Escribe un numero de 4 cifras y lo escribire al reves");
		n = _sc.nextInt();
		para=0;
		m=0;
		a=n;
		if(n>=1000 && n<=9999)
		{
			do
			{
				n=n/10;
				m=a%10;
				m=(m*10)+(n%10);
				m=m/10;
				System.out.print(m);
				para++;
				a=n;
			}	
		while(para<=3);
		}
	}

	public void Ejercicio10(Scanner _sc)
	{
		int n;
		int para;
		int primero;
		int segundo;
		System.out.println("Escribe un numero y llegare a ese numero con la seria de Fibonacci");
		n = _sc.nextInt();
		para=0;
		primero=1;
		segundo=0;
		do
		{
			segundo=primero+segundo;
			primero=segundo-primero;
			para++;
			System.out.println(segundo);
		}
		while(para<n);
	}

	public void Ejercicio11(Scanner _sc)//no esta terminado
	{
		int n;
		System.out.println("Escribe un numero decimal y lo pasare a binario");
		n = _sc.nextInt();
		do
		{
			n=(n-n%2)/2;
		}
		while(n>0);
		System.out.println(n);
	}

	public void Ejercicio12(Scanner _sc)
	{
		int n;
		System.out.println("Escribire los numeros de 1 al 100");
		for (n=1;n<=100;n++)
		{
			System.out.println(n);
		}
		
	}

	public void Ejercicio13(Scanner _sc)
	{
		int n;
		System.out.println("Escribire los numeros primos entre 1 y 100");
		for(n=1;n<=100;++n)
		{
			if((n==1)||(n%2==0 && n!=2)||(n%3==0 && n!=3)||(n%5==0 && n!=5)||(n%7==0 && n!=7)||(n%11==0 && n!=11))
			{
				System.out.print("");
			}
			else
			{
				System.out.println(n);
			}
		}
	}

	public void Ejercicio14(Scanner _sc)
	{
		double n;
		double numero;
		double suma;
		System.out.println("Escribe 10 numeros y hare su suma y su promedio");
		suma = 0;
		for(n=1;n<11;n++)
		{
			numero = _sc.nextInt();
			suma = suma+numero;
		}
		System.out.println("Su suma es "+suma);
		System.out.println("Su media es "+suma/10);
	}

	public void Ejercicio15(Scanner _sc)
	{
		int n;
		double nota;
		int mayor;
		int menor;
		System.out.println("Escribe 10 notas y dire cuantos estan igual o por encima del 7 y cuantos no");
		mayor=0;
		menor=0;
		for (n=1;n<11;n++)
		{
			nota = _sc.nextDouble();
			if(nota>=7)
			{
				mayor++;
			}
			else
			{
				menor++;
			}
		}
		System.out.println("Hay "+mayor+" alumnos con una nota mayor o igual a 7");
		System.out.println("Hay "+menor+" alumnos con una nota menor a 7");
	}

	public void Ejercicio16(Scanner _sc)
	{
		int n;
		int numero;
		int tres;
		int cinco;
		int ambos;
		System.out.println("Escribe 10 numeros y dire cuantos son multiplos de 3, cuantos de 5 y cuantos de los dos a la vez");
		tres=0;
		cinco=0;
		ambos=0;
		for(n=1;n<11;n++)
		{
			numero = _sc.nextInt();
			if(numero%3==0)
			{
				tres++;
			}
			if(numero%5==0)
			{
				cinco++;
			}
			if(numero%3==0 && numero%5==0)
			{
				ambos++;
				tres--;
				cinco--;

			}
		}
		System.out.println(+tres+" numeros son multiplos de 3");
		System.out.println(+cinco+" numeros son multiplos de 5");
		System.out.println(+ambos+" numeros son multiplos de ambos");
	}
}

