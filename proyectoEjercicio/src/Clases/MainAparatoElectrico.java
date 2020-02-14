package Clases;
import java.util.Scanner;
public class MainAparatoElectrico {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		AparatoElectrico[] central = new AparatoElectrico[5];
		//aE[0]=new AparatoElectrico();
		int op;
		int aparato;
		int consumoGeneral=0;
		
		for(int i=0;i<central.length;i++)
		{
			central[i]=new AparatoElectrico();
		}
		
		for(int i=1;i==1;)
		{
			System.out.println("1. Ver Consumo");
			System.out.println("2. Encender Aparato");
			System.out.println("3. Apagar Aparato");
			System.out.println("4. Salir");
			op=sc.nextInt();
			switch(op)
			{
			case 1:
				System.out.println("El consumo total es "+consumoGeneral);
				break;
			case 2:
				System.out.println("Seleccione del 0 al 4 un aparato a encender");
				aparato=sc.nextInt();
				if(central[aparato].estado==false)
				{
					if(consumoGeneral>=AparatoElectrico.consumoLimite)
					{
						System.out.println("Se pasa del consumo, debes apagar algo");
					}
					else {
					central[aparato].encender();
					consumoGeneral=consumoGeneral+central[aparato].consumo;
					System.out.println("Se ha encendido correctamente");
					}
				}
				else
				{
					System.out.println("Ese aprato ya esta encendido");
				}
				break;
			case 3:
				System.out.println("Seleccione del 0 al 4 un aparato a apagar");
				aparato=sc.nextInt();
				if(central[aparato].estado==true)
				{
					central[aparato].apagar();
					System.out.println("Se ha apagado correctamente");
					consumoGeneral=consumoGeneral-central[aparato].consumo;
				}
				else
				{
					System.out.println("Ese ya esta apagado");
				}
				break;
			case 4:
				System.out.println("FIN");
				i=2;	
				break;	
			}
		}
		sc.close();
		
	}

}
