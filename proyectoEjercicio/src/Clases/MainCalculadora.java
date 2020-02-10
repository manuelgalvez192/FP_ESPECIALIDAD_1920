package Clases;
import java.util.Scanner;
public class MainCalculadora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner (System.in);
		Calculadora op=new Calculadora();
		int menu;
		
		for(int i=1;i==1;)
		{
			System.out.println("1-Operar");
			System.out.println("2-Ans");
			System.out.println("3-Salir");
			menu=sc.nextInt();
			switch(menu)
			{
			case 1:
				sc.nextLine();
				System.out.println("Elige operando1");
				op.setOperando1(Double.valueOf( sc.nextLine()));
				System.out.println("Elige operacion");
				op.setOperacion(sc.nextLine());
				System.out.println("Elige operando2");
				op.setOperando1(Double.valueOf(sc.nextLine()));
				op.getResultado();
				break;
			case 2:
				if(op.estadoAns==false)
				{
					System.out.println("No se ha realizado ninguna operacion");
				}else 
				{
					op.setOperando1(Double.valueOf( sc.nextLine()));
					op.setOperacion(sc.nextLine());
					op.setOperando1(Double.valueOf(sc.nextLine()));
					op.getResultado();
				}
				break;
			case 3:
				System.out.println("FIN");
				i=2;
				break;
			}
		}
		
	}

}
