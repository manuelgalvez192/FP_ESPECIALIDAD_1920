package Clases;


public class Operaciones {

	static double operando1;//¿Seguro? ¿Es necesario para los tres atributos?
	static double operando2;
	static double resultado;
	//Lo mismo  para guardar el código de operación te viene bien para un método toString() => devuelve una cadena con el formato de salida.
	
	public void darValor1(String op1)
	{
		operando1 = Double.parseDouble(op1);
	}
	
	public void darValor2(String op2)
	{
		operando2 = Double.parseDouble(op2);
	}
	
	public double getResultado()
	{
		return resultado;
	}
	
	public void reiniciaResultado()
	{
		resultado=0;
	}
	
	public void resultadoOperando()
	{
		operando1=resultado;
	}
	
	
	
}
