package ejercicios;

import java.util.Random;

import java.util.Scanner;

public class Arrays {
	
	Scanner sc = new Scanner(System.in);
	Random rd = new Random();
	public enum semaforo {ROJO,AMARILLO,VERDE};
	
	public void Ejercicio_0()
	{
		for (semaforo s2: semaforo.values())
		{
			System.out.println(s2);
		}
	}
	
	public enum semana {Lunes, Martes, Miercoles, Jueves, Viernes, Sabado, Domingo};
	
	public void Ejercicio_1()
	{
		for (semana sem: semana.values())
		{
			System.out.println(sem);
		}
	}
	
	public enum meses {Enero, Febrero, Marzo, Abril, Mayo, Junio, Julio, Agosto, Septiembre, Octubre, Noviembre, Diciembre};
	
	public void Ejercicio_2()
	{
		for(meses mes: meses.values())
		{
			System.out.println(mes);
		}
	}
	
	public enum vehiculos {Coche, Moto, Bicicleta, Patinete, Tanque, Autobus, Camion, patines};
	
	public void Ejercicio_3()
	{
		for(vehiculos veh: vehiculos.values())
		{
			System.out.println(veh);
		}
	}
	
	public enum marcas {Renault, Opel, Audi, Volkswagen, Peugeot, Citroen, Ford, Hyundai, Jaguar, Dacia, Ferrari}
		
	public void Ejercicio_4()
	{
		for(marcas mar: marcas.values())
		{
			System.out.println(mar);
		}
	}
	
	public enum sangre {Padre, Madre, Hermane, Tio, Tia, Prime, Abuelo, Abuela, Consuegro, Suegra, Mujer, Hijo, Hija, primo2, primo3}
	
	public void Ejercicio_5()
	{
		for(sangre san: sangre.values())
		{
			System.out.println(san);
		}
	}
	public void Eja() 
	{
		double[] A= new double[3];
		double x;
		for (int i=0; i<A.length; i++)
		{
			A[i] = i*3;
			System.out.println(A[i]);
		}
		x = A[0]+A[1]+A[2]; 
		System.out.print(x);
	}
	
	public void Ejb()
	{
		int[] B = new int[5];
		B[4]=1;
		
		B[B[4]]=2;
		B[B[B[4]]]=0;
		B[B[B[B[4]]]]=3;
		B[B[B[B[B[4]]]]]=4;
		System.out.println(B[0]);
		System.out.println(B[1]);
		System.out.println(B[2]);
		System.out.println(B[3]);
		System.out.println(B[4]);
	}
	
	
	public void Ejc()
	{
		double[] C= new double[4];
		double y;
		for (int i=C.length-1; i>=0; i--)
		{
			C[i] = i/2;
			System.out.println(C[i]);
		}
		y = C[0]+C[1]+C[2]+C[3];
		System.out.println(y);
	}
	
	public void Ejercicio2()
	{
		int[] numeros = new int[100];	
		for(int c=0;c<=numeros.length;c++)
		{
			System.out.println(c); 
		}
	}
	
	public void Ejercicio3()
	{
		int[] numeros = new int[100];	
		for(int c=numeros.length-1;c>=0;c--)
		{
			System.out.println(c); 
		}
	}
	
	public void Ejercicio4()
	{
		int[] numeros = new int[100];	
		for(int c=0;c<=numeros.length;c++)
		{
			if(c%2==0)
			System.out.println(c); 
		}
	}
	
	public void Ejercicio5()
	{
		int[] numeros = new int[100];	
		for(int c=0;c<=numeros.length;c++)
		{
			if(c%2!=0)
			System.out.println(c); 
		}
	}
	
	public void Ejercicio6()
	{
		int a;
		int resto=0;
		int[] numeros = new int [100];
		for(int i=0;i<=numeros.length-1;i++)
		{
			a=i;
			while(a>0)
			{
				if(i%a==0)
				{
					resto++;
				}
				a--;
			}
			if(resto<=2)
			{
				System.out.println(i);
			}
			resto=0;
		}
	}
	
	public void Ejercicio7()
	{
		int[] numero=new int[200];
		int num=0;
		int num1=0;
		for(int c=0;c<=numero.length-1;c++)
		{
			c=rd.nextInt(201);
			num=c;
			if(num1>num)
			{
				num=num1;
			}
		}
		System.out.println(num);
				
	}
	
	public void Ejercicio8()
	{
		int[] numeros = new int[200];
		int num=0;
		int num1=0;
		for (int c=0;c<=numeros.length-1;c++)
		{
			num=rd.nextInt(200);
			num1=num+num1;
		}
		System.out.println(num1);
	}

	public void Ejercicio9()
	{
		int[] circular = new int[100];
		for(int c=0;c<=circular.length;c++)
		{
			System.out.println(c);
			if(c==circular.length)
			{
				c=0;
			}
		}
	}

	public void Ejercicio10()
	{
		int[] entero = new int[200];
		for(int i=0;i<entero.length;i++)
		{
			if(i % 2 == 0)
			{
				System.out.println(i);
				//para que muestre el primer par y saga pones despues del syso i=201;
			}
		}
	}
	
	public void Ejercicio11()
	{
		double num;
		double a=0;
		double b=0;
		double c=1;
		double d=1;
		double[] numeros = new double[10];
		for(double i = 0;i < numeros.length;i++)
		{
			num=sc.nextInt();
			a=num+a;
			b=b-num;
			c=num*c;
			d=d/num;
		}
		System.out.println("SUMA:"+a+"  RESTA:"+b+" MULTIPLICACION:"+c+" DIVISION:"+d);
	}
	
	public void Ejercicio12 ()
	{
		int a;
		System.out.println("Escribe el tamaño del arreglo");
		a=sc.nextInt();
		int[] arr = new int[a];
		System.out.println("Rellena el arreglo");
		for(int c=0;c<arr.length;c++)
		{
			arr[c]=sc.nextInt();
		}
		int aux=0;
		for(int j=0;j<arr.length;j++)
		{
			for(int c=0;c<arr.length-1;c++)
			{
				if(arr[c]>arr[c+1])
				{
					aux=arr[c];
					arr[c]=arr[c+1];
					arr[c+1]=aux;
				}
			}
		}
		int k=0;
		while(k<a)
		{
			System.out.println(arr[k]);
			k++;
		}
	}
	
	public void Ejercicio13()
	{
		int arr1[] = new int[5];
		int arr2[] = new int[5];
		int arr[] = new int[1];
		System.out.println("Se recogen numeros en dos arrays y se muestran en solo uno");
		for(int i=0;i<arr1.length;i++)
		{
			arr1[i]=i;
		}
		for(int i=0;i<arr1.length;i++)
		{
			arr2[i]=i;
		}
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr1.length;j++)
			{
				System.out.println(arr1[j]);
			}
			for(int m=0;m<arr2.length;m++)
			{
				System.out.println(arr2[m]);
			}	
		}
	}
	
	public void Ejercicio14()
	{
		int arr1[] = new int[5];
		int arr2[] = new int[5];
		System.out.println("Se recogen numeros en un primer array y se multiplican por dos en otro");
		for(int i=0;i<arr1.length;i++)
		{
			arr1[i]=i;
		}
		for(int i=0;i<arr2.length;i++)
		{
			arr2[i]=arr1[i]*2;
			System.out.println(arr2[i]);
		}
	}
	
	public void Ejercicio15()
	{
		int arr1[] = new int[5];
		int arr2[] = new int[5];
		int arr3[] = new int[5];
		System.out.println("Se recogen 5 numeros en un primer array, se los da a otro, multiplicados por dos, y se muestran en un tercero");
		for(int i=0;i<arr1.length;i++)
		{
			arr1[i]=i;
		}
		for(int i=0;i<arr2.length;i++)
		{
			arr2[i]=arr1[i]*2;
			arr3[i]=arr2[i];
		}
		for(int i=0;i<arr3.length;i++)
		{
			System.out.println(arr3[i]);
		}
		
	}
	
	public void Ejercicio16()
	{
		int a=0;
		int arr[] = new int[101];
		System.out.println("La suma de los 100 primeros numeros pares es:");
		for(int i=0;i<arr.length;i++)
		{
			if(i%2==0)
			{
				arr[i]=i;
				a=a+i;
			}
		}
		System.out.println(a);
	}

	public void Ejercicio17()
	{
		double num=0;
		double div=0;
		double media=0;
		int arr1[] = new int[10];
		System.out.println("Escribe 10 nums, los almaceno en un array y muestro la media");
		for(int i=0;i<arr1.length;i++)
		{
			arr1[i]=sc.nextInt();
			num=num+arr1[i];
			div++;
		}
		media=num/div;
		System.out.println("La media es "+media);
		
	}
	
	public void Ejercicio18()
	{
		int a;
		int aux;
		System.out.println("¿Cuantos numeros quieres introducir?");
		a=sc.nextInt();
		int arr[] = new int[a];
		for(int i = 0 ; i < arr.length ; i++)
		{
			System.out.println("Escribe un numero");
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length-1;j++)
			{
				if(arr[j]>arr[j+1])
				{
					aux=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=aux;
				}
			}
		}
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
	}
	
	public void Ejercicio19()
	{
		int positivos=0,negativos=0,cero=0, arr[]=new int[10];
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("Rellena");
			arr[i]=sc.nextInt();
			if(arr[i]>0)
			{
				positivos++;
			}
			else {
				if(arr[i]<0)
				{
					negativos++;
				}
				else {
					cero++;
				}
			}
		}
		System.out.println("Hay "+positivos+" numeros positivos");
		System.out.println("Hay "+negativos+" numeros negativos");
		System.out.println("Hay "+cero+" ceros");
	}
	
	public void Ejercicio20()
	{
		int positivos=0,negativos=0,cero=0, arr[]=new int[10];
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("Rellena");
			arr[i]=sc.nextInt();
			if(arr[i]>0)
			{
				positivos++;
			}
			else {
				if(arr[i]<0)
				{
					negativos++;
				}
				else {
					cero++;
				}
			}
		}
		System.out.println("Hay "+positivos+" numeros positivos");
		System.out.println("Hay "+negativos+" numeros negativos");
		System.out.println("Hay "+cero+" ceros");
	}
	
	public void Ejercicio21()
	{
		int a;
		int posicion=1;
		int arr[]= new int[20];
		System.out.println("Rellena el array");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("Elige el numero");
		a=sc.nextInt();
		for(int i=0;i<arr.length;i++)
		{
			if(a==arr[i])
			{
				System.out.println("Esta en la posicion "+posicion);
			}
			posicion++;
		}
	}
	
	public void Ejercicio22()
	{
		int a,mayor=0,repiteMayor=0,menor=99,repiteMenor=0;
	
		System.out.println("Escribe el tamaño del array");
		a=sc.nextInt();
		int arr[]=new int[a];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		for(int j=0;j<arr.length;j++)
		{
		if(arr[j]>mayor)
		{
			mayor=arr[j];
		}
		
		if(arr[j]<menor)
		{
			menor=arr[j];
		}
		}
		for(int j=0;j<arr.length;j++)
		{
			if(arr[j]==menor)
			{
				repiteMenor++;
			}
			if(arr[j]==mayor)
			{
				repiteMayor++;
			}
		}
			
		
		System.out.println("El mayor es "+mayor+" el menor es "+menor);
		System.out.println("El mayor se repite "+repiteMayor);
		System.out.println("El menor se repite "+repiteMenor);
	}
	
	public void Ejercicio23()
	{
		int tamaño;
		double sumaAlturas=0, media;
		int superior=0, inferior=0;
		System.out.println("Escribe el numero de las personas");
		tamaño=sc.nextInt();
		double arr[] = new double[tamaño];
		System.out.println("Escribe la altura de las personas");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextDouble();
			sumaAlturas=sumaAlturas+arr[i];
		}
		media=sumaAlturas/tamaño;
		System.out.println("La media de la altura es "+media);
		for(int i=0;i<tamaño;i++)
		{
			if(arr[i]<media)
			{
				inferior++;
			}
			if(arr[i]>media)
			{
				superior++;
			}
		}
		System.out.println("Hay "+superior+" personas que superan la media");
		System.out.println("Hay "+inferior+" personas que no superan la media");
	}
	
	public void Ejercicio24()
	{
		String palabra;
		int suma=0,a=0;
		System.out.println("Escribe una palabra");
		palabra=sc.nextLine();
		for(int i=0;i<=palabra.length()-1;i++)
		{
			System.out.println(palabra.charAt(a));
			suma++;
			a++;
		}
		System.out.println("La palabra tiene "+suma+" caracteres");
	}
	
	public void Ejercicio200()
	{
		int tamaño;
		String op;
		int num;
		int cantidadIntroducidos=0;
		System.out.println("Da el tamaño del array");
		tamaño=sc.nextInt();
		int[] array = new int[tamaño];	
		System.out.println("Escribe manual o aleatorio");
		sc.nextLine();
		op=sc.nextLine();
		boolean esManual = op.toLowerCase().contentEquals("manual");
		while (cantidadIntroducidos < array.length) 
		{
			num = esManual ? sc.nextInt() : rd.nextInt(10);
			if (num % 2 == 0)
			{
				array[cantidadIntroducidos] = num;
				++cantidadIntroducidos;
			}
		}
			
		for (int i = 0; i < array.length; i++)
		{
			System.out.println(array[i]);
		}
	}
}




/*	public void Ejercicio1()
{
	String cad[]= {"Lunes","Martes","Miercoles","Jueves","Viernes","Sabado","Domingo"};
	
	for(int i=0;i<=4;i++) {
		System.out.println(cad[i]);
	}
	*/








