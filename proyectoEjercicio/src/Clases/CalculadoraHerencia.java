package Clases;
import javax.swing.JOptionPane;
import java.util.Scanner;
public class CalculadoraHerencia 
{

	public static boolean isValidOperator(String aux)
	{
		boolean isValid = aux.length() > 1; //Partimos de la premisa que tiene que introducir algo, además del \n
		int i = 0;
		while (isValid) 
		{
			if (i < aux.length())
			{
				isValid = Character.isDigit(aux.charAt(i));	
				++i;
			}
			
		}
		return isValid;
	}
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner (System.in);
		Operaciones ope = new Operaciones();
		Suma sum = new Suma();
		Resta res = new Resta();
		Multiplicacion mul = new Multiplicacion();
		Division div = new Division();
		String[] opciones = new String[] {"Suma", "Resta", "Multiplicacion", "Division", "Reiniciar", "Salir"};
		String op1, op2;
		boolean estado = false;
				
		for(int i=1;i==1;)//cámbialo
		{
			int opcion = JOptionPane.showOptionDialog(
					null,
					"¿Que operacion desea realizar?",
					"Calculadora",
					JOptionPane.DEFAULT_OPTION,
					JOptionPane.INFORMATION_MESSAGE,
					null,
					opciones,
					null);
			//1) Según la operación elegida, podremos pedir datos o no
			//2) Al pedir los datos, veremos si es una concatenación de operaciones o no, es decir, 5 + 3 = 8 +5 = 13
			//Entendido?¿
			
				if(opcion!=4 && opcion!=5)
				{
					if(estado==false)
					{
						//isValidOperator(op1)	
						
						op1 = JOptionPane.showInputDialog("Elige el primero operando");
						ope.darValor1(op1);
						estado=true;
					}else
					{
						ope.resultadoOperando();
						JOptionPane.showMessageDialog(null, "El primer operando es: "+ope.getResultado());
					}	
					op2 = JOptionPane.showInputDialog("Elige el segundo operando: ");
					ope.darValor2(op2);
				}
			
			switch(opcion)
			{
				case 0: //Código repetido, problemas => inconsistencia, dificil de mantener,....
					
					sum.setSuma();
					JOptionPane.showMessageDialog(null, "El resultado es: "+sum.getResultado());
					break;
				case 1:
					res.setResta();
					JOptionPane.showMessageDialog(null, "El resultado es: "+res.getResultado());
					break;
				case 2:
					
					mul.setMultiplicacion();
					JOptionPane.showMessageDialog(null, "El resultado es: "+mul.getResultado());
					break;
				case 3:
					
					if(ope.operando2==0)
					{
						JOptionPane.showMessageDialog(null, "Al hacer L'Hopital esto da infinito");
					}else
					{
						
						div.setDivision();
						JOptionPane.showMessageDialog(null, "El resultado es: "+div.getResultado());
					}
					break;
				case 4:
					JOptionPane.showMessageDialog(null, "Se ha reiniciado el resultado");
					estado=false;
					ope.reiniciaResultado();
					break;
				case 5:
					JOptionPane.showMessageDialog(null, "Has salido de la calculadora");
					i=2;	
					break;
			}
			
		}
	
		sc.close();
	}

}
