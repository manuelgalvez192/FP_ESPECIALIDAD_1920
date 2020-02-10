package Clases;

public class AparatoElectrico {

	public boolean estado=false;
	static int consumoLimite;
	public int consumo;
	
	AparatoElectrico()
	{
		consumoLimite=100;
		consumo=25;
		
	}
	
	//getters
	public boolean getEstado() 
	{
		return estado;
	}
	
	public int getConsumo() 
	{
		
		if(getEstado()==true) 
		{
		return consumo;
		}
		else 
		{
			return 0;
		}
	}
	
	public void encender()
	{
		estado=true;
	}
	
	public void apagar()
	{
		estado=false;
	}
	
	
}
