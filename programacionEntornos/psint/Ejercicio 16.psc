Algoritmo Ejercicio16
	Definir dia Como Entero;
	Definir mes Como Entero;
	Definir a�o Como Entero;
	Escribir "Dime un dia";
	Leer dia;
	Si (dia >=1) y (dia<=31) entonces;
		Escribir "Dime un mes";
		Leer mes;
		Si (mes >=1) y (mes<=12) entonces;
			Escribir "Dime un a�o";
			Leer a�o;
			Si a�o > 0 Entonces
				Si mes = 1 Entonces
					Escribir dia " de enero de " a�o; 
				FinSi
				Si mes = 2 Entonces
					Escribir dia " de febrero de " a�o; 
				FinSi
				Si mes = 3 Entonces
					Escribir dia " de marzo de " a�o; 
				FinSi
				Si mes = 4 Entonces
					Escribir dia " de abril de " a�o; 
				FinSi
				Si mes = 5 Entonces
					Escribir dia " de mayo de " a�o; 
				FinSi
				Si mes = 6 Entonces
					Escribir dia " de junio de " a�o; 
				FinSi
				Si mes = 7 Entonces
					Escribir dia " de julio de " a�o; 
				FinSi
				Si mes = 8 Entonces
					Escribir dia " de agosto de " a�o; 
				FinSi
				Si mes = 9 Entonces
					Escribir dia " de septiembre de " a�o; 
				FinSi
				Si mes = 10 Entonces
					Escribir dia " de obtubre de " a�o; 
				FinSi
				Si mes = 11 Entonces
					Escribir dia " de noviembre de " a�o; 
				FinSi
				Si mes = 12 Entonces
					Escribir dia " de diciembre de " a�o; 
				FinSi
			SiNo
				Escribir "Error"
			FinSi
		FinSi
	FinSi
	
	
	
	
	
FinAlgoritmo
