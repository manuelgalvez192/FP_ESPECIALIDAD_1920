package ejercicios;
import java.util.Scanner;
public class MainOrdenacion 
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub 
		int op;
		int n;
		Scanner sc = new Scanner(System.in);	
		System.out.println("Elige metodo");
		op=sc.nextInt();
		System.out.println("Da el tamaño del array");
		n=sc.nextInt();
		int arr[] = new int[n];
		switch(op)
		{
		case 1:
			long inicio = System.currentTimeMillis();
			Seleccion(arr, n);
			long fin = System.currentTimeMillis();
			System.out.println("El tiempo del primero es = "+(fin-inicio));
			break;
		case 2:
			long inicio2 = System.currentTimeMillis();
			Insercion(arr,n);
			long fin2 = System.currentTimeMillis();
			System.out.println("El tiempo del segundo es = "+(fin2-inicio2));
			break;
		case 3:
			long inicio3 = System.currentTimeMillis();
			Burbuja(arr, n);
			long fin3 = System.currentTimeMillis();
			System.out.println("El tiempo del tercero es = "+(fin3-inicio3));
			break;
		case 4:
			long inicio4 = System.currentTimeMillis();
			Quicksort(arr,0,arr.length-1);
			long fin4 = System.currentTimeMillis();
			System.out.println("El tiempo del tercero es = "+(fin4-inicio4));
			break;
		case 5:
			long inicio5 = System.currentTimeMillis();
			Lineal(arr,n);
			long fin5 = System.currentTimeMillis();
			System.out.println("El tiempo del tercero es = "+(fin5-inicio5));
			break;	
		}

		
		
		sc.close();
		
	}
	
	public static void Seleccion(int _arr[], int n)
	{
		int i,j,aux;
		for(i=0;i<n-1;i++)
		{
			for(j=i+1;j>=n;j++)
			{
				if(_arr[j]<_arr[i])
				{
					aux=_arr[j];
					_arr[j]=_arr[i];
					_arr[i]=aux;
				}
			}
		}
	}
	
	public static void Insercion(int _arr[], int n)
	{
		int i,j,aux;
		for(i=1;i<=n;i++)
		{
			aux=_arr[i];
			j=i-1;
			while((j>=0) && (aux<_arr[j]))
			{
				_arr[j+1]=_arr[j];
				j--;
			}
			_arr[j+1]=aux;
		}
	}
	
	public static void Burbuja (int _arr[], int n)
	{
		int i,aux,j;
		for(i=1;i<n-1;i++)
		{
			for(j=0;j<n-i-1;j++)
			{
				if(_arr[j]>_arr[j+1])
				{
					aux=_arr[j];
					_arr[j]=_arr[j+1];
					_arr[j+1]=aux;
				}
			}
		}
	}
	
	public static void Quicksort(int _arr[], int inf, int sup)
	{
		int i,j,x,aux;
		i=inf;
		j=sup;
		x=_arr[(inf+sup)/2];
		while(i<=j)
		{
			while(_arr[i]<x)
			{
				i++;
			}
			while(_arr[j]>x)
			{
				j--;
			}
			if(i<=j)
			{
				aux=_arr[i];
				_arr[i]=_arr[j];
				_arr[j]=aux;
				i++;
				j--;
			}
		}
		if(inf<j)
		{
			Quicksort(_arr,inf,j);
		}
		if(i<sup)
		{
			Quicksort(_arr,i,sup);
		}
	}
	
	public static void Lineal(int _arr[],int n)
	{
		
	}
}
