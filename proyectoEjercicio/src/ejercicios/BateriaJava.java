package ejercicios;

import java.util.Scanner;

import java.util.Random;

public class BateriaJava {
	
	Random rd = new Random();
	Scanner sc = new Scanner (System.in);

	public void Ejercicio1()
	{
		int numero=0;
		int ingresado;
		System.out.println("Escribe 10 numeros y hare sus suma");
		for(int i=1;i<=10;i++)
		{
			ingresado=sc.nextInt();
			numero=ingresado+numero;
		}
		System.out.println(numero);
	}
			
	public void Ejercicio2()
	{
		int n;
		int a;
		int num=0;
		int metes;
		System.out.println("Escribe cuantas veces a sumar");
		n=sc.nextInt();
		a=n;
		System.out.println("Escribe los numeros que quieras");
		for(n=1;n<=a;n++)
		{
			metes=sc.nextInt();
			num=num+metes;
		}
		System.out.println(num);
	}
	
	public void Ejercicio3()
	{
		int año;
		System.out.println("Escribe un año y dire si es bisiesto o no");
		año=sc.nextInt();
		if(año%4==0 && año%100!=0)
		{
			System.out.println("Es bisiesto");
		}
		else if ((año%100==0 && año%400==0))
		{
			System.out.println("Es bisiesto");
		}
		else
		{
			System.out.println("No es bisiesto");
		}
	}
	
	public void Ejercicio4()
	{
		int año;
		int op;
		int dia;
		int mes;
		System.out.println("Escribe el dia");
		dia=sc.nextInt();
		System.out.println("Escribe un mes");
		mes=sc.nextInt();
		System.out.println("Escribe un año y dire si es bisiesto o no");
		año=sc.nextInt();
		if(año%4==0 && año%100!=0)
		{
			System.out.println("Es bisiesto");
			op=1;
		}
		else if ((año%100==0 && año%400==0))
		{
			System.out.println("El año introducido es bisiesto");
			op=1;
		}
		else
		{
			System.out.println("No es bisiesto");
			op=2;
		}
		
		switch(op)
		{
		case 1:
			dia++;
			if(dia==32)
			{
				dia=1;
			}
			else if(dia>32)
			{
				System.out.println("error");
				
			}
			mes++;
			if(mes==13)
			{
				mes=1;
			}
			else if(mes==2 && dia==29)	
			{
				dia=1;
			}
			año++;
			break;
		case 2:
			dia++;
			if(dia==32)
			{
				dia=1;
			}
			else if(dia>32)
			{
				System.out.println("error");
				
			}
			mes++;
			if(mes==13)
			{
				mes=1;
			}
			else if(mes==2 && dia==28)	
			{
				dia=1;
			}
			else if(mes>13)
			{
				System.out.println("Error");
			}
			año++;
			break;
			
		}
		System.out.println(dia+"/"+mes+"/"+año);
	}
	
	public void Ejercicio5()
	{
		int op;
		double galon;
		double pies;
		System.out.println("Elige el tipo de conversion 1:galones-litros, 2:pies");
		op=sc.nextInt();
		switch(op)
		{
		case 1:
			System.out.println("Escribe la cantidad de galones");
			galon=sc.nextInt();
			System.out.println("La cantidad en litros es: "+3.7854*galon);
			break;
		case 2:
			System.out.println("Escribe la medida en pies");
			pies=sc.nextInt();
			System.out.println("La cantidad en pulgadas es: "+12*pies);
			System.out.println("La cantidad en yardas es: "+0.33*pies);
			System.out.println("La cantidad en metros es: "+0.3048*pies);
			System.out.println("La cantidad en centimetros es: "+30.48*pies);
		}
	}

	public void Ejercicio6()
	{
		int a;
		System.out.println("De uno a 100 de galones a litros");
		
		for(a=1;a<=100;a++)
		{
			System.out.println(a+" galones son "+a* 3.7854+" litros");
			if(a%10==0)
			{
				System.out.println(" ");
			}
		}
	}
	
	public void Ejercicio8()
	{
		int num=0;
		int para=0;
		System.out.println("Los 100 numeros pares");
		while(para<101)
		{
			num++;
			if(num%2==0)
			{
				System.out.println(num);
			}
			para++;
		}
	}
	
	public void Ejercicio9()
	{
		int num=0;
		int para=0;
		System.out.println("Los 100 numeros impares");
		while(para<100)
		{
			num++;
			if(num%2!=0)
			{
				System.out.println(num);
			}
			para++;
		}	
	}

	public void Ejercicio10()
	{
		int num=0;
		int para;
		int suma=0;
		System.out.println("Suma de los pares entre 10 y 50");
		
		for(para=0;para<=50;para++)
		{
			num++;
			if(num%2==0)
			{
				suma=suma+num;
			}
		}
		System.out.println("La suma es: "+suma);
	}
	
	public void Ejercicio12()
	{
		int num;
		int div;
		int resto=0;
		System.out.println("Escribe un numero");
		num=sc.nextInt();
		div=num;
		while(div>=1)
		{
			if(num%div==0)
			{
				resto++;
			}
			div--;
		}
		if(resto>2)
		{
			System.out.println("No es primo");
		}
		else
		{
			System.out.println("Es primo");
		}
	}
	
	public void Ejercicio13()
	{
		int num=1;
		int div;
		int resto=0;
		int primo=0;
		System.out.println("100 primeros numeros primos");
		while(primo<100)
		{
			resto=0;
			div=1;
			while(div<=num)
			{
				if(num%div==0)
				{
					resto++;
				}
				div++;
			}
			if(resto<=2)
			{
				System.out.println(num);
				primo++;
			}
			num++;
		}
	}
	
	public void Ejercicio15()
	{
		double precio;
		double preciofinal;
		double preciodescuento=0;
		int IVA;
		System.out.println("Escribe el precio del producto");
		precio=sc.nextDouble();
		while(precio==0)
		{
			System.out.println("Ese precio no es valido");
			precio=sc.nextDouble();
		}
		System.out.println("Escribe el tipo de IVA");
		IVA=sc.nextInt();
		while(IVA!=4 || IVA!=10 || IVA!=21)
		{
			System.out.println("Ese IVA no es valido");
			IVA=sc.nextInt();
		}
			preciofinal=precio+(precio*IVA/100);
			if(preciofinal<10000 && preciofinal>=1000)
			{
				preciodescuento=preciofinal*5/100;
			}
			if(preciofinal>=10000)
			{
				preciodescuento=preciofinal*10/100;
			}
			
		System.out.println("El precio sin descuento es: "+preciofinal+" y el precio con descuento es: "+preciodescuento);
	}
	
	public void Ejercicio16() 
	{
		double cantidad;
		int meses;
		System.out.println("Escribe la cantidad a tripilcar");
		cantidad=sc.nextDouble();
		meses=0;
		while(cantidad<cantidad*3)
		{
			meses++;
			cantidad=cantidad*6/100;
		}
		System.out.println("La cantidad se triplica en "+meses+" meses");
		
	}
	
	public void Ejercicio17()
	{
		int numero;
		int num1;
		int num2;
		System.out.println("Escribe un numero");
		numero=sc.nextInt();
		num1=numero;
		num2=numero;
		while(num1>1)
		{
			while(num2>1)
			{
				if(num1*num2==numero)
				{
					System.out.println(num1+"*"+num2);
				}
				num2--;
			}
			num2=numero;
			num1--;
		}
	}
	
	public void Ejercicio19()
	{
		int num;
		int div=1;
		int para;
		int next=0;
		System.out.println("Escribe un numero y dire si es perfecto o no");
		num=sc.nextInt();
		para=num;
		while(num!=0)
		{
			while(para>1)
			{
					if(num%div==0)
					{
						next=div+next;
					}
					div++;
					para--;
			}
			if(next==num)
			{
				System.out.println("Es un numero perfecto");
			}
			else
			{
				System.out.println("No lo es");
			}
		System.out.println("Escribe otro numero");
		num=sc.nextInt();
		if(num==0)
		{
			System.out.println("Ese no se vale");
		}
		}
	}
	
	public void Ejercicio22()
	{
		int a,b;
		int cont=1;
		int resto=0;
		System.out.println("Escribe dos numeros");
		a=sc.nextInt();
		b=sc.nextInt();
		while(a-b>b)
		{
			a=a-b;
			cont++;
		}
		resto=a-b;
		System.out.println("La division es "+cont+" y el resto "+resto);
	}
	
	public void Ejercicio25()
	{
		int num=2;
		int suma;
		int ay=1;
		System.out.println("Hasta 1800");
		while(num<=1800)
		{
			if(ay%2==0)
			{
				suma=2;
			}
			else
			{
				suma=3;
			}
			System.out.println(num);
			num=num+suma;
			ay++;
		}
	}
	
	public void Ejercicio26()
	{
		int num;
		int para=0;
		int ast=0;
		int nivel;
		System.out.println("Escribe la altura de la piramide");
		num=sc.nextInt();
		nivel=1;
		while(para<num)
		{
			while(ast<nivel)
			{
				System.out.print("*");
				ast++;
			}
			System.out.println("");
			para++;
			nivel++;
			ast=0;
		}
	}
	
	public void Ejercicio27()
	{
		int num;
		int para=0;
		int ast=1;
		int nivel;
		System.out.println("Escribe la altura de la piramide");
		num=sc.nextInt();
		nivel=1;
		while(para<num)
		{
			while(ast<=nivel)
			{
				System.out.print(ast);
				ast++;
			}
			System.out.println("");
			para++;
			nivel++;
			ast=1;
		}
	}
	
	public void Ejercicio28()
	{
		int num;
		int a=1;
		System.out.println("Introducir numero");
		num=sc.nextInt();
		while(a<=num)
		{
			System.out.print(a);
			System.out.print(" ");
			System.out.print(a*a);
			System.out.print(" ");
			System.out.print(a*a*a);
			a++;
			System.out.println("");
		}
	}
	
	public void Ejercicio29()
	{
		int anterior=1;
		int actual=1;
		int num;
		int siguiente=0;
		System.out.println("Uno de fibonacci");
		num=sc.nextInt();
		for(int i=0;i<num;++i)
		{
			siguiente=actual+anterior;
			anterior=actual;
			actual=siguiente;
		}
		
		System.out.println(siguiente);
	}
	
	public void Ejercicio30()
	{
		int num;
		int intentos1;
		int intentos2=0;
		int escribe;
		System.out.println("num aleatorio");
		System.out.println("cuantos intentos");
		intentos1=sc.nextInt();
		num=rd.nextInt(201);
		while(intentos1>0)
		{
			escribe=sc.nextInt();
			if(num==escribe)
			{
				System.out.println("correcto");
				intentos1=0;
			}
			else
			{
				intentos2++;
				System.out.println("incorrecto");
				System.out.println("llevas "+intentos2);
			}
		}
		System.out.println("Has necesitado "+intentos2);
	}
	
	public void Ejercicio31()
	{
		int edad;
		int tarot=0;
		System.out.println("tarot");
		edad=sc.nextInt();
		while(edad>0)
		{
			edad=edad%10;
			edad=edad/10;
			if(edad<10)
			{
				tarot=tarot+edad;
				edad=tarot;
			}
		}
	}
	
	public void Ejercicio32()
	{
		int nivel, nivel1;
		System.out.println("U");
		nivel=sc.nextInt();
		nivel1=nivel-1;
		while(nivel1>0)
		{
			System.out.println("*   *");
			nivel1--;
		}
		System.out.println(" ***");
	}
	
	public void Ejercicio33()
	{
		int num;
		int palo;
		System.out.println("baraja");
		num=rd.nextInt(15); 
		palo=rd.nextInt(4);
		if(palo==0)
		{
			System.out.print("Picas");
		}
		if(palo==1)
		{
			System.out.print("Corazones");
		}
		if(palo==2)
		{
			System.out.print("Treboles");
		}
		if(palo==3)
		{
			System.out.print("Diamantes");
		}
		if(num==0)
		{
			while(num==0)
			{
				num=rd.nextInt();
			}
		}
		if(num==1)
		{
			System.out.println("A");
		}
		else
			if(num==11)
			{
				System.out.println("J");
			}
			else
				if(num==12)
				{
					System.out.println("Q");
				}
				else
					if(num==13)
					{
						System.out.println("K");
					}
					else
					{
						System.out.println(num);
					}
		
	}
	
	public void Ejercicio34()
	{
		String cadena;
		System.out.println("Escribe cadena");
		sc.nextLine();
		cadena=sc.nextLine();
		
		for(int i=0;i<=(cadena.length()-1)/2;i++)
		{
			System.out.println(cadena.charAt(i));
		}
	}
	
	public void Ejercicio35()
	{
		String op;
		int a=0;
		double num1;
		double num2;
		System.out.println("Elige operacion");
		op=sc.nextLine();
		if(op.contentEquals("*"))
		{
			a=1;
		}
		if(op.contentEquals("+"))
		{
			a=2;
		}
		if(op.contentEquals("-"))
		{
			a=3;
		}
		if(op.contentEquals("/"))
		{
			a=4;
		}
		if(op.contentEquals("%"))
		{
			a=5;
		}
		if(op.contentEquals("^"))
		{
			a=6;
		}
		switch(a)
		{	
		case 1:
			System.out.println("Introduce dos numeros");
			num1=sc.nextDouble();
			num2=sc.nextDouble();
			System.out.println(num1*num2);
			break;
		case 2:
			System.out.println("Introduce dos numeros");
			num1=sc.nextDouble();
			num2=sc.nextDouble();
			System.out.println(num1+num2);
			break;
		case 3:
			System.out.println("Introduce dos numeros");
			num1=sc.nextDouble();
			num2=sc.nextDouble();
			System.out.println(num1-num2);
			break;
		case 4:
			System.out.println("Introduce dos numeros");
			num1=sc.nextDouble();
			num2=sc.nextDouble();
			System.out.println(num1/num2);
			break;
		case 5:
			System.out.println("Introduce dos numeros");
			num1=sc.nextDouble();
			num2=sc.nextDouble();
			System.out.println(num1%num2);
			break;
		case 6:
			System.out.println("Introduce dos numeros");
			num1=sc.nextDouble();
			num2=sc.nextDouble();
			System.out.println(Math.pow(num1, num2));
			break;
		}
			
		
	}
	
	
	
	
	
	
	
	
	
	
	
}
