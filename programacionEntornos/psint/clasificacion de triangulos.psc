Algoritmo Clasificacion_triangulos
	Definir n Como Entero;
	Definir m Como Entero;
	Definir � Como Entero;
	
	Leer n, m, �;
	
	Si (n = m) y (m = �) y (n = �) Entonces
		Escribir "soy equilatero";
	FinSi
	Si (n=m y �<>m y �<>n) o (n<>m y m<>� y �=n) o (n<>m y n<>� y m=�)  Entonces
		Escribir "soy is�sceles"
	FinSi
	Si (n<>m) y (m<>�) y (�<>n) Entonces
		Escribir "soy escaleno"
	FinSi
	
FinAlgoritmo
