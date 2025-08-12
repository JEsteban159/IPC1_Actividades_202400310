Algoritmo Actividad2
	definir Palabra como Caracter;
	definir Inversa como Caracter;
	Escribir "Ingrese una palabra:"
	leer Palabra;
	
	Para i<-Longitud(Palabra) Hasta 0 Con Paso -1 Hacer
		Inversa<-Inversa+SubCadena(Palabra,i,i);
	Fin Para
	
	Si Palabra = Inversa Entonces
		Escribir "La palabra ",Palabra," es Palindroma."
	SiNo
		Escribir "La palabra ",Palabra," no es Palindroma."
	Fin Si
	
FinAlgoritmo
