package Clases;

public class Multiplicacion extends Operaciones{

	double contador;
	
	public void setMultiplicacion()
	{
		contador=operando2;
		while(contador>0)
		{
			resultado=operando1+operando1;
			contador--;
		}
	}
	
	
}
