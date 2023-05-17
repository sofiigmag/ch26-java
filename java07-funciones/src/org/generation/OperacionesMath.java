package org.generation;

import java.util.Date;

public class OperacionesMath {
	void sumaEnterosSinRetorno(int a, int b){
		Date date = new Date();//instanciando un objeto de tipo Date
		System.out.printf("%tT %d + %d = %d %n", date, a, b, a+b);
	}

	int sumaEnteros (int a, int b) {
		return a + b;
	}
	
	double sumaFlotantes(double a, double b) {
		return a+b;
	}
	
	// sobrecaarga de métodos (overload)
	// funciones con el mismo nombre pero diferentes paarámetrros
	int suma(int a, int b) {
		return a+b;
	}
	int suma(short a, short b) {
		return a+b;
	}
	
	double suma( double dataA, double dataB) {
		return dataA + dataB;
	}
	
	double suma(double dataA, double dataB, boolean redondear) {
		if (redondear)
			return Math.round(dataA + dataB);
		return dataA + dataB;
	}
	
	// Sobrecarga de un método que realizar la raíz cuadrada de 
	// un valor. Un método retorna como int otros método retorno como double.
    
	double squareRoot(double a) {
		return Math.sqrt(a); 
	}
	
	/**
	 * Obtener la raiz cuadrada de un número
	 * @param a valor a obtener de la raíz cuadrada
	 * @return raiz cuadrada redondeada
	 */
	
	int squareRoot( int a) {
		return (int)(Math.round(Math.sqrt(a)));
	}
	
	
	// Métodos estáticos (Static Method)
	/*
	 * Los métodos estáticos sea asocian a la clase en lugar de la
	 * instancia.
	 * Se pueden invocar sin tener que instanciar el objeto.
	 * 
	 */
	
	static double valorPi() {
		return Math.PI;		
	}
	
	static double piPorNumero( int numero) {
		return numero * valorPi();
	}
	
   
}
