package Clases;
import javax.swing.JOptionPane;
import java.util.Scanner;
public class CalculadoraHerencia {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner (System.in);
		Suma sum = new Suma();
		Division div = new Division();
		String[] opciones = new String[] {"Suma", "Resta", "Multiplicacion", "Division", "Reiniciar", "Salir"};
		
		int opcion = JOptionPane.showOptionDialog(
				null,
				"¿Que operacion desea realizar?",
				"Calculadora",
				JOptionPane.DEFAULT_OPTION,
				JOptionPane.INFORMATION_MESSAGE,
				null,
				opciones,
				null);
		
		String op1 = JOptionPane.showInputDialog("Elige el primer operando: ");
		String op2 = JOptionPane.showInputDialog("Elige el segundo operando: ");
		switch(opcion)
		{
			case 0:
				
				
				break;
		}
		
	}

}
