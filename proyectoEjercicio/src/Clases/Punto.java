package Clases;

public class Punto {

	//Definicion de atributos
	private int abscisa; //EjeX
	private int ordenada;//Eje Y
	//Definicion de metodos
	public Punto()
	{
		abscisa=0;
		ordenada=0;
	}
	
	int getAbscisa() 
	{
		return abscisa;
	}
	
	void setAbscisa(int x)
	{
		abscisa=x;
	}
	int getOrdenada() 
	{
		return ordenada;
	}
	
	void setOrdenada(int y)
	{
		ordenada=y;
	}
	
	public String toString()
	{
		String info="EjeX"+getAbscisa()+"EjeY"+getOrdenada();
		return info;
	}
}