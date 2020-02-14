package Clases;
import java.util.Scanner;
public class MainBombilla {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		Bombilla bombillas[]=new Bombilla[20];
		int x;
		boolean seguir;
		for(int i=0;i<bombillas.length;i++)
		{
			bombillas[i]=new Bombilla();
		}
		bombillas[0].encenderGeneral(sc);
		while(seguir=true)
		{
			System.out.println("Que bombilla quieres encender?");
			for(int i=0;i<bombillas.length;i++)
			{
				System.out.println(bombillas[i].ID);
			}
			x=sc.nextInt();
			bombillas[x].encenderBombilla(sc);
			System.out.println("Quieres encender otra?");
			if(sc.nextInt()==0)
			{
				seguir=false;
			}
			else
			{
				seguir=true;
			}
		}		
		
		//arr[0].encenderBombilla(sc);
		
		
	}
}
