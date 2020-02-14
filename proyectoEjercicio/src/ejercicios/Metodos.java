package ejercicios;

import java.util.Scanner;

public class Metodos 
{
	public int Ejercicio1(int _a, int _b)
	{
		System.out.println("Escribe los dos numeros a sumar");
		MostrarValores(_a , _b);
		return _a+_b;//por que es una funcion, porque el profe nos lo ha pedido asi, pero se podria hacer de otras formas
	}
//puedo hacer lo de mostrar valores porque luego lo he "definido" como un static, por eso puedo crear el mostrar valores arriba y despues ponerlo abajo sin mas, si quitas el static te dice que tururu
	public static void MostrarValores(int _a , int _b)//SIEMPRE QUE PONGAS UN PARAMETRO HAY QUE INDICARLE ANTES SU TIPO, los parametros de antes no son los mismos, yo los veo igual porque le he dado el mismo nombre, pero he cerrado llaves antes asi que no son los mismos para java, era como el subalgoritmo de pseint que le dabamos otro nombre a esos parametros y aun asi lo entendia porque te permite cambiarle el nombre
	{
		System.out.println(_a+_b);//aqui no defino el tipo de los parametros porque ya lo he definido arriba y estan dentro de las mismas llaves
	}
	
	public int Ejercicio2(Scanner _sc,int _a, int _b)
	{
		System.out.println("Escribe un numero y  dire si es primo o no");
		_a = _sc.nextInt();
		_b=_a;
		Primo(_a, _b);
		return _a;
	}
	
	public static void Primo(int _a, int _b)
	{
		_b--;
		while(_b>1)
		{
			if(_a==1 || _a==2)
			{
				System.out.println("Es primo");	
				_b=2;
			}
			if(_a%_b==0)
			{
				System.out.println("No es primo");
				_b = 2;
			}
			else
			{
				System.out.println("Es primo");
				_b--;
			}
				
		}
	}

	public int Ejercicio3(Scanner _sc, int _a, int _b)
	{
		System.out.println("Escribe un numero del que hacer el factorial");
		_b=1;
		for(_a=_sc.nextInt();_a>0;--_a)
		{
			_b=_b*_a;
		}
		System.out.println("El factorial de "+_a+" es:"+_b);
		return _b;
	}

	public void Ejercicio4(Scanner _sc)
	{
		int a;
		int b;
		int c;
		System.out.println("Escribe un numero");
		a=_sc.nextInt();
		System.out.println("Escribe que numero quieres que encuentre");
		b=_sc.nextInt();
		c=0;
		while(a>10)
		{
			
			if(a%10==b)
			{
				System.out.println("Hay una ocurrencia en "+c);
			}
			
			a=a/10;
			c++;
		}
		System.out.println("-1");	
	}

	public void Ejercicio5(Scanner _sc)
	{
			int n;
			int a;
			int para;
			int m;
			int b;
			int c;
			System.out.println("Escribe un numero y lo escribire al reves");
			n = _sc.nextInt();
			c=n;
			b=0;
			para=0;
			m=0;
			a=n;
			while(n>10)
			{
				n=n/10;
				b++;
			}
			n=c;
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
			while(b>=para);
		}

	public void Ejercicio6(Scanner _sc)
	{
		int a;
		int r;
		String string;
		System.out.println("Escribe un numero decimal y lo pasare a binario");
		a=_sc.nextInt();
		string="";
		while(a>0)
		{
			r=a%2;
			string=r+string;
			a=a/2;
		}
		System.out.println(string);
	}

	public void Ejercicio7(Scanner _sc)
	{
		int a;
		int r;
		String string;
		System.out.println("Escribe un numero en decimal y lo pasare al octal");
		a =_sc.nextInt();
		string="";
		while(a>0)
		{
			r=a%8;
			string=r+string;
			a=a/8;
		}
		System.out.println(string);
	}

	public void Ejercicio8(Scanner _sc)
	{
		int a;
		int r;
		String string;
		System.out.println("Escribe un numero en decimal y lo pasare a hexadecimal");
		a=_sc.nextInt();
		string="";
		while(a>0)
		{
			r=a%16;
			if(r==10)
				System.out.print("A");
			if(r==11)
				System.out.print("B");
			if(r==12)
				System.out.print("C");
			if(r==13)
				System.out.print("D");
			if(r==14)
				System.out.print("E");
			if(r==15)
				System.out.print("F");
			if(r<10)
				string=string+r;
			a=a/16;
		}
		System.out.println(string);
	}

	public void Ejercicio9(Scanner _sc)
	{
		int a;
		int b;
		System.out.println("Escribe un numero y dare los primos anteriores");
		a=_sc.nextInt();
		a--;
		b=a--;
		while(a>0)
		{
			while(b>1)
			{
				if(a%b==0)
				{
					System.out.println(+a+" no es primo");
					b=1;
				}
				b--;
			}
			a--;
			b=a--;
		}
		
	}

	public void Ejercicio10(Scanner _sc)
	{
		int a;
		int b;
		int c;
		System.out.println("Escribe un numero y hare los factoriales desde 0 hasta el numero");
		a=_sc.nextInt();
		b=1;
		c=a;
		while(a>0)
		{
			while(a>0)
			{
				b=b*a;
				a--;
			}
			System.out.println(b);
			b=1;
			c--;
			a=c;
		}
	}

	public String Ejercicio11(Scanner _sc)
	{
		int a;
		int b;
		String operacion;
		System.out.println("Escribe suma, resta, multiplicacion o division");
		_sc.nextLine();
		a=0;
		b=0;
		operacion=_sc.nextLine();
		if(operacion.contentEquals("suma"))
		{
			Suma(_sc, a, b);
		}
		if(operacion.contentEquals("resta"))
		{
			Resta(_sc, a, b);
		}
		if(operacion.contentEquals("multiplicacion"))
		{
			Multiplicacion(_sc, a, b);
		}
		if(operacion.contentEquals("division"))
		{
			Division(_sc, a, b);
		}
		
		return operacion;
	}
	
	public static void Suma(Scanner _sc, int _a, int _b)
	{
		System.out.println("Escribe los numeros que quieres sumar");
		_a=_sc.nextInt();
		_b=_sc.nextInt();
		System.out.println(_a+_b);
	}
	public static void Resta(Scanner _sc, int _a, int _b)
	{
		System.out.println("Escribe los numeros que quieres sumar");
		_a=_sc.nextInt();
		_b=_sc.nextInt();
		System.out.println(_a-_b);
	}
	public static void Multiplicacion(Scanner _sc, int _a, int _b)
	{
		System.out.println("Escribe los numeros que quieres sumar");
		_a=_sc.nextInt();
		_b=_sc.nextInt();
		System.out.println(_a*_b);
	}
	public static void Division(Scanner _sc, int _a, int _b)
	{
		System.out.println("Escribe los numeros que quieres sumar");
		_a=_sc.nextInt();
		_b=_sc.nextInt();
		System.out.println(_a/_b);
	}
	
	public String Ejercicio12(Scanner _sc)
	{
		String numeracion;
		int a;
		int r;
		String string;
		string="";
		a=0;
		r=0;
		System.out.println("Escribe el a que sistema quieres que pase el numero");
		_sc.nextLine();
		numeracion = _sc.nextLine();
		if(numeracion.contentEquals("binario"))
		{
			Binario(_sc, a, string, r);
		}
		if(numeracion.contentEquals("octal"))
		{
			Octal(_sc, a, string, r);
		}
		if(numeracion.contentEquals("hexadecimal"))
		{
			Hexadecimal(_sc, a, string, r);
		}
		
		return numeracion;
	}
	
	public static void Binario(Scanner _sc, int _a, String _string, int _r)
	{
		System.out.println("Escribe el numero");
		_a=_sc.nextInt();
		while(_a>0)
		{
			_r=_a%2;
			_string = _r+_string;
			_a/=2;
		}	
		System.out.println(_string);
	}
	public static void Octal(Scanner _sc, int _a, String _string, int _r)
	{
		System.out.println("Escribe el numero");
		_a=_sc.nextInt();
		while(_a>0)
		{
			_r=_a%8;
			_string = _r+_string;
			_a/=8;
		}	
		System.out.println(_string);
	}
	public static void Hexadecimal(Scanner _sc, int _a, String _string, int _r)
	{
		System.out.println("Escribe el numero");
		_a=_sc.nextInt();
		while(_a>0)
		{
			
			_r=_a%16;
			if(_r==15)
			{
				_string ="F"+_string;
			}
			if(_r==14)
			{
				_string ="E"+_string;
			}
			if(_r==13)
			{
				_string ="D"+_string;
			}
			if(_r==12)
			{
				_string ="C"+_string;
			}
			if(_r==11)
			{
				_string ="B"+_string;
			}
			if(_r==10)
			{
				_string ="A"+_string;
			}
			if(_r<10)
			{
				_string=_r+_string;
			}
			_a/=16;
		}
		System.out.println(_string);
	}
	
}


/* Explicación de ejercicio1:
Nostros creamos un MostrarValores con los parametros
que les llamamos como queramos, y como luego hacemos el 
MostrarValores otra vez abajo ahi coge esos parametros.
Por esos los parametros de Ejercicio1 no son los mismo que los de
p.s.v MostrarValores, pero el ejercicio lo hace bien porque el primer
MostrarValores esta dentro de Ejercicio1, entonces es como que
el MostrarValores "llama" al p.s.v MostrarValores, que es el que hace
la operacion.
*/