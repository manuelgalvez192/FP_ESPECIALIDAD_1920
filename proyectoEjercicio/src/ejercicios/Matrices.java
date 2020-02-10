package ejercicios;
import java.util.Scanner;
import java.util.Random;
public class Matrices {

	Random rd = new Random();
	
	public void Ejercicio1()
	{
		int mtrz[][] = new int[5][5];
		System.out.println("Una matriz 5X5 de datos aleatorios");
		for(int i=0;i<mtrz.length;i++)
		{
			for(int j=0;j<mtrz[i].length;j++)
			{
				mtrz[i][j]=rd.nextInt(50);
			}
		}
		
		for(int i=0;i<mtrz.length;i++)
		{
			for(int j=0;j<mtrz.length;j++)
			{
				System.out.print(mtrz[i][j]);
				System.out.print(" ");
			}
			System.out.println("");
		}
	}

	public void Ejercicio2()
	{
		int a=1;
		int mtrz[][] = new int[50][2];
		System.out.println("Matriz de 100 primeros numeros");
		for(int i=0;i<mtrz.length;i++)
		{
			for(int j=0;j<mtrz[i].length;j++)
			{
				mtrz[i][j]=a;
				System.out.print(mtrz[i][j]);
				System.out.print(" ");
				a++;
			}
			System.out.println("");
		}
	}
	
	public void Ejercicio3()
	{
		int a=1, columna1=0, columna2=0;
		boolean posicion=true;
		int mtrz[][] = new int[50][2];
		System.out.println("Matriz de 100 primeros numeros");
		for(int i=0;i<mtrz.length;i++)
		{
			for(int j=0;j<mtrz[i].length;j++)
			{
				mtrz[i][j]=a;
				System.out.print(mtrz[i][j]);
				System.out.print(" ");
				a++;
				if(posicion==true)
				{
					columna1=columna1+mtrz[i][j];
					posicion=false;
				}
				else
				{
					columna2=columna2+mtrz[i][j];
					posicion=true;
				}
				
			}
			System.out.println("");
		}
		System.out.println(columna1+" "+columna2);
	}
	
	public void Ejercicio4(Scanner _sc)
	{
		int a=0, x=0, y=0;
		int mtrz[][] = new int[2][25];
		System.out.println("La matriz de numeros pares");
		for(int i=0;i<mtrz.length;i++)
		{
			for(int j=0;j<mtrz[i].length;j++)
			{
				if(mtrz[i][j]%2==0)//Vas a mostrar el valor de la matriz cuando a sea par
				{//if(mtrz[i][j]%2==0) Vas a mostrar el valor de la matriz solo si es par
					mtrz[i][j]=a;
					System.out.print(mtrz[i][j]);
					System.out.print(" ");
				}
				a++;
			}
			System.out.println("");
		}
		
		System.out.println("Elige una posicion X");
		x=_sc.nextInt();
		System.out.println("Elige la posicion Y");
		y=_sc.nextInt();
		System.out.println(mtrz[x][y]);
	}
	
	public void Ejercicio5(Scanner _sc)
	{
		String mtrz[][]=new String[3][4];
		System.out.println("Introduce 4 nombres");
		_sc.nextLine();
		for(int i=0;i<=mtrz.length;i++)
		{
			
			mtrz[0][i]=_sc.nextLine();
			
		}
		System.out.println("Introduce sus apellidos");

		for(int i=0;i<=mtrz.length;i++)
		{
			
			mtrz[1][i]=_sc.nextLine();
		}
		System.out.println("Introduce sus segundos apellidos");
		
		for(int i=0;i<=mtrz.length;i++)
		{
			
			mtrz[2][i]=_sc.nextLine();
		}
		for(int i=0;i<mtrz.length;i++)
		{
			for(int j=0;j<mtrz[i].length;j++)
			{
				System.out.print(mtrz[i][j]);
				System.out.print(" ");
			}
			System.out.println("");
		}
	}
	
	public void Ejercicio6(Scanner _sc)
	{
		int a;
		int mtrz[][] = new int[4][5];
		for(int i=0;i<mtrz.length;i++)
		{
			for(int j=0;j<mtrz[i].length;j++)
			{
				mtrz[i][j]=rd.nextInt(10);
			}
		}
		System.out.println("La matriz es-->");
		for(int i=0;i<mtrz.length;i++)
		{
			for(int j=0;j<mtrz[i].length;j++)
			{
				System.out.print(mtrz[i][j]);
				System.out.print(" ");
			}
			System.out.println("");
		}
		a=rd.nextInt(10);
		System.out.println("El numero a buscar es "+a);
		boolean encontrado = false;
		for(int i=0;!encontrado&&i<mtrz.length;i++)
		{
			for(int j=0;!encontrado&&j<mtrz[i].length;j++)
			{
				if(a==mtrz[i][j])
				{
					System.out.println("Se repite en "+i+" "+j );
					encontrado=true;
				}
				
			}
		}
		if(encontrado==false)
		{
			System.out.println("Mala mia");
		}
	}

	public void Ejercicio7()
	{
		int mtrz[][]=new int[3][3];
		System.out.println("La matriz es -->");
		for(int i=0;i<mtrz.length;i++)
		{
			for(int j=0;j<mtrz[i].length;j++)
			{
				mtrz[i][j]=rd.nextInt(10);
				System.out.print(mtrz[i][j]);
				System.out.print(" ");
			}
			System.out.println("");
		}
		System.out.println("Su traspuesta es-->");
		for(int i=0;i<mtrz.length;i++)
		{
			for(int j=0;j<mtrz[i].length;j++)
			{
				System.out.print(mtrz[j][i]);
				System.out.print(" ");
			}
			System.out.println(" ");
		}
	}
	
	public void Ejercicio8()
	{
		int max=0, min=100;
		int mtrz[][] = new int[6][8];
		System.out.println("La matriz es-->");
		for(int i=0;i<mtrz.length;i++)
		{
			for(int j=0;j<mtrz[i].length;j++)
			{
				mtrz[i][j]=rd.nextInt(101);
				if(mtrz[i][j]>max)
				{
					max=mtrz[i][j];
				}
				if(mtrz[i][j]<min)
				{
					min=mtrz[i][j];
				}
				System.out.print(mtrz[i][j]);
				System.out.print(" ");
			}
			System.out.println("");
		}
		System.out.println("");
		System.out.println("El valor maximo es "+max);
		System.out.println("El valor minimo es "+min);
	}
	
	public void Ejercicio9(Scanner _sc)
	{
		int a,b,c,d,e;
		System.out.println("Filas de la primera matriz");
		a=_sc.nextInt();
		System.out.println("columnas de la primera matriz");
		b=_sc.nextInt();
		System.out.println("Filas de la segunda matriz");
		c=_sc.nextInt();
		System.out.println("columnas de la segunda matriz");
		d=_sc.nextInt();
		int mtrz1[][]=new int[a][b];
		int mtrz2[][]=new int[c][d];
		
		System.out.println("La primera matriz es-->");
		for(int i=0;i<mtrz1.length;i++)
		{
			for(int j=0;j<mtrz1[i].length;j++)
			{
				mtrz1[i][j]=_sc.nextInt();
				System.out.print(mtrz1[i][j]);
				System.out.print(" ");
			}
			System.out.println("");
		}
		System.out.println("");
		System.out.println("La segunda matriz es-->");
		for(int i=0;i<mtrz2.length;i++)
		{
			for(int j=0;j<mtrz2[i].length;j++)
			{
				mtrz2[i][j]=_sc.nextInt();
				System.out.print(mtrz2[i][j]);
				System.out.print(" ");
			}
			System.out.println("");
		}
		System.out.println("");
		if(a==c && b==d)
		{
			System.out.println("Su suma es");
			for(int i=0;i<mtrz1.length;i++)
			{
				for(int j=0;j<mtrz1[i].length;j++)
				{
					e=mtrz1[i][j]+mtrz2[i][j];
					System.out.print(e);
					System.out.print(" ");
				}
				System.out.println("");
			}
		}
		else
		{
			System.out.println("No se pueden sumar");
		}
	}
	
	public void Ejercicio10(Scanner _sc) 
	{
		int mtrz1[][]=new int[4][4];
		int mtrz2[][]=new int[4][4];
		int mtrz3[][]=new int[4][4];
	
		System.out.println("La primera matriz es-->");
		for(int i=0;i<mtrz1.length;i++)
		{
			for(int j=0;j<mtrz1[i].length;j++)
			{
				mtrz1[i][j]=rd.nextInt(10);
				System.out.print(mtrz1[i][j]);
				System.out.print(" ");
			}
			System.out.println("");
		}
		System.out.println("");
		System.out.println("La segunda matriz es-->");
		for(int i=0;i<mtrz2.length;i++)
		{
			for(int j=0;j<mtrz2[i].length;j++)
			{
				mtrz2[i][j]=rd.nextInt(10);
				System.out.print(mtrz2[i][j]);
				System.out.print(" ");
			}
			System.out.println("");
		}
		System.out.println("");
		System.out.println("Su suma es");
		for(int i=0;i<mtrz1.length;i++)
		{
			for(int j=0;j<mtrz1[i].length;j++)
			{
				mtrz3[i][j]=mtrz1[i][j]+mtrz2[i][j];
				System.out.print(mtrz3[i][j]);
				System.out.print(" ");
			}
			System.out.println("");
		}
	}

	public void Ejercicio11(Scanner _sc)
	{
		int a,b,c,d,e;
		System.out.println("Filas de la primera matriz");
		a=_sc.nextInt();
		System.out.println("columnas de la primera matriz");
		b=_sc.nextInt();
		System.out.println("Filas de la segunda matriz");
		c=_sc.nextInt();
		System.out.println("columnas de la segunda matriz");
		d=_sc.nextInt();
		int mtrz1[][]=new int[a][b];
		int mtrz2[][]=new int[c][d];
		
		System.out.println("La primera matriz es-->");
		for(int i=0;i<mtrz1.length;i++)
		{
			for(int j=0;j<mtrz1[i].length;j++)
			{
				mtrz1[i][j]=_sc.nextInt();
				System.out.print(mtrz1[i][j]);
				System.out.print(" ");
			}
			System.out.println("");
		}
		System.out.println("");
		System.out.println("La segunda matriz es-->");
		for(int i=0;i<mtrz2.length;i++)
		{
			for(int j=0;j<mtrz2[i].length;j++)
			{
				mtrz2[i][j]=_sc.nextInt();
				System.out.print(mtrz2[i][j]);
				System.out.print(" ");
			}
			System.out.println("");
		}
		System.out.println("");
		if(a==c && b==d)
		{
			System.out.println("Su resta es");
			for(int i=0;i<mtrz1.length;i++)
			{
				for(int j=0;j<mtrz1[i].length;j++)
				{
					e=mtrz1[i][j]+mtrz2[i][j];
					System.out.print(e);
					System.out.print(" ");
				}
				System.out.println("");
			}
		}
		else
		{
			System.out.println("No se pueden restar");
		}
	}
	
	public void Ejercicio12()
	{
		int mtrz1[][]=new int[2][3];
		int mtrz2[][]=new int[3][2];
		int mtrz3[][]=new int[2][2];
		System.out.println("La primera matriz es-->");
		for(int i=0;i<mtrz1.length;i++)
		{
			for(int j=0;j<mtrz1[i].length;j++)
			{
				mtrz1[i][j]=rd.nextInt(10);
				System.out.print(mtrz1[i][j]);
				System.out.print(" ");
			}
			System.out.println("");
		}
		System.out.println("");
		System.out.println("La segunda matriz es-->");
		for(int i=0;i<mtrz2.length;i++)
		{
			for(int j=0;j<mtrz2[i].length;j++)
			{
				mtrz2[i][j]=rd.nextInt(10);
				System.out.print(mtrz2[i][j]);
				System.out.print(" ");
			}
			System.out.println("");
		}
		System.out.println("");
		System.out.println("Su multiplicacion es");
		for(int i=0;i<mtrz3.length;i++)
		{
		}
	}
	
	public void Ejercicio13()
	{
		int fila=0, columna1=0, columna2=0, columna3=0, columna4=0, columna5=0;
		int mtrz[][]=new int[4][5];
		System.out.println("La matriz es-->");
		for(int i=0;i<mtrz.length;i++)
		{
			boolean c1=true,c2=true,c3=true,c4=true,c5=true;
			for(int j=0;j<mtrz[i].length;j++)
			{
				
				mtrz[i][j]=rd.nextInt(10);
				fila=fila+mtrz[i][j];
				System.out.print(mtrz[i][j]);
				System.out.print(" ");
				if(c1==true)
				{
					columna1=columna1+mtrz[i][j];
					c1=false;
				}
				else
					if(c2==true)
					{
						columna2=columna2+mtrz[i][j];
						c2=false;
					}else
					if(c3==true)
					{
						columna3=columna3+mtrz[i][j];
						c3=false;
					}else
				if(c4==true)
				{
					columna4=columna4+mtrz[i][j];
					c4=false;
				}else
				if(c5==true)
				{
					columna5=columna5+mtrz[i][j];
					c5=false;
				}
			}
			System.out.print(fila);
			fila=0;
			System.out.println("");
			
		}
		System.out.print(columna1+" "+columna2+" "+columna3+" "+columna4+" "+columna5);
	}
	
	
}
