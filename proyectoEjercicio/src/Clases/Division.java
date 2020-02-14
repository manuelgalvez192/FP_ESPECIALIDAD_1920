package Clases;

public class Division extends Operaciones{
	
	public void setDivision()
	{
		double contador=0;
		while(operando1>=operando2)
		{
			contador++;
			operando1=operando1-operando2;
			
		}
		
		 resultado=contador;
		
	}
	
	
	
}
