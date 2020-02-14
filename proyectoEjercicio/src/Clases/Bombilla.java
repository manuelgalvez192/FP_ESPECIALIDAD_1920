package Clases;
import java.util.Scanner;
public class Bombilla {

	//static si es false es false para todos los objetos
	static boolean interruptorGeneral=false;
	public boolean interruptorBombilla=false;
	int ID;
	static int contador=0;
	public Bombilla() {
		this.ID=contador;
		contador++;
	}
	
	public void encenderGeneral(Scanner _sc)
	{
		while(interruptorGeneral==false)
		{
			System.out.println("¿Quieres encender el general?Si=1,No=0");
			int estado=_sc.nextInt();
			if(estado==1)
			{
				interruptorGeneral=true;
				System.out.println("Esta encendido");
			 }
			 else
			 {
				 System.out.println("Esta apagado");
			 }
		}
	}
	
	public void encenderBombilla(Scanner _sc)
	{
		boolean estado=true;
		if(estado==true)
		{
			interruptorBombilla=true;
			System.out.println("Esta encendida");
		}
	}
}
	

