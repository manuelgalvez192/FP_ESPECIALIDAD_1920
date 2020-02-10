package Clases;
import java.util.Scanner;
public class Calculadora {

	
	/*
		Valores decimales a la hora de seleccionar una operación
		Resultado de las operaciones puede dar error
		No se pueden introducir valores decimales independientemete dl tipo que sea, es decir, 
		si los entras con un punto peta
	*/
	public double operando1;
	public double operando2;
	public double resultado;
	public boolean estadoAns=false;
	public String operacion;
	
	public void setOperando1(double operando1)
	{
		this.operando1 = operando1;
	}
	
	public void setOperando2(double operando2)
	{
		this.operando2 = operando2;
	}
	
	public void setOperacion(String operacion)
	{
		this.operacion = operacion;
	}
	
	public double getResultado()
	{
		if(operacion.contentEquals("+"))
		{
		resultado=operando1+operando2;
		System.out.println("Resultado = "+resultado);
		}else
			if(operacion.contentEquals("-"))
			{
				resultado=operando1-operando2;
				System.out.println("Resultado = "+resultado);
			}else
				if(operacion.contentEquals("*"))
				{
					resultado=operando1*operando2;
					System.out.println("Resultado = "+resultado);
				}else
					if(operacion.contentEquals("/"))
					{
						if(operando2==0)
						{
							System.out.println("No se puede dividir entre 0");
						}else 
						{
						resultado=operando1/operando2;
						System.out.println("Resultado = "+resultado);
						}
					}else
					{
						System.out.println("Esa opreacion no esta contemplada");
					}
		estadoAns=true;
		return resultado;
	}
	
	public double getAns()
	{
		operando1=resultado;
		
		return operando1;
	}
	
	
	
}
