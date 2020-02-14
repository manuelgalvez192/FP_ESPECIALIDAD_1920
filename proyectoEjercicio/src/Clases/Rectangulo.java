package Clases;

class Rectangulo {

	
	
	public double abscisa1;//X1
	public double ordenada1;//Y1
	public double abscisa2;//X2
	public double ordenada2;//Y2
	private static int numRectangulo=0;//El static hace que esta cualidad la compartan todos los objetos
	private String nombre;
	public static final String nombreFigura="Rectangulo"; 
	public static final double PI=3.1415;
	public static double calcularSuperfice;
	public double calcularPerimetro;
	public double desplazar;
	public static int obtenerNumRectangulo;
	
	public Rectangulo()
	{
		abscisa1=0;
		ordenada1=0;
		abscisa2=0;
		ordenada2=0;
		numRectangulo++;

	}
	
	
	
	public String obtenerNombre()
	{
		return nombre;
	}
	
	public void establecerNombre(String nombre)
	{
		this.nombre=nombre;
	}
	
	final double getPI()
	{
		return PI;
	}
	
	String getNombreFigura()
	{
		return nombreFigura;
	}
	
	String getNombre()
	{
		return nombre;
	}
	
	void setNombre(String m)
	{
		nombre=m;
	}
	
	static int getNumRectangulo()
	{
		return numRectangulo;
	}
	
	double getAbscisa1() 
	{
		return abscisa1;
	}
	
	void setAbscisa1(double x)//
	{
		abscisa1=x;
	}
	
	double getOrdenada1() 
	{
		return ordenada1;
	}
	
	void setOrdenada1(double y)
	{
		ordenada1=y;
	}
	
	double getAbscisa2()
	{
		return abscisa2;
	}
	
	void setAbscisa2(double x)
	{
		abscisa2=x;
	}
	
	double getOrdenada2()
	{
		return ordenada2;
	}
	
	void setOrdenada2(double y)
	{
		ordenada2=y;
	}
	
	public double calcularSuperficie()
	{
		double superficie=0;
		superficie=ordenada2*abscisa2;
		return superficie;
	}
	
	public double calcularPerimetro()
	{
		double perimetro;
		perimetro=((2*ordenada2)+(2*abscisa2));
		return perimetro;
	}
	
	public void desplazar(double desplazarX, double desplazarY)
	{
		abscisa1=abscisa1+desplazarX;
		abscisa2=abscisa2+desplazarX;
		ordenada1=ordenada1+desplazarY;
		ordenada2=ordenada2+desplazarY;
		System.out.println("La X1 se ha desplazado hasta "+abscisa1+" la X2 se ha desplazado hasta "+abscisa2);
		System.out.println("La Y1 se ha desplazado hasta "+ordenada1+" la Y2 se ha desplazado hasta "+ordenada2);
	}
	
	public static int obtenerNumRectangulo()
	{
		return numRectangulo;
	}
	
}
