package org.generation;

import java.util.Iterator;

public class CicloFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**
		 * Sintaxis:
		 * 
		 * for (expresion_inicial ; comparacion; expresion_final)
		 * 		instruccion;
		 * for (expresion_inicial ; comparacion; expresion_final){
		 * 		instrucciones;
		 * }
		 */
		// Imprimir 5 veces "Hola"
				
		for (int i=1; i <= 5; i++ ) {
			System.out.println("Hola " + i);
		}
	    // Imprime "Hola 6"
		//int j;
		//for (j = 1; j <=4; ++j);
	    //System.out.println("Hola " +j);
		
		// imprimir la tabla de multiplicar del 1 al 3
		/**
		 * 1*1 = 1
		 * 1*10 = 10
		 * 2*1 = 2
		 * 3*10 = 30
		 
		for (int i = 1; i <=3; i++) {
			for (int k = 1; k <=10; k++) { 
				//System.out.println( i + "x" + k+ "=" + (i*k));
				System.out.printf("Tabla %02d * %d = %d %n", i, k, i*k);
				System.out.printf("Tabla %02d * %02d = 0x%03x %n", i, k, i*k);
			}
			
		}
		*/
		
		int iteraciones = 1;
		for ( ; ; ) {
			if (iteraciones > 5) break;
			System.out.println("Iteración: " + iteraciones ++);
		}
		
		outerLoop:
			for (int i = 0; i < 5; i++) {
				for (int j = 0; j < 5; j++) {
					System.out.println(i + " "+j);
					if ( i == 2 && j == 2) continue outerLoop;
				} 
			}
		// Imprimir los números impares del 1 al 20 
		for (int i = 1; i <= 20; i++) {
            if (i % 2 == 0) {
                continue;
            }
            System.out.println("Numero impar =" + i);
		}
		
		
		boolean bandera = false;
		if ( bandera = true) // se le esta reasignando el valor true
			// y como la condicional es true se ejecuta la instrucción
			System.out.println("Banderita,banderita tricolor");
	}
} 
