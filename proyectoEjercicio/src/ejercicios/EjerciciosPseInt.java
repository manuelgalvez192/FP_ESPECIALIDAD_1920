package ejercicios;

import java.util.Scanner;

public class EjerciciosPseInt
{
	

//mira picha tu sabes el segundo constructor, pues aqui igual, le das un nombre
//y su valor del parametro y luego en el main pones pues el valor que tendria
// lo que pasa que aqui lo que seria el valor no es un numero o un true o algo
//es un sc del nombre que le das
	public void Ejercicio1(Scanner _sc)
	{
		double altura1;
		double base1;
		double altura2;
		double base2;
		double area1;
		double area2;

		System.out.println("Dime la altura y la base del primer triangulo");
		
		altura1 = _sc.nextDouble();//al poner esto coge el scanner con su parametro y todo y como en el otro tienes el abrir y aqui se lo mandas te lo abre, tambien te lo guarda, y tambien te lo cierra
		
		base1 = _sc.nextDouble();
		System.out.println("Dime la altura y la base del segundo triangulo");
		
		altura2 = _sc.nextDouble();
		
		base2 = _sc.nextDouble();
		area1 = altura1*base1/2;
		area2 = altura2*base2/2;
		
		if(area1>area2)
			System.out.println("El area del primero es mayor");
		else
			System.out.println("El area del segundo es mayor");
		}
		
	public void Ejercicio2 (Scanner _sc)
	{
		int horas;
		int extras;
		double salario;
		System.out.println("por cada hora trabajada gana 5€");
		System.out.println("Escriba el numero de horas que ha trabajado");
		horas = _sc.nextInt(); 
		System.out.println("Escriba el numero de horas extra ha trabajado");
		extras = _sc.nextInt();
		salario = (horas*5) + ((50*extras/100)+extras);
		System.out.println("Su salario es de "); System.out.println(salario);
	}
	
	public void Ejercicio3 (Scanner _sc)
	{
		int A;
		int B;
		int C;
		System.out.println("Escriba el primer numero");
		A = _sc.nextInt();
		System.out.println("Escriba el segundo numero");
		B = _sc.nextInt();
		C = A;
		A = B;
		B = C;
		System.out.println(A);
		System.out.println(B);
	}
	
	public void Ejercicio4 (Scanner _sc)
	{
		double A;
		double B;
		double C;
		System.out.println("Dime tres numeros distintos");
		A = _sc.nextDouble();
		B = _sc.nextDouble();
		C = _sc.nextDouble();
		if (A>C && A>B)
		{
			System.out.println("El primer numero es el mayor");
		}
		if (B>C && B>A)
		{
			System.out.println("El segundo numero es el mayor");
		}
		if (C>B && C>A)
		{
			System.out.println("El tercer numero es el mayor");
		}
	}
	
	public void Ejercicio5 (Scanner _sc)
	{
		double A;
		double B;
		double C;
		
		System.out.println("Dime tres numeros, si el primer es negativo los multiplicare, sino los sumare");
		
		A = _sc.nextDouble();
		B = _sc.nextDouble();
		C = _sc.nextDouble();
		
		if(A<0)
			System.out.println(A*B*C);
		else
			System.out.println(A+B+C);
		}

	public void Ejercicio6 (Scanner _sc)
	{
		double A;
		
		System.out.println("Escribe un numero positivo del cual hare la raiz cuadrada y su cuadrado");
		A = _sc.nextDouble();
		if(A<0)
			System.out.println("Error");
		else
			System.out.println("El cuadrado de "+A+" es "+A*A);
		System.out.println("La raiz cuadrada de "+A+" es "+Math.sqrt(+A));
	}
	
	public void Ejercicio7 (Scanner _sc)
	{
		int A;
		int B;
		int TOTAL;
		System.out.println("Escribe el numero de chcicos del colegio");
		A = _sc.nextInt();
		System.out.println("Escribe el numero de chicas del colegio");
		B = _sc.nextInt();
		TOTAL = A + B;
		System.out.println("El porcentaje de chicos es de un "+A*100/TOTAL);
		System.out.println("El porcentaje de chicas es de un "+B*100/TOTAL);	
	}
	
	public void Ejercicio8 (Scanner _sc)
	{
		String mes;
		int precio;
		 
		System.out.println("Escribe el mes de la compra");
		_sc.nextLine();
		mes = _sc.nextLine();
		System.out.println("Escribe el precio de la compra");
		precio = _sc.nextInt();
		if (mes.contentEquals("octubre"))
			System.out.println("El precio de la compra es " +(precio-(precio*15/100)));
		else
			System.out.println("El precio de la compra es " +precio);
	}

	public void Ejercicio9 (Scanner _sc)
	{
		int A;
		A=0;
		System.out.println("Este es el cuadrado de los 9 primeros numeros naturales");
		while (A<10)
		{
			System.out.println(A*A);
			A=A+1;
		}
	}
	
	public void Ejercicio10 (Scanner _sc)

	{
		double mates;
		double lengua;
		double ingles;
		double biologia;
		double quimica;
		double fisica;
		double media;
		double matricula;
		System.out.println("El precio de la matricula es de 400€");
		System.out.println("Dime la nota de matematicas");
		mates = _sc.nextDouble();
		System.out.println("Dime la nota de lengua");
		lengua = _sc.nextDouble();
		System.out.println("Dime la nota de ingles");
		ingles = _sc.nextDouble();
		System.out.println("Dime la nota de biologia");
		biologia = _sc.nextDouble();
		System.out.println("Dime la nota de quimica");
		quimica = _sc.nextDouble();
		System.out.println("Dime la nota de fisica");
		fisica = _sc.nextDouble();
		media = (mates + lengua + ingles + biologia + quimica + fisica)/6;
		matricula=400;
		if (media>=4)
			System.out.println("El precio de la matricula es = "+(matricula-(matricula*30/100)));
		else
			System.out.println("El precio de la matricula es = "+(matricula+(matricula*10/100)));
	}
	
	public void Ejercicios11 (Scanner _sc)
	{
		double horas;
		String turno;
		String tipo;
	
		System.out.println("La tarifa diurna son de 10€, la tarifa nocturna son de 13.5€");
		System.out.println("Si es festivo la tarifa incrementa un 10% si es diurno y un  15% nocturno");
		System.out.println("Escriba su nombre");
		_sc.nextLine();
		_sc.nextLine();
		System.out.println("Escriba el dia de la semana en el que trabajo");
		_sc.nextLine();
		System.out.println("Escriba el numero de horas que trabajo");
		horas = _sc.nextDouble();
		System.out.println("Escriba si trabajo en turno nocturno o diurno");
		_sc.nextLine();
		turno = _sc.nextLine();
		System.out.println("Escriba si el dia fue festivo o no festivo");
		tipo = _sc.nextLine();
		if(turno.contentEquals("diurno") && tipo.contentEquals("no festivo")) 
		{	
			System.out.println("Su sueldo es de "+horas*10);
		}
		else if(turno.contentEquals("diurno") && tipo.contentEquals("festivo"))
		{
			System.out.println("Su sueldo es de "+(horas*10+(horas*10/100)));
		}
		else if(turno.contentEquals("nocturno") && tipo.contentEquals("no festivo"))
		{
			System.out.println("Su sueldo es de "+(horas*13.5));
		}	
		else if(turno.contentEquals("nocturno") && tipo.contentEquals("festivo"))
		{	
			System.out.println("Su sueldo es de "+(horas*13.5+(horas*15/100)));
		}			
	}

	public void Ejercicio12 (Scanner _sc)
	{
		System.out.println("Escriba un numero y dire si es par o impar");
		int numero = _sc.nextInt();
		if(numero%2==0 && numero!=0)
		{
			System.out.println("El numero es par");
		}
			else 
			{
				if(numero%2!=0) 
				{
				System.out.println("El numero es impar");
				}
				else
				{
					System.out.println("El numero no es par ni impar");
				}
	}
	}
	
	public void Ejercicio13 (Scanner _sc)
	{
		double a;
		double b;
		System.out.println("Escribe dos numeros hare su division");
		System.out.println("El primer numero es");
		a = _sc.nextInt();
		System.out.println("El segundo numero es");
		b = _sc.nextInt();
		if(b==0)
			System.out.println("Error");
			else 
				System.out.println("El resultado es "+a/b);
	}
	
	public void Ejercicio14 (Scanner _sc)
	{
		double a;
		double b;
		System.out.println("Escribe dos numero y dire cuantos de ellos son positivos");
		a = _sc.nextDouble();
		b = _sc.nextDouble();
		if(a>0 && b>0)
			System.out.println("Los dos numeros son positivos");
		else
			if(a>0 && b<0)
				System.out.println("Solo el primer numero es positivo");
			else
				if(a<0 && b>0)
					System.out.println("Solo el segundo numero es positivo");
				else
					System.out.println("Ninguno de los dos numeros es positivo");
	}
	
	public void Ejercicio15(Scanner _sc)
	{
		String tituloBachiller;
		String pruebaAcceso;
		System.out.println("Para acceder al grado superior necesita tener bachillerato superado");
		System.out.println("O haber aprobado la prueba de acceso");
		System.out.println("Escriba si el titulo de bachillerato lo tiene aprobado o no");
		_sc.nextLine();
		tituloBachiller = _sc.nextLine();
		if(tituloBachiller.contentEquals("aprobado"))
		{
			System.out.println("Puede acceder al grado superior");
		}
			else
			{
			System.out.println("Escriba si tiene la prueba de acceso aprobada o no");
			pruebaAcceso = _sc.nextLine();
			if(pruebaAcceso.contentEquals("aprobada"))
				System.out.println("Puede acceder al grado superior");

			else
				System.out.println("No puede acceder al grado superior");
	}
	}
	
	public void Ejercicio16 (Scanner _sc)
	{
		int dia;
		int mes;
		int año;
		System.out.println("Dime un dia");
		dia = _sc.nextInt();
		System.out.println("Dime un mes");
		mes = _sc.nextInt();
		System.out.println("Dime un año");
		año = _sc.nextInt();
		if(dia<1 || dia>31 || mes>12 || mes<1 || año<0)
			System.out.println("Error");
		else
		if(mes == 1)
			System.out.println(+dia+ "de enero del"+año);
			else
				if(mes == 2)
					System.out.println(+dia+ "de febrero del"+año);
				else 
					if(mes == 3)
						System.out.println(+dia+ "de marzo del"+año);
					else 
						if(mes == 4)
							System.out.println(+dia+ "de abril del"+año);
						else 
							if(mes == 5)
								System.out.println(+dia+ "de mayo del"+año);
							else
								if(mes == 6)
									System.out.println(+dia+ "de junio del"+año);
								else 
									if(mes == 7)
										System.out.println(+dia+ "de julio del"+año);
									else 
										if(mes == 8)
											System.out.println(+dia+ "de agosto del"+año);
										else 
											if(mes == 9)
												System.out.println(+dia+ "de septiembre del"+año);
											else 
												if(mes == 10)
													System.out.println(+dia+ "de octubre del"+año);
												else 
													if(mes == 11)
														System.out.println(+dia+ "de noviembre del"+año);
													else 
														if(mes == 12)
															System.out.println(+dia+ "de diciembre del"+año);
			}
			
	public void Ejercicio17 (Scanner _sc)
	{
		String nombre;
		double a;
		double b;
		double c;
		System.out.println("Escribe el nombre del alumno");
		_sc.nextLine();
		nombre = _sc.nextLine();
		System.out.println("Escriba la nota de la parte teorica");
		a = _sc.nextDouble();
		if(a<0 || a>10)
			System.out.println("Error");
		else
			System.out.println("Escriba la nota de la parte practica");
			b = _sc.nextDouble();
			if(b<0 || b>10)
				System.out.println("Error");
			else
				System.out.println("Escriba la nota de la parte de problemas");
				c = _sc.nextDouble();
				if(c<0 || c>10)
					System.out.println("Error");
		System.out.println("La nota del alumno "+nombre+" es "+((a*40/100)+(b*10/100)+(c*50/100)));
	}
	
	public void Ejercicio18(Scanner _sc)
	{
		int a;
		int b;
		b=0;
		System.out.println("Escribe un numero y hare el cuadrado de lo siguientes 9");
		a = _sc.nextInt();
		while (b<9)
		{
			a=a+1;
			System.out.println(a*a);
			b=b+1;
			
		}
	}
	
	public void Ejercicio19(Scanner _sc)
	{
		int numero;
		int vueltas;
		int N;
		int guardanumero;
		System.out.println("Escribre un numero y hare la suma de lo siguientes N numeros pares");
		numero = _sc.nextInt();
		N=numero;
		vueltas = 0;
		guardanumero = 0;
		while (vueltas<N)
		{
			if(numero%2==0)
			{
				guardanumero=guardanumero+numero;
				vueltas=vueltas+1;
			}
			numero=numero+1;
		}
		System.out.println(guardanumero);
	}

	public void Ejercicio20(Scanner _sc)
	{
		int a;
		int b;
		System.out.println("Escribe un numero del que hare su tabla de multiplicar de 0 a 10");
		a = _sc.nextInt();
		b=0;
		while (b<11)
		{
			System.out.println(a*b);
			b=b+1;
		}
	}
	
	public void Ejercicio21(Scanner _sc)
	{
		int a;
		int b;
		int c;
		c=0;
		b=0;
		a=0;
		while(a>=0)
		{
			System.out.println("Escribe un numero");
			c=c+a;
			a = _sc.nextInt();
			b=b+1;
		}
		System.out.println(c/(b-1));
	}

	public void Ejercicio22(Scanner _sc)
	{
		String pass;
		System.out.println("Escribe la contraseña");
		System.out.println("Le quedan 3 intentos");
		_sc.nextLine();
		pass = _sc.nextLine();
		if(pass.contentEquals("eureka"))  
		{
			System.out.println("Correcto");
		}
			else
			{
				System.out.println("Quedan 2 intentos");	
				pass = _sc.nextLine();
					if(pass.contentEquals("eureka"))
					{
						System.out.println("Correcto");
					}
					else
					{
						System.out.println("Queda 1 intento");
						pass = _sc.nextLine();
						if(pass.contentEquals("eureka"))
						{
							System.out.println("Correcto");
						}
							else
							{
								System.out.println("Ha agotado los 3 intentos");
							}
					}
			}	
	}
	
	public void Ejercicio23 (Scanner _sc)
	{
		int n;
		double gpm;
		int max;
		int min;
		double vueltas;
		vueltas=0;
		gpm=0;
		max=0;
		System.out.println("Escribe numeros hasta teclear el 0, y te dire el maximo, el minimo y la media");
		n = _sc.nextInt();
		min=n;
		while(n>0)
		{
			if(n>max)
			{
				max=n;
			}
			gpm = gpm + n;
			vueltas=vueltas+1;
			n = _sc.nextInt();
			if((n<min) && (n!=0))
			{
				min=n;
			}
		}
		System.out.println("La media es "+gpm/(vueltas-1));
		System.out.println("El maximo es "+max);
		System.out.println("El minimo es "+min);
	}

	public void Ejercicio24(Scanner _sc)
	{
		int n;
		n=0;
		System.out.println("Los numeros multiplos de 2 y 3 son lo siguientes");
		while(n<=100)
		{
			if(n%2==0 || n%3==0)
			{
				System.out.println(+n);
			}
			n=n+1;
		}
	}

	public void Ejercicio25(Scanner _sc)
	{
		int n;
		int a;
		int primero;
		int segundo;
		System.out.println("Escribe cuantas veces se hace la serie de Fibonacci");
		n = _sc.nextInt();
		a=0;
		primero=1;
		segundo=0;
		while(a<n)
		{	
			
			segundo=segundo+primero;
			primero=segundo-primero;
			a=a+1;
		}
		System.out.println(segundo);
	}

	public void Ejercicio26(Scanner _sc)//revisar parte dos, esto es imposible
	{
		int opcion;
		int a;
		int b;
		int n;
		int m;
		System.out.println("Elige opcion 1: factorial de un numero ");
		System.out.println("U opcion 2: factorial de los numeros entre dos dados");
		opcion = _sc.nextInt();
		if(opcion==1)
		{
			System.out.println("Escribe un numero del que hacer el factorial");
			a = _sc.nextInt(); 
			b = 1;
			while(a>0)
			{
				b=b*a;
				a--;
			}
			System.out.println(b);
		}
		if(opcion==2)
		{
			System.out.println("Escribe los limites. El primer numero es el mayor");
			a = _sc.nextInt();
			b = _sc.nextInt();
			a--;
			m=a;
			n=1;
			while(a>b)
			{
				while(n<a)
				{
					a=a*n;
					n++;
				}
				System.out.println(a);
				m--;
				a=m;
				n=1;
		
			}
		}
	}

	public void Ejercicio27(Scanner _sc)//ver otra forma, esto tambien
	{
		int n;
		System.out.println("Escribire si un numero es primo entre 1 y un numero dado");
		
		n = _sc.nextInt();
		while(n>0)
		{
			if((n%2==0 && n!=2) || (n%3==0 && n!=3) || (n%5==0 && n!=5) || (n%7==0 && n!=7) || (n%11==0 && n!=11))
			{
				System.out.println(+n+" no es primo");
			}
				else
				{
				System.out.println(+n+" es primo");
				}
			n=n-1;
		}
	}

	public void Ejercicio28(Scanner _sc)

	{
		int decimal;
		int r1=0;
		int r2=0;
		int r3=0;
		int r4=0;		
		//String binary;
		System.out.println("Escribe un numero en decimal y lo pasare a binario");
		decimal = _sc.nextInt();
			if(decimal%2!=0)
			{
				r1=1;
			}
			else
				{
					r1=0;
				}
			decimal=decimal/2;
			if(decimal%2!=0)
			{
				r2=1;
			}
			else
				{
					r2=0;
				}
			decimal = decimal/2;
			if(decimal%2!=0)
			{
				r3=1;
			}
			else
				{
					r3=0;
				}
			decimal=decimal/2;
			if(decimal%2!=0)
			{
				r4=1;
			}
			else
				{
					r4=0;
				}
			System.out.println(+r4+""+r3+""+r2+""+r1);
	}

	public void Ejercicio29(Scanner _sc)
	{	
		int a;
		int b;
		System.out.println("Escribe un numero y pondre cuantas cifras tiene");
		a = _sc.nextInt();
		b=1;
		if(a<10)
		{
			System.out.println("Tiene 1 cifra");
		}
		else
		{
			while(a>=10)
			{
				a=a/10;
				b=b+1;
			}
			System.out.println("Tiene "+b+" cifras");
		}
	}

	public void Ejercicio30(Scanner _sc)
	{
		int a;
		int b;
		int c;
		int d;
		System.out.println("Escribe un numero y hare un cuadrado de ese tamaño");
		a = _sc.nextInt();
		b=a;
		c=a-2;
		while(a>0)
		{
			System.out.print("*");
			a--;
		}
		a=b;
		System.out.println("");
		
		while(c>0)
		{
		System.out.print("*");
		d=a-2;
		while(d>0) {
			System.out.print(" ");
			d--;
		}
		System.out.print("*");
		System.out.println("");
		c--;
		}
		while(a>0)
		{
			System.out.print("*");
			a--;
		}
		
		
	}

	public void Ejercicio31(Scanner _sc)
	{
		int a;
		int b;
		int espacio;
		int espacio2;
		int espacio3;
		System.out.println("Escribe un numero y hare una piramide invertida de esa altura");
		a = _sc.nextInt();
		b=a;
		espacio=0;
		espacio2=0;
		espacio3=0;
		while(a>0)
		{
			while(espacio2>0)
			{
				System.out.print(" ");
				espacio2--;
			}
			while(b>0)
			{
				System.out.print("*");
				b--;
			}
			while(espacio3>0)
			{
				System.out.print(" ");
				espacio3--;
			}
			System.out.println("");
			espacio++;
			espacio2=espacio;
			espacio3=espacio;
			a--;
			a--;
			b=a;
		}
		
	}

	public void Ejercicio32(Scanner _sc)
	{
		int a;
		int par;
		int impar;
		String op;
		System.out.println("Escribe una seria de numeros hasta que escribas 0");
		System.out.println("E ire escribiendo si el numero es par o impar");
		a = _sc.nextInt();
		par=0;
		impar=0;
		while(a>0)
		{
			if(a%2==0)
			{
				System.out.println("Es par");
				par=a+par;
			}
			else
			{
				System.out.println("Es impar");
				impar=a+impar;
			}
			a = _sc.nextInt();
		}
		System.out.println("¿Quieres que haga la suma de los numeros pares e impares?");
		_sc.nextLine();
		op = _sc.nextLine();
		if(op.contentEquals("si"))
		{
			System.out.println(+par+" "+impar);
		}
	}
}