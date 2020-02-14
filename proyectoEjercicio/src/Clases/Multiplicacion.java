package Clases;

public class Multiplicacion extends Operaciones{

	double contador;
	
	public void setMultiplicacion()
	{
		double multiplicacion=operando1;
		if (operando1==0 || operando2==0) {
			resultado=0;
		}else {
			if(operando1<0 && operando2<0)
			{
				operando1=(-operando1);
				operando2=(-operando2);
			}
		for(int i=0;i<operando2-1;i++) 
		{
			multiplicacion=multiplicacion+operando1;
		}
			}
		resultado=multiplicacion;
	}
	
	}
	
	

